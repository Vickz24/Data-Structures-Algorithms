package searching;

import java.util.List;

public class HeapSort implements SortingType{

	@Override
	public void sort(List<Integer> list, int n) 
	{
		System.out.println("Heap sort done!!");
		for(int i=((n/2)-1);i>=0;i--)	//Starting with((n/2)-1) as this will be the fist non-leaf node from down
			heapify(list, n, i);
		
		for(int i=n-1;i>=0;i--)
		{
			int swap = list.get(0);
			list.set(0, list.get(i));
			list.set(i, swap);
			heapify(list,i,0);
		}
		
	}
	
	public void heapify(List<Integer> list, int n, int i)
	{
		int largest = i;
		int left = (2*i)+1, right = (2*i)+2, swap;
		
		if(left<n && list.get(left)>list.get(largest))
			largest = left;
		
		if(right<n && list.get(right)>list.get(largest))
			largest = right;
		
		if(largest!=i)
		{
			swap = list.get(i);
			list.set(i, list.get(largest));
			list.set(largest, swap);
			heapify(list, n , largest);	//To heapify the tree with the swap
		}
	}
	

}
