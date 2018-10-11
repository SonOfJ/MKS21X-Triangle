public class Triangle{
	private Point v1;
	private Point v2;
	private Point v3;
	public Triangle(Point v1, Point v2, Point v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		}
	public Triangle(double ax, double ay, double bx, double by, double cx, double cy) {
		v1 = new Point(ax, ay);
		v2 = new Point(bx, by);
		v3 = new Point(cx, cy);
	}
	public double getPerimeter() {
		 return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
		 }
	public Point getVertex(int num) {
		if (num == 0) {
			return new Point(v1);
		}
		if (num == 1) {
			return new Point(v2);
		} else {
			return new Point(v3);
		}
	}
	public void setVertex(int num, Point a) {
		if (num == 0) {
			v1 = a;
		}
		if (num == 1) {
			v2 = a;
		} else {
			v3 = a;
		}
	}
	public String toString() {
		return "Triangle: A( " + v1.getX() + ", " + v1.getY() + ") B(" + v2.getX() + ", " + v2.getY() + ") C(" + v3.getX() + ", " + v3.getY() + ")";
	}
}