package tEST;

/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*; 
*/
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.io.*;
class testing {
    public static void main(String args[] ) throws Exception {
//    	System.out.println("class loader for DNSNameService: "
//				+ sun.net.spi.nameservice.dns.DNSNameService.class
//						.getClassLoader());    
    System.out.println(testing.class.getClassLoader());	
    }
        public static long profit(String price[],int n){
            long total=0;
            int []sp=new int[n];
            sp[n-1]=Integer.parseInt(price[n-1]);
            for(int i=n-2;i>=0;i--)
            {
                if(Integer.parseInt(price[i])>sp[i+1]){
                    sp[i]=Integer.parseInt(price[i]);
                }
                else
                sp[i]=sp[i+1];
            }
            for(int i=0;i<n;i++)
            total+=sp[i]-Integer.parseInt(price[i]);
            return total;
        }
 
    
}
