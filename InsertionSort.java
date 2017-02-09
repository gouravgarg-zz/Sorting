public class InsertionSort {

	public static void main(String a[]) {
		int[] input = { 10, 34, 2, 56, 7, 67, 88, 42 };
		int[] output = insertionSort(input);
		for (int i : output) {
			System.out.print(i + ", ");
		}
	}

	public static int[] insertionSort(int[] input) {
		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if (input[j] < input[j - 1]) {
					int temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
				}
			}
		}
		return input;

	}
}
