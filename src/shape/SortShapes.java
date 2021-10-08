package shape;

import java.util.List;

public abstract class SortShapes {

	public static List<Shape> Sort(List<Shape> shapeList) {

		if (shapeList != null) {

			boolean sorted = false;
			
			//bubblesort
			while (!sorted) {
				sorted = true;

				int n = shapeList.size();
				for (int j = 0; j < n - 1; j++) {

					if (shapeList.get(j).compareTo(shapeList.get(j + 1)) > 0) {

						// storing temp coords and temp index
						int tempX = shapeList.get(j).getUpperX();
						int tempY = shapeList.get(j).getUpperY();
						Shape temp = shapeList.get(j);

						// swapping coords and indices
						shapeList.get(j).move(shapeList.get(j + 1).getUpperX(), shapeList.get(j + 1).getUpperY());
						shapeList.set(j, shapeList.get(j + 1));
						shapeList.get(j + 1).move(tempX, tempY);
						shapeList.set(j + 1, temp);

						sorted = false;
					}
				}
			}

		} else {
			System.out.println("No shapes to sort.");

		}

		return shapeList;

	}

}
