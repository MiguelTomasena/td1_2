package td1_2; 

public class Cercle {
	private Point centre;
	private double rayon;	
	public Cercle(Point centre, double rayon){
		this.centre = centre;
		this.rayon = rayon;
	}
	public Cercle(double rayon) {
		this(new Point(),rayon);
	}
	public String toString(){
		return "Cercle de centre " + centre +
				" et rayon " + rayon;
	}
}
