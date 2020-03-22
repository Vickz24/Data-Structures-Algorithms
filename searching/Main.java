package searching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Provide the size of array: ");
		int n = sc.nextInt();
		
		System.out.print("Provide the elements of array: ");
		
		for(int i=0;i<n;i++)
			list.add(sc.nextInt());
		sc.close();
		System.out.println("List befor sort: "+list);
		
		SortingType sortType = new SelectionSort();
		sortType.sort(list, n);
		
		System.out.println("Sorted list: "+list);
	}

}
