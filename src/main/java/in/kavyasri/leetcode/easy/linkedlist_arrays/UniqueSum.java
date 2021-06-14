package in.kavyasri.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;


public class UniqueSum {
    public static void main(String[] args) {
        UniqueSum obj = new UniqueSum();
        int arr[] = new int[10];
        arr = obj.sumZero(5);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        if(n%2!=0){
            arr[0]=0;
            for(int i=1;i<n-1;i+=2){
                int val = n-i;
                arr[i] = val;
                arr[i+1] = -arr[i];
            }
        }else{
            for(int i=0;i<n;i+=2){
                arr[i] = n-i;
                arr[i+1] = -(n-i);
            }
        }
        return arr;
    }
}
