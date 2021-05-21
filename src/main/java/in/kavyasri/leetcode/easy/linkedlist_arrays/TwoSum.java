package in.kavyasri.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[100];

        System.out.println("Enter size of the array");
        int size= scanner.nextInt();

        System.out.println("Enter "+size+" elements of the array");
        for(int i=0;i<size;i++){
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter target of the array");
        int target = scanner.nextInt();
        int a[] =obj.twoSum(nums,target);
        System.out.println("The indices are "+a[0] + " " + a[1]);

    }
    public static int[] twoSum(int[] nums, int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                    return new int[] {i,j};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
