package chizhenko;

public class Table {

	private Shape[] tab = new Shape[4];

	public Table() {
		super();
	}

	public Shape[] getTab() {
		return tab;
	}

	public void setShape(Shape pShape, int pos) {
		if ((pos + 1) > tab.length) {
			System.out.println("incorrect index");
		} else if (tab[pos] != null) {
			System.out.println("engaged");
		} else {
			tab[pos] = pShape;
		}

	}

	public void delShape(int pos) {
		if ((pos + 1) > tab.length) {
			System.out.println("incorrect index");
		} else {
			tab[pos] = null;
		}
	}

	@Override
	public String toString() {

		double area = 0;
		String str = "";
		for (Shape i : tab) {

			if (i != null) {
				str = str + i.toString() + "\n";
				area = area + i.getArea();
			} else {
				str = str + "empty \n";
			}

		}
		return str + "total area of all: " + area;
		// return "Table [tab=" + Arrays.toString(tab) + "]";
	}

}
