package arrays;

import java.util.Scanner;

/*
 * Given a sorted array of positive integers.
 * Your task is to rearrange the array elements alternatively i.e first element should be max value,
 * second should be min value, third should be second max, fourth should be second min and so on.
 * */
public class AlterenateRearrange 
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
		System.out.print("Array before rearragement: ");
		for(int e: arr)
			System.out.print(e+" ");
		rearrange(arr,n);
	}
	
	
	/*Use Dividend = Divisor * Quotient + Remainder
	 * */
	public static void rearrange(int[] arr, int n)
	{
		int minIndex = 0, maxIndex = n-1, maxElement = arr[n-1]+1;
		
		for(int i=0;i<n;++i)
		{
			if(i%2==0)
				arr[i] += (arr[maxIndex--] % maxElement) * maxElement;
			else
				arr[i] += (arr[minIndex++] % maxElement) * maxElement;
		}
		System.out.println();
		System.out.print("Array after rearrangement: ");
		for(int i=0;i<n;++i)
		{
			arr[i] /= maxElement;
			System.out.print(arr[i]+" ");
		}
	}

}
