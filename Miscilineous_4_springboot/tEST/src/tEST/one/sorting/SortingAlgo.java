package tEST.one.sorting;

public class SortingAlgo {
	// bubble sort - o(n2) compare adjacent
	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	// selection sort -o(n2)// find minimum index and swap
	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
				int temp = arr[min_index];
				arr[min_index] = arr[i];
				arr[i] = temp;

			}
		}
		return arr;
	}

	// merge sort
	public static int[] mergeSort(int[] array) {
		if (array.length <= 1) {
			return array;
		}

		int midpoint = array.length / 2;
		int[] leftArray = new int[midpoint];
		int[] right;
		if (array.length % 2 == 0) {
			right = new int[midpoint];

		} else {
			right = new int[midpoint + 1];

		}
		for (int i = 0; i < midpoint; i++) {
			leftArray[i] = array[i];
		}
		int temp = 0;
		for (int i = midpoint; i < right.length; i++) {
			right[temp] = array[i];
			temp++;
		}
		leftArray = mergeSort(leftArray);
		right = mergeSort(right);
		int[] result = merge(leftArray, right);
		return result;

	}

	private static int[] merge(int[] left, int[] right) {
		int lengthResult = left.length + right.length;
		int[] result = new int[lengthResult];
		int indexL = 0;
		int indexR = 0;
		int indexRes = 0;
		while (indexL < left.length || indexR < right.length) {
			if (indexL < left.length && indexR < right.length) {
				if (left[indexL] <= right[indexR]) {
					result[indexRes] = left[indexL];
					indexL++;
					indexRes++;

				} else {
					result[indexRes] = right[indexR];
					indexRes++;
					indexR++;
				}
			} else if (indexL < left.length) {
				result[indexRes] = left[indexL];
				indexL++;
				indexRes++;

			} else if (indexR < right.length) {
				result[indexRes] = right[indexR];
				indexR++;
				indexRes++;

			}

		}
		return result;
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array = { 20, 15, 30, 5, 75, 40, 100 };
		System.out.println("BubbleSort o(n2)");
		// complexity - o(n2) worst case;
		int[] bubbleSort = bubbleSort(array);
		printArray(bubbleSort);
		System.out.println("Selection sor : o(n2)");
		int[] selectionSort = selectionSort(array);
		printArray(selectionSort);
		System.out.println("Merge sort o(nlogn)");
		int[] mergeSort = mergeSort(array);
		printArray(mergeSort);

	}

}
