package chizhenko;

public class Circle extends Shape {
	
	private double r;
	
	private Point pointA;
	
	public Circle(String nameOfFigure, double r, Point pointA) {
		super(nameOfFigure);
		this.r = r;
		this.pointA = pointA;
	}

	public Circle(double r, Point pointA) {
		super();
		this.r = r;
		this.pointA = pointA;
	}

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPerimetr() {
		
		double result = -1;

		if (pointA != null && r > 0) {
			result = 2*Math.PI*r;
			System.out.print("perimetr = ");
			System.out.printf("%.2f", result);
			System.out.println();
		} else {
			System.out.println("circle does not exist");
		}
		
		return result;

	}

	@Override
	public double getArea() {
		
		double result = -1;
		
		if (pointA != null && r > 0) {
			result = Math.PI * Math.pow(r, 2);
			//System.out.print("area = ");
			//System.out.printf("%.2f", result);
			//System.out.println();
		} else {
			//System.out.println("circle does not exist");
		}
		
		return result;
		
	}

	@Override
	public String toString() {
		return "Circle [NameOfFigure=" + getNameOfFigure() + "]";
	}

}
