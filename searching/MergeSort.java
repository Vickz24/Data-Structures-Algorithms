package searching;

import java.util.List;

public class MergeSort implements SortingType{

	@Override
	public void sort(List<Integer> list, int n) {
		
		System.out.println("Merge sort done!!");
		mergeSort(list, 0, n-1);
		
	}
	
	public void mergeSort(List<Integer> list, int l, int r)
	{
		if(l<r)
		{
			int mid = (l+r)/2;
			mergeSort(list, l, mid);
			mergeSort(list, mid+1, r);
			merge(list, l, mid, r);
		}
	}
	
	public void merge(List<Integer> list, int l, int mid, int r)
	{
		int leftSize = mid-l+1;
		int leftList[] = new int[leftSize];
		int rightSize = r-mid;
		int rightList[] = new int[rightSize];
		
		for(int i=0;i<leftSize;i++)
			leftList[i] = list.get(i+l);
		
		for(int i=0;i<rightSize;i++)
			rightList[i] = list.get(mid+1+i);
		
		int i=0,j=0,k=l;
		while(i<leftSize && j<rightSize)
		{
			if(leftList[i]< rightList[j])
				list.set(k++, leftList[i++]);
			else
				list.set(k++, rightList[j++]);
		}
		while(i<leftSize)
		{
			list.set(k++, leftList[i++]);
		}
		
		while(j<rightSize)
		{
			list.set(k++, rightList[j++]);
		}
	}
}