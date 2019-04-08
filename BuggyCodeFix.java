import java.util.Arrays;

public class BuggyCode {
	public static double avg(int[] myArray) {
		// create a copy of the array to avoid overwriting
		int[] array = Arrays.copyOf(myArray, myArray.length);

		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum / array.length;
	}
	
	public static double variance(int[] array) {
		double average = avg(array);
		double vari = 0;
		for (int i = 0; i < array.length; i++) {
			vari = vari + Math.pow((average-array[i]),2);
		}
		return vari / array.length;
	}

	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4};
		System.out.println(avg(array));
		System.out.println(variance(array));

	}
	
}
