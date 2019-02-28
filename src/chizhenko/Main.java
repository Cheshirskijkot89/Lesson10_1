package chizhenko;

public class Main {

	public static void main(String[] args) {

		Point x1y1 = new Point(-3, -1 , "x1y1");	
		Point x2y2 = new Point(2, 2 , "x2y2");
		Point x3y3 = new Point(4, 1 , "x3y3");
		Point x4y4 = new Point(1, -4 , "x3y3");
		
		Shape tr1 = new Triangle("triangle1", x1y1, x2y2, x3y3);
		Shape qd1 = new Quad("quad1", x1y1, x2y2, x3y3, x4y4);
		Shape cl1 = new Circle("circle1", 10, x1y1);
		
		System.out.println(tr1.toString());
		
		
		double trPer = tr1.getPerimetr();
		
		if (trPer != -1) {
			System.out.print("area = ");
			System.out.printf("%.2f", trPer);
			System.out.println();
		} else {
			System.out.println("triangle does not exist");
		};
		
		double trAr =  tr1.getArea();
		
		if (trAr != -1) {
			System.out.print("area = ");
			System.out.printf("%.2f", trAr);
			System.out.println();
		} else {
			System.out.println("triangle does not exist");
		};
		
		double qdPer = qd1.getPerimetr();
		
		if (trPer != -1) {
			System.out.print("area = ");
			System.out.printf("%.2f", qdPer);
			System.out.println();
		} else {
			System.out.println("quad does not exist");
		};
		
		double qdAr =  qd1.getArea();
		
		if (trAr != -1) {
			System.out.print("area = ");
			System.out.printf("%.2f", qdAr);
			System.out.println();
		} else {
			System.out.println("triangle does not exist");
		};
		

		double clPer = cl1.getPerimetr();
		
		if (trPer != -1) {
			System.out.print("area = ");
			System.out.printf("%.2f", clPer);
			System.out.println();
		} else {
			System.out.println("circle does not exist");
		};
		
		double clAr =  cl1.getArea();
		
		if (trAr != -1) {
			System.out.print("area = ");
			System.out.printf("%.2f", clAr);
			System.out.println();
		} else {
			System.out.println("circle does not exist");
		};

		
		Table tab = new Table();
		tab.setShape(tr1, 0);
		tab.setShape(qd1, 1);
		tab.setShape(cl1, 3);
		
		System.out.println(tab.toString());
	}

}
