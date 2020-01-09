package com.prgm.test;
class Gfg2 
{ 
    static int countWays(int N) 
    { 
    	int arr[] = {2, 4, 6};
        int count[] = new int[N + 1];
        count[0] = 1;
        for (int i = 1; i <= N; i++) 
            for (int j = 0; j < arr.length; j++) 

                if (i >= arr[j]) 
                    count[i] += count[i - arr[j]]; 
 
        return count[N];  
          
    } 
      
    public static void main(String[] args)  
    { 
        int N = 10; 
        System.out.println("Total number of ways = "
                                    + countWays(N)); 
    } 
} 