package com.test;
import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter wr = new PrintWriter(System.out);
//         String[] arr = br.readLine().split(" ");
//         int N = Integer.parseInt(arr[0]);
//         int Q = Integer.parseInt(arr[1]);
//         String[] arr_Arr = br.readLine().split(" ");
//         int[] Arr = new int[N];
//         for(int i_Arr=0; i_Arr<arr_Arr.length; i_Arr++)
//         {
//         	Arr[i_Arr] = Integer.parseInt(arr_Arr[i_Arr]);
//         }
//         
//         int[] L = new int[Q];
//         int[] R = new int[Q];
//         int[] Val = new int[Q];
//         for(int i_L=0; i_L<Q; i_L++)
//         {
//            String[] temp = br.readLine().split(" ");
//         	L[i_L] = Integer.parseInt(temp[0]);
//         	R[i_L] = Integer.parseInt(temp[1]);
//         	Val[i_L] = Integer.parseInt(temp[2]);
//         	
//         }
    	int[] Arr = {7,7,7,7,7};
    	int Q = 2;
    	int[] L = {2,3};
    	int[] R = {2,3};
    	int[] Val = {4,6};
    	int N = 5;
         
         int[] out = AND_Queries(Arr, Val, L, N, Q, R);
         
         System.out.println("___"+ Arrays.toString(out));
//         System.out.print(out_[0]);
//         for(int i_out_=1; i_out_<out_.length; i_out_++)
//         {
//         	System.out.print(" " + out_[i_out_]);
//         }
//
//         wr.close();
//         br.close();
    }
    static int[] AND_Queries(int[] Arr, int[] Val, int[] L, int N, int Q, int[] R){
        for(int i =0;i<Q;i++){
            for(int j=0;j<Arr.length;j++){
                if(j>=L[i]-1 && j<=R[i]-1){
                    Arr[j]=Arr[j]&Val[i];
                }
            
             }
        }
       return Arr;
    }
}