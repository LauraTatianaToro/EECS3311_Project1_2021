package shape;

import java.awt.Color;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;


public class ShapeFactory {
	
	List<Shape> shapeList = new ArrayList <Shape>();

	
	public List<Shape> createShapes(){
		
	    SecureRandom RC = new SecureRandom();

	    
		
		int x= 1;
        int y= 30;
        
	    for(int i = 0; i < 6; i++)
	    { 
	        int r = RC.nextInt();
	        int g2 = RC.nextInt();
	        int b = RC.nextInt();
	        int color = (r + g2 + b) / 3;

	        int w = RC.nextInt(80);
	        int h = RC.nextInt(80);
	        
	        

	        Color randomColor = new Color(color);

	        int choice = RC.nextInt(3);
	        if(choice == 0)
	        {
	        	Rectangle rectangleShape = new Rectangle (x, y, w, h, randomColor);
	    		shapeList.add(rectangleShape);	  
		         x= x + 80;
		         y= y + 80;
	    		
	        }
	        else if (choice == 1)
	        {
	        	Circle circleShape = new Circle (x, y, w, w, randomColor);
	    		shapeList.add(circleShape);	
		         x= x + 80;
		         y= y + 80;
	        }
	        else if(choice == 2) {
	        	Square squareShape = new Square (x, y, w, w, randomColor);
	    		shapeList.add(squareShape);		
		         x= x + 80;
		         y= y + 80;
	        }
	        

	    }
		
		return shapeList;
	}


	
	
}
