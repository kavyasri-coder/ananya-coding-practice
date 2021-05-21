package in.kavyasri.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

class ShuffleArray {
    public static void main(String[] args) {
        ShuffleArray obj = new ShuffleArray();
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[100];

        System.out.println("Enter size of the array");
        int size = scanner.nextInt();

        System.out.println("Enter " + size + " elements of the array");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter target of the array");
        int target = scanner.nextInt();
        int a[] = obj.shuffle(nums, target);
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]");

    }
    public int[] shuffle(int[] nums, int n) {
        int[] res= new int[nums.length];
        for(int i=0; i<n; i++){
            res[2*i]= nums[i];
            res[2*(i)+1]= nums[n+i];
        }
        return res;
    }
}