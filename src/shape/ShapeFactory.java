package shape;

public class ShapeFactory {

	// use getShape method to get object of type shape
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle(0, 0, 0, 0, null);
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle(0, 0, 0, 0, null);
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square(0, 0, 0, 0, null);
		}
		return null;
	}
	
	// todo get areas for each shape for camprison
	// generate random numbers and colors
	// add buttons

}
