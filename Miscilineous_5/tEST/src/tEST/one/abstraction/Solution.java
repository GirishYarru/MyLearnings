package tEST.one.abstraction;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'calculateAmount' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * INTEGER_ARRAY prices as parameter.
	 */

	public static Integer getMin(List<Integer> list) {
		Integer min = Integer.MAX_VALUE;
		for (Integer i : list) {
			if (min > i) {
				min = i;
			}
		}
		return min;

	}

	public static long calculateAmount(List<Integer> prices) {
		long result = 0;

		for (int i = 0; i < prices.size(); i++) {
			if (i == 0) {
				result = result + prices.get(i);

			} else if (i == 1) {
				if (prices.get(i) > prices.get(0)) {
					result = result + prices.get(i) - prices.get(0);
				} else {
					result = result + prices.get(0) - prices.get(i);

				}

			} else {
				List<Integer> temp = new ArrayList<>();
				for (int j = 0; j < i; j++) {
					temp.add(prices.get(j));
				}
				Integer mini = getMin(temp);
				if (prices.get(i) > mini) {
					result = result + prices.get(i) - mini.longValue();

				}

			}

		}
		return result;
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		int pricesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//		List<Integer> prices = IntStream.range(0, pricesCount).mapToObj(i -> {
//			try {
//				return bufferedReader.readLine().replaceAll("\\s+$", "");
//			} catch (IOException ex) {
//				throw new RuntimeException(ex);
//			}
//		}).map(String::trim).map(Integer::parseInt).collect(toList());
//
//		long result = Result.calculateAmount(prices);
//
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
 
	}
}
