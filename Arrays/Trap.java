/*
 * Given an array arr[] of N non-negative integers representing height of blocks 
 * at index i as Ai where the width of each block is 1. 
 * Compute how much water can be trapped in between blocks after raining.
**/

class Trap{
    
    static int trappingWater(int arr[], int n) { 
        
        // Your code here
        int water=0,lmax=0,rmax=0;
        int[] lMax = new int[n];
        int[] rMax = new int[n];
        
        for(int i=0,j=n-1;i<n;i++,j--)
        {
            if(arr[i]>=lmax)
                lmax=arr[i];
            lMax[i] = lmax;
            if(arr[j]>=rmax)
                rmax=arr[j];
            rMax[j] = rmax;
        }
        for(int i=0;i<n;i++)
        {
            if(lMax[i]>rMax[i])
            {
                water+=rMax[i]-arr[i];
            }
            else
                water+=lMax[i]-arr[i];
        }
        return water;
        
        
    } 
}
