package session3;

public class Palindrom {

	public static boolean istPalindrom(String s) {

		char[] sarray = s.toCharArray();
		
		int length = sarray.length-1;
		
		for (int i=0; i < length*0.5; i++ ){
			if (sarray[i] == sarray[length-i])
			return true;
			
			}
		return false;
	}
	
	public static String revert (String s){
		
		char[] sarray = s.toCharArray();
		int length = sarray.length;
		char[] temp = new char[length];

		for (int i = 0; i < length; i++){
		     temp[i] = sarray[length-1 - i];
		  }
		
		return new String(temp);
	}
	
}

