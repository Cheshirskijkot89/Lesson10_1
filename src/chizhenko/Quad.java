package chizhenko;

public class Quad extends Shape {

	private double a;
	private double b;
	private double c;
	private double d;

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;

	public Quad(String nameOfFigure, Point pointA, Point pointB, Point pointC, Point pointD) {
		super(nameOfFigure);
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
	}

	public Quad(Point pointA, Point pointB, Point pointC, Point pointD) {
		super("quad");
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
	}

	public Quad() {
		super("quad");
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

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
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

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	@Override
	public double getPerimetr() {

		double result = -1;

		a = sideLength(pointA, pointB);
		b = sideLength(pointB, pointC);
		c = sideLength(pointC, pointD);
		d = sideLength(pointD, pointA);

		double[] sides = { a, b, c, d };

		if (figureExist(sides)) {
			result = a + b + c;
			System.out.print("perimetr = ");
			System.out.printf("%.2f", result);
			System.out.println();
		} else {
			System.out.println("quad does not exist");
		}

		return result;
		
	}

	@Override
	public double getArea() {

		double result = -1;
		double p;

		a = sideLength(pointA, pointB);
		b = sideLength(pointB, pointC);
		c = sideLength(pointC, pointD);
		d=  sideLength(pointD, pointA);

		p = (a + b + c + d) / 2;

		double[] sides = { a, b, c, d};

		if (figureExist(sides)) {

			result = Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));
			//System.out.print("area = ");
			//System.out.printf("%.2f", result);
			//System.out.println();
		} else {
			//System.out.println("quad does not exist");
		}

		return result;
		
	}

	@Override
	public String toString() {
		return "Quad [NameOfFigure=" + getNameOfFigure() + "]";
	}
	
	

}
