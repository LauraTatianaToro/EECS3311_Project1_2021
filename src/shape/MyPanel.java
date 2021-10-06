package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyPanel extends JPanel {
	
	/**
	 * This method creates two rectangles
	 * @return
	 */
	private List<Shape> createThreeRectangles(){
		Color myColor1 = new Color(231, 151, 255);
		Rectangle rectangleShape1 = new Rectangle (1, 1, 44, 48, myColor1);
		   
		Color myColor2 = new Color(13, 151, 200);
		Rectangle rectangleShape2 = new Rectangle (150, 138, 72, 45, myColor2);
		
		Color myColor3 = new Color(13, 20, 150);
		Circle circleShape1 = new Circle (300, 118, 80, 20, myColor3);
		
		List<Shape> shapeList = new ArrayList <Shape>();
		shapeList.add(rectangleShape1);
		shapeList.add(rectangleShape2);
		shapeList.add(circleShape1);

		
		return shapeList;
	}
	
	/**
	 * This method displays the created rectangles.
	 */
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D) g;
      
      //calling the method that creates two shapes (rectangles)
      List<Shape> shapeList = createThreeRectangles();
      
      for (Shape shape: shapeList) {
    	  g2d.setColor(shape.getColor());
    	  shape.drawShape(g2d);
      }
   } 
   
   /**
    * This is the main method of the class.
    * @param args
    */
   public static void main(String[] args) {
      MyPanel rects = new MyPanel();
      JFrame frame = new JFrame("Display three shapes (rectangles)");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
      JButton b=new JButton("Click Here"); 
      b.setBounds(50,1,95,30);  
      frame.add(b);  
      
      
      
      frame.add(rects);
      frame.setSize(600, 600);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      
      
   }
}
