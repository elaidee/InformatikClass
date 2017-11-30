package session4;

public class Umgebung {

	public static void main(String[] args) {

		Rekursion rek = new Rekursion();
		Rekursion pow = new Rekursion();
		Rekursion exp = new Rekursion();

		System.out.println(rek.fac(3));
		System.out.println(pow.power(2.0, 4));
		System.out.println(exp.expN(2.0, 14));

		//hier sehen wir den Fehler des jeweiligen Schrittes der rekursiven Methode 
		//im Vergleich zur von Java zur Verfügung gestellte Exponentialfunktion
		for (int i = 0; i < 50; i++) {
			System.out.print("Stelle: " + i + " exp-Wert: ");
			double value = exp.expN(2.0, i);
			System.out.println(value);
			System.out.print("Error: ");
			System.out.println(Math.exp(2) - value);
			System.out.println("---------------");
		}
				
		int [] x;
		x = new int [10];
		x[0] =5;
		int [] y = {1,2,3};
		int [][] z = new int [3][];
		z[1] = new int [5];
	
		z[0] = new int [5];
		z[2] = new int [5];
		
		 for(int i =0; i < z.length; i++){
			 for(int j = 0; j < z[i].length; j++){
				 z[i][j] = 3;
				 System.out.print(z[i][j]);
				 
			 }
			 System.out.println("\n");
		 }				
	}
}