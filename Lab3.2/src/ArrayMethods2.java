//Cristina Chen
//Lab 3.2 Merge and Partition

public class ArrayMethods2 
{
	//Pre-Condition: Both list1 and list 2 contain Strings in alphabetical order from a to z
/*	public static String[] merge(String[] list1, String[] list2)
	{
		//array for each, an empty array that gets filled in
		//psuedo code, start off with both index 0 
		//then compare, whatever is less puts into new array
		//then ++ the less one
		int o = list1.length;
		int p = list2.length;
		String[] list3 = new String[list1.length + list2.length];	//the final array, the one that gets filled in?
		for(int i = 0; i < o - 1; i++)			//first list index
		{
			for(int j = 0; j < p - 1; j++)		//second list index
			{
				//here you would have an if statement that checks if u checked one list already, 
				//e.g if u finish putting all of list1 in list3 then you dont needa check list2
				
				if(list2[j].compareTo(list1[i]) > 0)	//then the one at j goes into the new array
				{
					for(int m = 0; m < (list1.length + list2.length); m++) //index variable for the new array, list3
					{
						list3[m] = j;
					}
				} 
				else 
				{
					for(int m = 0; m < (list1.length + list2.length); m++)
					{
						list3[m] = i;
					}
				}
			}
		}
	} 
	*/
	
	//Anything less than or equal to the pivot is before it, anything greater is after
	public static int partition(int[] list)
	{
		int pivot = list[0];
		int a = list.length;
		for(int b = 1; b < a - 1; b++)		//index of list?
		{									//would the while loop be first or the for loop?
			int[] list0 = new int[0];		//new array
			while(list0.length < a)			
			{
				//you can make it start at 0, then any big numbers go after it
				list0[0] = pivot;
				//when theres a small number push everything over by one and place it at 0?
				if(list[b] > pivot)
				{
					//position of b goes after pivot?
				}
				else
				if(list[b] <= pivot)
				{
					//position of b goes before pivot --
				}
			} 
		}
		
	}
	

}
