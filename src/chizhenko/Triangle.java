package chizhenko;

public class Triangle extends Shape {

	private double a;
	private double b;
	private double c;

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle(String nameOfFigure, Point pointA, Point pointB, Point pointC) {
		super(nameOfFigure);
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public Triangle(Point pointA, Point pointB, Point pointC) {
		super("triangle");
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public Triangle() {
		super("triangle");
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public double getPerimetr() {

		double result = -1;

		a = sideLength(pointA, pointB);
		b = sideLength(pointB, pointC);
		c = sideLength(pointC, pointA);

		double[] sides = { a, b, c };

		if (figureExist(sides)) {
			result = a + b + c;
			System.out.print("perimetr = ");
			System.out.printf("%.2f", result);
			System.out.println();
		} else {
			System.out.println("triangle does not exist");
		}
		
		return result;

	}

	@Override
	public double getArea() {

		double result = -1;
		double p;

		a = sideLength(pointA, pointB);
		b = sideLength(pointB, pointC);
		c = sideLength(pointC, pointA);

		p = (a + b + c) / 2;

		double[] sides = { a, b, c };

		if (figureExist(sides)) {

			result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			//System.out.print("area = ");
			//System.out.printf("%.2f", result);
			//System.out.println();
		} else {
			//System.out.println("triangle does not exist");
		}
		
		return result;

	}

	@Override
	public String toString() {
		return "Triangle [NameOfFigure=" + getNameOfFigure() + "]";
	}

}
