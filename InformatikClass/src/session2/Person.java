package session2;

public class Person {
	public String name; 
	public String vorname;
	public final String geburtsdatum;
	
	
	public Person(String name, String vorname, String geburtsdatum){
		this.name = name;
		this.vorname = vorname;
		this.geburtsdatum = geburtsdatum;
	}
	
	public static void mensch(){
	System.out.println("Ich bin eine Person?");
	
	}
	public void druckeInformation(){
		System.out.println(name + ", " + vorname +" "+ geburtsdatum);
	}
	
	public void volljaehrig(){
		System.out.println("Ich bin eine Person, entweder volljaehrig oder minderjaehrig.");
	}
}
