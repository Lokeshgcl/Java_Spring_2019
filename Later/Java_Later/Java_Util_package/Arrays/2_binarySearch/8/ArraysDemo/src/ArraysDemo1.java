import java.util.Arrays;

public class ArraysDemo1
{

	public static void main(String[] args)
	{

		short[] shortArray = { 10, 5, 8, 90, 50, 40 };

		Arrays.sort(shortArray);

		System.out.println("The sorted int array is:");
		int i = 0;
		for (short number : shortArray)
		{
			System.out.println("Index = " + i + ", Number = " + number);
			++i;
		}

		/*
		 * Searches the specified array of shorts for the specified
		 * value using the binary search algorithm.
		 * 
		 * The array must be sorted (as by the sort(short[]) method)
		 * prior to making this call. If it is not sorted, the results
		 * are undefined.
		 * 
		 * If the array contains multiple elements with the specified
		 * value, there is no guarantee which one will be found.
		 * 
		 * Parameters:
		 * 
		 * a - the array to be searched
		 * 
		 * key - the value to be searched for
		 * 
		 * Returns:
		 * 
		 * index of the search key, if it is contained in the array;
		 * otherwise, (-(insertion point) - 1).
		 */
		short searchKey = 40;
		int indexOfSearchKey = Arrays.binarySearch(shortArray, searchKey);

		System.out.println(
				"indexOfSearchKey " + searchKey + " is =  " + indexOfSearchKey);
	}

}
