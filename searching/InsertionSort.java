package searching;

import java.util.List;

public class InsertionSort implements SortingType{

	@Override
	public void sort(List<Integer> list, int n) {
		System.out.println("Insertion sort done!!");
		int key, j;
		for(int i=1;i<n;i++)
		{
			key = list.get(i);
			j = i-1;
			while(j>=0 && key<list.get(j))
			{
				list.set(j+1, list.get(j));
				j--;
			}
			list.set(j+1, key);
		}
	}

}
