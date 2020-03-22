package searching;

import java.util.List;

public class SelectionSort implements SortingType{

	@Override
	public void sort(List<Integer> list, int n) 
	{
		System.out.println("Selection sort done!!");
		int min, swap;
		for(int i=0;i<n-1;i++)
		{
			min = i;
			for(int j=i+1;j<n;j++)
			{
				if(list.get(j)<list.get(min))
					min = j;
			}
			swap = list.get(i);
			list.set(i, list.get(min));
			list.set(min, swap);
		}
		
	}

}
