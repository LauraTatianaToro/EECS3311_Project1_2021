package shape;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

	public Circle(int upperX, int upperY, int width, int height, Color shapeColor) {
		super(upperX, upperY, width, height, shapeColor);
	}

	@Override
	public int getArea() {
		int area = (int) (Math.PI * (height / 2) * (height / 2));

		return area;
	}

	@Override
	public void move(int x, int y) {
		this.upperX = x;
		this.upperY = y;
	}

	@Override
	public void drawShape(Graphics form) {
		form.fillOval(upperX, upperY, width, height);
	}

}
