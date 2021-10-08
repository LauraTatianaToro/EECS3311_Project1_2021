package shape;

import java.awt.Color;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public abstract class ShapeFactory {

	public static List<Shape> createShapes() {
		List<Shape> shapeList = new ArrayList<Shape>();

		SecureRandom RC = new SecureRandom();

		int x = 1;
		int y = 30;

		for (int i = 0; i < 6; i++) {
			
			//generate random colors
			int r = RC.nextInt();
			int g2 = RC.nextInt();
			int b = RC.nextInt();
			int color = (r + g2 + b) / 3;

			//generate random width and height
			int w = RC.nextInt(70) + 10;
			int h = RC.nextInt(70) + 10;

			Color randomColor = new Color(color);

			//randomly selecting a shape
			int choice = RC.nextInt(3);
			if (choice == 0) {
				Rectangle rectangleShape = new Rectangle(x, y, w, h, randomColor);
				shapeList.add(rectangleShape);
				x = x + 80;
				y = y + 80;

			} else if (choice == 1) {
				Circle circleShape = new Circle(x, y, w, w, randomColor);
				shapeList.add(circleShape);
				x = x + 80;
				y = y + 80;
			} else if (choice == 2) {
				Square squareShape = new Square(x, y, w, w, randomColor);
				shapeList.add(squareShape);
				x = x + 80;
				y = y + 80;
			}

		}

		return shapeList;
	}

}
