package session1;

public class Umgebung {

	public static void main(String[] args) {
		Dreieck dreieck = new Dreieck(2.0, 3.0, 4.1);
		System.out.println(dreieck.umfang());
		System.out.println(dreieck.flaecheninhalt());
	}
}
