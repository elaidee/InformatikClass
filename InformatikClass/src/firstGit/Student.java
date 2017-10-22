package firstGit;

public class Student {

	//Konstruktor
	public Student(String n, int m) {
		name = n;
		matrikelNummer = m;
	}
	//Attribute:
	private String name;
	private int matrikelNummer;

	
	
	//Operationen (methoden):
	public String getName() {
	
		return name;
		
	}
	
	public int getMatrikelNummer(){
		
		return matrikelNummer;
		
	}

	
	
	
}
