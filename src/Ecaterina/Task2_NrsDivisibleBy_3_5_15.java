package Ecaterina;

import java.util.ArrayList;

public class Task2_NrsDivisibleBy_3_5_15 {

        /*
        Numbers -- Divisible by 3,5,15

        Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3,5, and 15.
           if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibleBy15' section
           if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibleBy3' section
           if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibleBy5' section

         */

        public static void  divisibleBy3_5_15(int[] nums) {

            ArrayList<Integer> DivisibleBy15 = new ArrayList<>();
            ArrayList<Integer> DivisibleBy3 = new ArrayList<>();
            ArrayList<Integer> DivisibleBy5 = new ArrayList<>();


            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 3 == 0 && nums[i] % 5 == 0) {
                    DivisibleBy15.add(nums[i]);
                } else if (nums[i] % 3 == 0 && nums[i] % 5 != 0) {
                    DivisibleBy3.add(nums[i]);
                } else if (nums[i] % 3 != 0 && nums[i] % 5 == 0) {
                    DivisibleBy5.add(nums[i]);
                }
            }
            System.out.println("DivisibleBy15 = " + DivisibleBy15);
            System.out.println("DivisibleBy3 = " + DivisibleBy3);
            System.out.println("DivisibleBy5 = " + DivisibleBy5);

        }

        public static void main(String[] args) {

            int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

            divisibleBy3_5_15(nums);
        }
}
