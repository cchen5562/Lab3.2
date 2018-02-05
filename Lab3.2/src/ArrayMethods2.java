//Cristina Chen
//Lab 3.2 Merge and Partition

public class ArrayMethods2 
{
	//Pre-Condition: Both list1 and list 2 contain Strings in alphabetical order from a to z
	public static String[] merge(String[] list1, String[] list2)
	{
		//array for each, an empty array that gets filled in
		//psuedo code, start off with both index 0 
		//then compare, whatever is less puts into new array
		//then ++ the less one
		int o = list1.length;
		int p = list2.length;
		new String[] final = {};
		for(int i = 0; i < o - 1; i++)			//first list?
		{
			for(int j = 0; j < p - 1; j++)		//second list?
			{
				if(list2[j].compareTo(list1[i]) > 0)
				{
					
				}
			}
		}
	}
	
	
	
	//public static int partition(int[] list)
	//{
		
	//}
}
