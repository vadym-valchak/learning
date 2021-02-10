package generics;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Integer[] intArr = {10, 20, 15, 0, -15, 23, 1};
		
		System.out.println(maxValue(intArr));
	}
	
	private static <T extends Comparable<T>> T maxValue(T[] arr) {
		T max = arr[0];
		for (T temp : arr) {
			if(max.compareTo(temp) == -1) {
				max = temp;
			}
		}
		return max;
	}
}
