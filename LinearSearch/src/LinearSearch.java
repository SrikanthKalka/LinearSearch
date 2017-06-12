/**
 * Step 1: Maintain an array to hold the integer/any Objects.
 * Step 2: Iterate the Array using the for loop, based on the Length.
 * step 3: Inside the loop check the equality of Array element and Key value.
 * Step 4: If you found the position then return from the loop and method as well
 * step 5: If you did not find your search element position then return -1 (i.e value not exist in the Array) 
 * Based on the given key value(Search element)
 * 
 * @author srikanth
 *
 */
public class LinearSearch {

	public static int[] inputArray = { 8, 21, 41, 28, 7, 8, 9, 2, 6 };
	public static int key = 91;

	
	
	/**
	 * int i = 0; i < inputArray.length; i++ 
	 * {Observations: i = 0 to 8 position} but {length is 1 to 8}Hence, we have checked i<inputArray.length
	 * 
	 * If you check i<=inputArray.length, you will get "Array-index-outofbond-error", when it reaches entire array
	 * 
	 * @param inputArray
	 * @param key
	 * @return
	 */
	private int getSearchElementPos(int[] inputArray, int key) {

		for (int i = 0; i < inputArray.length; i++) {

			if (inputArray[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		LinearSearch obj = new LinearSearch();

		System.out.println("The position of the given Key is: "+obj.getSearchElementPos(inputArray, key));

	}
}
