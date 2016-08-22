package LabWork;

import java.util.Random;


public class CodeChllPrintGrid {

	public static void main(String[] args) {
		 int[][] nums = new int[9][9];

	        Random randomNums = new Random();

	        fillRandomArray(nums, randomNums);



	}
	public static void fillRandomArray(int[][] nums, Random randomNums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                int randomVal = randomNums.nextInt(100) + 1;

                nums[i][j] = randomVal;

                System.out.printf("%4d ", nums[i][j]);

            }

            System.out.print("\n");

        }

    }
}
