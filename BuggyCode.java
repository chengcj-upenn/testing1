
public class BuggyCode {
	public static double avg(int[] array) {
		int x = 0;
		for (int i = 1; i < array.length; i++) {
			array[i] += array[i-1];
		}
		return array[array.length - 1] / array.length;
	}
	
	public static double variance(int[] array) {
		double stuff = avg(array);
		int[] array1 = array;
		for (int i = 0; i < array1.length; i++) {
			array1[i] = array1[i] * array1[i];
		}
		return avg(array) - stuff * stuff;
	}

	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4};
		System.out.println(avg(array));
		System.out.println(variance(array));

	}

}
