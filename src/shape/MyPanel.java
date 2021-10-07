package shape;


import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyPanel extends JPanel implements ActionListener {
	
   MyPanel shapePanel;
   ShapeFactory shapes = new ShapeFactory(); 
   List<Shape>shapeList = shapes.createShapes();
   JButton loadButton, sortButton;

	  
	
   public void paintComponent(Graphics g) {
	  super.paintComponent(g);
      
	  
	  /* make all shapes here, change shape factory to only return New shapetype. 
	   * 
	   * */
	  
	  Graphics2D g2d = (Graphics2D) g;      

      for (Shape shape: shapeList) {
    	  g2d.setColor(shape.getColor());
    	  shape.drawShape(g2d);

      }


      
   } 
   

	   @Override
		public void actionPerformed(ActionEvent e) {

		   if (e.getSource() == loadButton) {
				shapePanel.setVisible(true);

		   }
		   else if(e.getSource() == sortButton) {
			   
			  
				System.out.println(shapeList.get(0).getUpperX());

		   }
			

		   
		}
  
	   

   

   public void createWindow() {
      shapePanel = new MyPanel();
      JFrame frame = new JFrame("Sort shapes!");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
      loadButton = new JButton("Load Shapes"); 
      loadButton.setBounds(145,1,150,30);  
      loadButton.addActionListener(this);
      frame.add(loadButton); 
      
      sortButton = new JButton("Sort Shapes"); 
      sortButton.setBounds(300,1,150,30);  
      sortButton.addActionListener(this);
      shapePanel.add(sortButton);
      
      frame.add(shapePanel);
      shapePanel.setVisible(false);
      frame.setSize(600, 600);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      
      
   }
   
   public static void main(String[] args) {
	   MyPanel mainWindow = new MyPanel();
	   mainWindow.createWindow(); 
	   
   }
}
