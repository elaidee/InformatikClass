package session1;

public class Tester {

	public static void main(String[] args) {
		
		Dreieck dreieck = new Dreieck(1.0,2.0,3.0);
		Dreieck zwei = dreieck;
		zwei.a = 5;
		System.out.println(dreieck.a);
	}
}
