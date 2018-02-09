import java.util.Arrays;

//Cristina Chen
//Lab 3.2 Merge and Partition

public class ArrayMethods2 
{
	//testing code
	public static void main(String[] args)
	{
		//testing arrays
		String [] test1 = {"apple", "cucumber", "microsoft", "zorro"};
		String [] test2 = {"banana", "cherry", "mahogany", "oreos", "pinata"};
		int[] test3 = { 3, 4, 2, 7, 12, 22, 0, 1 };
		
		//merge test
		long start = System.nanoTime();
		String[] mergeResult = merge(test1, test2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge test took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(mergeResult)); //should print the array with all words in alpha order
		
		//partition test
/*		start = System.nanoTime();
		int pivotFinalPos = partition(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition test took: " + time + " nanoseconds");
		System.out.println("Final Pivot Position: " + pivotFinalPos); //should print 3
*/		System.out.println(Arrays.toString(test3)); //should have all elements partitioned around the pivot 3
	}
	
	//Pre-Condition: Both list1 and list 2 contain Strings in alphabetical order from a to z
	public static String[] merge(String[] list1, String[] list2)
	{
		//array for each, an empty array that gets filled in
		//psuedo code, start off with both index 0 
		//then compare, whatever is less puts into new array
		//then ++ the less one
		int o = list1.length;
		int p = list2.length;
		String[] list3 = new String[list1.length + list2.length];	//the final array, the one that gets filled in?
		for(int i = 0; i < o - 1; i++)			//first list index, don't need for-loops?
		{
			for(int j = 0; j < p - 1; j++)		//second list index
			{
				//here you would have an if statement that checks if u checked one list already, 
				//e.g if u finish putting all of list1 in list3 then you don't need to check list2
				
				if(list2[j].compareTo(list1[i]) > 0)	//then the one at j goes into the new array
				{
					for(int m = 0; m < (list1.length + list2.length); m++) //index variable for the new array, list3
					{
						list3[m] = list2[j];
					}
				} 
				else 
				{
					for(int m = 0; m < (list1.length + list2.length); m++)
					{
						list3[m] = list2[i];
					}
				}
			}
		} return list3;
	} 
	
	
	//Anything less than or equal to the pivot is before it, anything greater is after
	public static int partition(int[] list)
	{
		//psuedo code, the first index is the pivot
		// then you loop from the other end
		// if it's <= pivot, it swaps
		// if its greater than the pivot it stays on the right
		// goes until the index of pivot = index of the one being checked
		// have a boolean count to check if ur checking from the left or right
		// 	because every time you swap you change the direction being checked
		//should only need one array
		 
		int pivot = list[0];
		int check = list.length - 1;

		while (pivot != check)
		{
			//if pivot index is less than check index
			//every time need to update check value
			if((pivot < check) && (right = true))
			{
				check--;
			}
			
			if((pivot < check) && (right = false))
			{
				swap them
				
			}
			
			if((pivot > check) && (right = true))
			{
				swap them
			}
			
			if((pivot > check) && (right = false))
			{
				check++;
			}
			
			
		}
		
	}


}
