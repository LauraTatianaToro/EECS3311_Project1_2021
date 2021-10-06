package shape;


import java.awt.Color;
import java.awt.Graphics;


public class Rectangle extends Shape implements Comparable <Rectangle> {
	
	/**
	 * Class's constructor
	 * @param upperX
	 * @param upperY
	 * @param width
	 * @param height
	 * @param shapeColor
	 */
	public Rectangle (int upperX, int upperY, int width, int height, Color shapeColor) {
		super(upperX, upperY, width, height, shapeColor);
		}
	


	@Override
	public int compareTo(Rectangle o) {
		// TODO write the right Java code here to support the comparison
		return 0;
	}
	
	/**
	 * Method to draw a rectangle
	 * @param form
	 */
	
	@Override	
	public void drawShape(Graphics	form) {
		form.fillRect(upperX, upperY, width, height);
	}
	
    

}
