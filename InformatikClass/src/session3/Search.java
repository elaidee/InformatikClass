package session3;
public class Search {
	/**
	 * 
	 * @param find
	 *            Integer to look for
	 * @param array
	 *            Array to search in
	 * @return True if the Integer exists in the array
	 */
	public static boolean naiveSearch(int find, int[] array) {
		for(int i = 0; i < array.length; i++){
			if (array[i] == find)
			return true;		
		}
			return false;					
		}


	/**
	 * 
	 * @param find
	 *            Integer we are looking for
	 * @param array
	 *            Array to search in
	 * @return true if Integer is in array
	 */
	public static boolean binarySearch(int find, int[] array) {
		return false;
	}

	

	/**
	 * 
	 * @param find
	 *            Integer to look for
	 * @param array
	 *            Array to search in
	 * @param left
	 *            Left index to search from
	 * @param right
	 *            Right index to search to
	 * @return
	 */
	public static boolean binarySearch(int find, int[] array, int left, int right) {
		int middle = left +((right-left)/2);
	
		if (array[middle] == find){
					return true;
			}	
		if (left >= right){
			return false;
		}
		if (array[middle] < find){	
			left = middle +1;	
			return binarySearch(find, array, left, right);
			}	
		if (array[middle] > find){
			right = middle -1;
			return binarySearch(find, array, left, right);
			}
		return false;
	}		



	// CHALLENGE
	/**
	 * 
	 * @param find
	 *            Integer to look for
	 * @param array
	 *            Array to search in
	 * @return The position where to Integer is located(-1 when not found)
	 */
	public static int naiveSearchPosition(int find, int[] array) {
		return find;
		// TODO use iteration to find the Integer
	}

	/**
	 * 
	 * @param find
	 *            Integer to look for
	 * @param array
	 *            Array to search in
	 * @return The position where to Integer is located(-1 when not found)
	 */
	public static int binarySearchPostion(int find, int[] array) {
		return find;
		// TODO use binary search and recursion to find the integer
	}
}
