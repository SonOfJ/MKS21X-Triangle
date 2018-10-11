public class Point {
	private double x;
	private double y;
	public Point(double X, double Y) {
		x = X;
		y = Y;
	}
	public Point(Point p) {
		x = p.x;
		y = p.y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double distanceTo(Point a) {
		return Math.sqrt((a.getX() - getX()) * (a.getX() - getX()) + (a.getY() - getY()) * (a.getY() - getY()));
	}
	public static double distance(Point a, Point b) {
		return Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
	}
	public String toString() {
		return "(" + getX() + ", " + getY() + ")";
	}
}