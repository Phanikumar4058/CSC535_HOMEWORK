
public class ProgrammingAsignmentWeek4 {
	public static void merge(int[] arr, int lower, int middle, int higher)
	{
		int size = arr.length;
		int[] temper = new int[size];
		for(int i = lower; i<=higher; ++i)
		{
			temper[i] = arr[i];
		}
		int i = lower;
		int j = middle+1;
		int k= lower;
		while( i <=middle && j<=higher)
		{
			if (temper[i] <=temper[j])
			{
				arr[k]=temper[i];
				++i;
			}
			else
			{
				arr[k]= temper[j];
				++j;
			}
			++k;
		}
		while(i<=middle)
		{
			arr[k]= temper[i];
			++k;
			++i;
			}
		}
	public static void mergeSort(int[] arr, int lower, int higher)
	{
		//int size  = arr.length;
		if(lower < higher)
		{
			int middle = (lower + higher)/ 2;
			mergeSort(arr, lower,middle);
			mergeSort(arr,middle+1,higher);
			merge(arr, lower, middle, higher);
		}
	}
	
	
	public static void main(String[] args)
	{
		int size = 9;
		int[] data = new int[]{100,1,20,5,19,17,18,2,100000}; // defining an array
		int lower= 0;
		int higher = 8;
		System.out.println("Before Sorting");
		for(int i=0; i< size; 	++i)
		{
			System.out.println(data[i]);
		}
		mergeSort(data,lower,higher);
		System.out.println();
		System.out.println("After Sorting");
		for (int i=0; i<size; ++i)
		{
			System.out.println(data[i]);
		}
		
	}
}
