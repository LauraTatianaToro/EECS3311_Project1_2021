package shape;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Loader extends JPanel {

		
	   List<Shape>shapeList = new ArrayList <Shape> ();
		
	
			public Loader(List<Shape> shapeList) {
				this.shapeList = shapeList;
				
			}
			
	
		   

}
