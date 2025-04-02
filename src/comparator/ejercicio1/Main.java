package comparator.ejercicio1;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		// Array de integers
		Integer[] nums = new Integer[20];
		
		// For para rellenar el array
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(1, 101);
		}
		
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(nums, new ComparableNum());
		
		System.out.println(Arrays.toString(nums));
	}

}
