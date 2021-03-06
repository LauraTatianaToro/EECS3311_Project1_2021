package shape;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {

	public Square(int upperX, int upperY, int width, int height, Color shapeColor) {
		super(upperX, upperY, width, height, shapeColor);
	}

	@Override
	void drawShape(Graphics form) {
		form.fillRect(upperX, upperY, width, height);

	}

	@Override
	public int getArea() {
		int area = width * height;

		return area;

	}

	@Override
	public void move(int x, int y) {
		this.upperX = x;
		this.upperY = y;
	}

}
