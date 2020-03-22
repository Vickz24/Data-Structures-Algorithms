package searching;

import java.util.List;

public class QuickSort implements SortingType{

	@Override
	public void sort(List<Integer> list, int n) {
		System.out.println("Quick sort done!!");
		quickSort(list, 0, n-1);		
	}
	
	public void quickSort(List<Integer> list, int low, int high)
	{
		if(low<high)
		{
			int part = partition(list, low, high);
			quickSort(list, low, part-1);
			quickSort(list, part+1, high);
		}
	}
	
	public int partition(List<Integer> list, int low, int high)
	{
		int i = low-1, pivot = list.get(high), swap = 0;
		for(int j=low; j<high; j++)
		{
			if(list.get(j)<pivot)
			{
				i++;
				swap = list.get(j);
				list.set(j, list.get(i));
				list.set(i, swap);
			}
		}
		swap = list.get(high);
		list.set(high, list.get(i+1));
		list.set(i+1, swap);
		return i+1;
	}
	

}
