package com.javaqubes.com;

// This is based on recursion
// Time complexity is : O(log(n))
public class BinarySearch {
	// searching data if found return index otherwise return -1.
	// work on the concept of divide and conquer
	public static int binarySearch(int arr[], int low, int max, int searchItem)
	{
		if (max >= low)
		{
			int mid = low + (max - low)/2;

			// If the element is present at the middle itself
			if (arr[mid] == searchItem)
				return mid;

			// If element is smaller than mid, then it can only be present in left sub-array
			if (arr[mid] > searchItem)
				return binarySearch(arr, low, mid-1, searchItem);

			// Else the element can only be present in right sub-array
			return binarySearch(arr, mid+1, max, searchItem);
		}

		// We reach here when element is not present in array
		return -1;
	}

	// Driver method to test above
	public static void main(String args[])
	{
		// searching data set    
		int[] data = {0,4,7,12,32,44,56,77,89,102,155};
		
		// search item
		int searchItem = 155;
		
		// binarySearch( Array , initial-position, max-position , item to be search)
		int result = binarySearch(data,0,data.length-1,searchItem);
		
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index : " + result);
	}
}
