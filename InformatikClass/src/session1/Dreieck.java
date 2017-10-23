package session1;

public class Dreieck {
	
	double a;
	double b;
	double c;
	double s;
	
	// konstruktor
	public Dreieck(double a, double b, double c){
		this.a  = a;
		this.b = b;
		this.c = c;
		this.s = (a+b+c)/2;
		
	}
	
	public double umfang (){
	return a+b+c;
	}
	
	public double flaecheninhalt () {
		return Math.sqrt((s*(s-a)*(s-b)*(s-c)));
	}

}
