package session2;

public class Umgebung {

	public static void main(String[] args) {
		Person person = new Person("Dreier", "Elia", "28.06.1992");
		person.druckeInformation();
		person.mensch(); //dynamsicher aufruf. über referenz eines typs. (konkrete bezeichnung) statische typen sollten nicht über instanz aufgerufen werden. nicht statisch benutzt
		Person.mensch(); // zugriff auf klassentyp 
		
		
		// Aufgabe 2
		Erwachsener erwachsener = new Erwachsener("Müller", "Gerhard", "1.1.1950");
		erwachsener.druckeInformation(); //die Methode gibt es nur in Personen_Klasse
		
		Kind kind = new Kind("Müller", "Felix", "1.1.2010");
		kind.druckeInformation();
		
		// Aufgabe 3
		Person einePerson = new Erwachsener("Müller", "Gerhard", "1.1.1950");
		Person eineWeiterePerson = new Kind("Müller", "Felix", "1.1.2010");
		
		einePerson.volljaehrig();
		eineWeiterePerson.volljaehrig();
	}
}
