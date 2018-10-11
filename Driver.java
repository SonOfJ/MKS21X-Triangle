public class Driver {
	public static void main(String[] args) {
		Point a = new Point(0, 3);
		Point b = new Point(6, 4);
		Point c = new Point(5, 2);
		Point d = new Point(10, 3);
		System.out.println(a.getX());
		System.out.println(b.getY());
		System.out.println(c.distanceTo(b));
		System.out.println(Point.distance(a, c));
		System.out.println(b.toString());
		Triangle King = new Triangle(a, b, c);
		System.out.println(King.getPerimeter());
		System.out.println(King.getVertex(2));
		King.setVertex(0, d);
		System.out.println(King.toString());
	}
}