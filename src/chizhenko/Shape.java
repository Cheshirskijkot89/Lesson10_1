package chizhenko;

public abstract class Shape {

	private String nameOfFigure;

	public Shape(String nameOfFigure) {
		super();
		this.nameOfFigure = nameOfFigure;
	}

	public Shape() {
		super();
	}

	public String getNameOfFigure() {
		return nameOfFigure;
	}

	public void setNameOfFigure(String nameOfFigure) {
		this.nameOfFigure = nameOfFigure;
	}

	public abstract double getPerimetr();

	public abstract double getArea();

	public double sideLength(Point p1, Point p2) {

		return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
	}

	public boolean figureExist(double[] sides) {

		boolean result = true;
		int repeats = sides.length;
		double sum;
		int counter;
		int first;

		for (double current : sides) {
			if (current <= 0) {
				// return false;
				result = false;
				break;
			}
		}

		if (result == false) {
			return result;
		}

		for (int i = 0; i < repeats; i++) {
			sum = 0;
			counter = 0;
			first = i;
			while (true) {

				if (counter == repeats - 1) {
					result = (sum > sides[first]);
					counter = 0;
					break;
				} else {
					counter++;
					sum = sum + sides[first];
				}

				first = (first == (repeats - 1)) ? 0 : ++first;
			}

			if (result == false) {
				break;
			}
		}

		return result;
	};

	@Override
	public String toString() {
		return "Shape [nameOfFigure=" + nameOfFigure + "]";
	}

}
