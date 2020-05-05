package td1_2;
 
public class Test {
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(3.0,0.0);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		double d2 = p2.distance();
		System.out.println("distance de " +
		        p2 + " à l'origine : " + d2);
		double d12 = p1.distance(p2);
		System.out.println("distance de " +
		        p1 + " à " + p2 + " : " + d12);
		Cercle c1 = new Cercle(3.0);
		System.out.println(c1.toString());
		Cercle c2 = new Cercle(p2, 5.0);
		System.out.println(c2.toString());
	}
}
