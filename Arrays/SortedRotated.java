package arrays;

import java.util.Scanner;

/*
 * Given an array of N distinct integers, check if this array is Sorted 
 * (non-increasing or non-decreasing) and Rotated counter-clockwise. 
 * Note that input array may be sorted in either increasing or decreasing order, then rotated.
 * A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation.
 */

class SortedRotated
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int num = sc.nextInt();
		System.out.println();
		int arr[] = new int[num];
		System.out.print("Enter array elements: ");
		for(int i=0;i<num;++i)
			arr[i] = sc.nextInt();
		sc.close();
		System.out.println(checkRotatedAndSorted(arr, num));
	}
	
	
	
	public static boolean checkRotatedAndSorted(int arr[], int num)
	{
		int max=0,min=arr[0],maxpos=0,minpos=0;
	    for(int j=0;j<num;j++)
	    {
	        if(arr[j]>max){
	            max=arr[j];
	            maxpos=j;
	        }
	        if(arr[j]<min)
	        {
	            min=arr[j];
	            minpos=j;
	        }
	    }
	    if(maxpos>minpos)
	    {
	        for(int i=0;i<num-1;i++)
	        {
	            if(arr[i]<arr[i+1])
	            {
	                isRotated(0,i,arr);
	                isRotated(i+1,num-1,arr);
	                break;
	            }
	        }
	        
	        for(int i=1;i<num;i++)
	        {
	            if(arr[i-1]>arr[i])
	                return false;
	        }
	        
	    }
	    else
	    {
	        for(int i=0;i<num-1;i++)
	        {
	            if(arr[i]>arr[i+1])
	            {
	                isRotated(0,i,arr);
	                isRotated(i+1,num-1,arr);
	                break;
	            }
	        }
	        
	        for(int i=1;i<num;i++)
	        {
	            if(arr[i-1]<arr[i])
	                return false;
	        }
	    }
	    return true;
	    
	}
	
	public static void isRotated(int d, int n, int arr[]){
	    int temp;
	    for(int i=d,j=n;i<=j;i++,j--){
	        temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	}
    
}
