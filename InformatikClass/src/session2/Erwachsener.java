package session2;

public class Erwachsener extends Person{
	public Erwachsener(String name, String vorname, String geburtsdatum){
	super(name, vorname, geburtsdatum);
	}
	
	@Override //hilft bei Tippfehlern. Falls Methode falls geschrieben ist, kommt ein Hinweis
	public void volljaehrig(){
		System.out.println("Ich bin volljaehrig.");
	}
}
