package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * The cost of stock on each day is given in an array A[] of size N. 
 * Find all the days on which you buy and sell the stock so that in between those days your profit is maximum
 */
public class StockBuyAndSell 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		System.out.println();
		int arr[] = new int[n];
		System.out.print("Enter array elements: ");
		for(int i=0;i<n;++i)
			arr[i] = sc.nextInt();
		sc.close();
		getPrice(arr, n);
	}
	
	public static void getPrice(int[] arr, int n)
	{
		List<Integer> localMinima = new ArrayList<>();
		List<Integer> localMaxima = new ArrayList<>();
		for(int i=0;i<n;++i)
		{
			if(i==0 && n>1 && arr[i]<arr[i+1])
				localMinima.add(i);
			
			else if(i==n-1 && n>1 && arr[i]>arr[i-1])
				localMaxima.add(i);
			
			else if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
				localMaxima.add(i);
			
			else if(arr[i]<arr[i+1] && arr[i]<arr[i-1])
				localMinima.add(i);
		}
		if(localMaxima.isEmpty())
		{
			System.out.println("No Profit");
			return;
		}
		else
		{
			for(int i=0;i<localMaxima.size();++i)
			{
				System.out.println("("+localMinima.get(i)+","+localMaxima.get(i)+")");
			}
		}
	}

}
