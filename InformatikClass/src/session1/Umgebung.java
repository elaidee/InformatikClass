package session1;

public class Umgebung {

	public static void main(String[] args) {
		Dreieck dreieck = new Dreieck(2.1, 3, 4);
		System.out.println(dreieck.umfang());
		System.out.println(dreieck.flaecheninhalt());
	}
}
