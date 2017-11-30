package session3;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Umgebung {
	
	public static void main(String[] args) {
		

//		int array [] = {0,1,2};
		int generatedArray[] = ArrayGenerator.randomArray(10, 10, 20); // length, low, high
		System.out.print("Test Array: ");
		ArrayGenerator.print(generatedArray);
		int[] sortedArray = ArrayGenerator.sort(generatedArray);
		System.out.print("Sorted Test Array: ");
		ArrayGenerator.print(sortedArray);
		boolean result = Search.binarySearch(15, sortedArray, 0, sortedArray.length-1); // find, array, left, right
		System.out.println("Is find in our array? " + result);
		
		String teststring = "lagerregal";
		boolean isPal = Palindrom.istPalindrom(teststring);
		System.out.println("Is " + teststring +" a Palindrom? " + isPal);
		
		String revertString = "achso";
		String isString = Palindrom.revert(revertString);
		System.out.println(revertString +" reverted gives us: " + isString);
				
		int[] testArray = ArrayGenerator.randomArray(5, 1, 10); // size low high
		ArrayGenerator.print(testArray); // print by using the generated method
		System.out.println(Arrays.toString(testArray)); //direct way. need the import in line 2
	}
}
