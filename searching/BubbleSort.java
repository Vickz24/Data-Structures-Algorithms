package searching;

import java.util.List;

public class BubbleSort implements SortingType{
	
	@Override
	public void sort(List<Integer> list, int n)
	{
		System.out.println("Bubble sort done!!");
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(list.get(j)>list.get(j+1))
				{
					int temp = list.get(j+1);
					list.set(j+1, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
}
	

