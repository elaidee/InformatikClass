package session2;

public class Kind extends Person{
	public Kind(String name, String vorname, String geburtsdatum){
		super(name, vorname, geburtsdatum);
	}
	
	@Override
	public void volljaehrig(){
		System.out.println("Ich bin minderjaehrig.");
	}
}
