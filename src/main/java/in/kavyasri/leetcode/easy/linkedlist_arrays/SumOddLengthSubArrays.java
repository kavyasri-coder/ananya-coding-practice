package in.kavyasri.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class SumOddLengthSubArrays {
    public static void main(String[] args) {
        SumOddLengthSubArrays obj = new SumOddLengthSubArrays();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter " + size + " elements of the array");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(obj.sumOddLengthSubarrays(nums));

    }
        public int sumOddLengthSubarrays(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                int temp_sum = 0;
                for (int j = i; j < arr.length; j++) {
                    if ((i + j) % 2 == 0) {
                        for (int k = i; k <= j; k++) {
                            temp_sum = temp_sum + arr[k];
                        }
                    }

                }
                sum = sum + temp_sum;

            }

            return sum;
        }
    }