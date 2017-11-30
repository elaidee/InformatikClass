package session3;
import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {
	/**
	 * Print an array to console
	 * 
	 * @param array
	 *            Array to print
	 */
	public static void print(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	/**
	 * 
	 * @param array
	 *            Array to be sorted
	 * @return Sorted version of the input array
	 */
	public static int[] sort(int[] array) {
		Arrays.sort(array);
		return array;
	}

	/**
	 * 
	 * @return Array with 100 Random Integer numbers
	 */
	public static int[] randomArray() {
		return randomArray(100);
	}

	/**
	 * 
	 * @param size
	 *            Size of the generated Array
	 * @return contains numbers in range 0 - 1000
	 */
	public static int[] randomArray(int size) {
		return randomArray(size, 0, 1000);
	}

	/**
	 * 
	 * @param size
	 *            Size of generated Array
	 * @param low
	 *            Lowest possible Integer
	 * @param high
	 *            Highest possible Integer
	 * @return
	 */
	public static int[] randomArray(int size, int low, int high) {
		Random rnd = new Random();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = rnd.nextInt((high - low) + 1) + low;
		}
		return array;

	}

}
