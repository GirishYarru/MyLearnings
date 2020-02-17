import java.util.HashMap;
import java.util.HashSet;

public class FindSum {

	public static void main(String[] args) {
		int sum =16;
		int[] arr = {1, 4, 45,14,1, 6, 10, 8,8 ,16};
		 
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < arr.length; ++i) { 
            int temp = sum - arr[i]; 
            if (hMap.get(temp) != null) { 
                System.out.println("Pair with given sum " + sum + " is (" + i + ", " + hMap.get(temp) + ")"); 
            } 
            hMap.put(arr[i], i);
        } 

	}

}
