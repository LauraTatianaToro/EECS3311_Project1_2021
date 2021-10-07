package shape;


import java.awt.Color;
import java.awt.Graphics;


public class Rectangle extends Shape  {
	
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
    public double getArea() {
		double area = width * height;

        return area;

    }
	
	@Override
    public void move(int x , int y) {
    	this.upperX = x;
    	this.upperY = y;
    }


	
	@Override	
	public void drawShape(Graphics	form) {
		form.fillRect(upperX, upperY, width, height);
	}
	
	
    

}
