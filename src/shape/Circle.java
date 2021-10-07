package shape;


import java.awt.Color;
import java.awt.Graphics;


public class Circle extends Shape {
	

	public Circle (int upperX, int upperY, int width, int height, Color shapeColor) {
		super(upperX, upperY, width, height, shapeColor);
		}
	

	@Override
    public double getArea() {
		double area = Math.PI * Math.pow(height/2, 2);

        return area;

    }
	

	

	@Override	
	public void drawShape(Graphics	form) {
		form.fillOval(upperX, upperY, width, height);
	}
	


}
