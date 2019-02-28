package chizhenko;

public class Point {

	private double x;
	private double y;
	private String nameOfPoint;

	public Point(double x, double y, String nameOfPoint) {
		super();
		this.x = x;
		this.y = y;
		this.nameOfPoint = nameOfPoint;
	}

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
		this.nameOfPoint = "unknown";
	}

	public Point() {
		super();
		this.nameOfPoint = "unknown";
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getNameOfPoint() {
		return nameOfPoint;
	}

	public void setNameOfPoint(String nameOfPoint) {
		this.nameOfPoint = nameOfPoint;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", nameOfPoint=" + nameOfPoint + "]";
	}

}
