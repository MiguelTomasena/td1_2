package td1_2;

public class Point {
	// attributs
	private double x;
	private double y;	
	// constructeurs
	public Point() {
		this(0.0,0.0);
	}
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	// methodes
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	public double distance(){
		return Math.sqrt(x*x + y*y);
	}
	public double distance(Point p) {
		double dx = this.x - p.x;
		double dy = this.y - p.y;
		return  Math.sqrt(dx*dx + dy*dy);
	}
}
