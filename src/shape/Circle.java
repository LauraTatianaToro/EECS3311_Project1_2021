package shape;


import java.awt.Color;
import java.awt.Graphics;


public class Circle extends Shape implements Comparable <Circle> {
	
	/**
	 * Class's constructor
	 * @param upperX
	 * @param upperY
	 * @param width
	 * @param height
	 * @param shapeColor
	 */
	public Circle (int upperX, int upperY, int width, int height, Color shapeColor) {
		super(upperX, upperY, width, height, shapeColor);
		}
	


	@Override
	public int compareTo(Circle o) {
		// TODO write the right Java code here to support the comparison
		return 0;
	}
	

	@Override	
	public void drawShape(Graphics	form) {
		form.fillOval(upperX, upperY, width, height);
	}
	
    

}
