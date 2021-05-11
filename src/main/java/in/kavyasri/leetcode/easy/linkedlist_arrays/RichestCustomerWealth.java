package in.kavyasri.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;


public class RichestCustomerWealth {
    public static void main(String[] args) {
        RichestCustomerWealth obj = new RichestCustomerWealth();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(obj.maximumWealth(matrix));
    }
    public int maximumWealth(int[][] accounts) {
            int wealth = 0;
            int maxwealth = 0;

            for(int i = 0; i < accounts.length; i++){
                for(int j = 0; j < accounts[i].length; j++){
                    wealth = wealth + accounts[i][j];
                }
                if(maxwealth<=wealth){
                    maxwealth = wealth;
                }
                wealth = 0;
            }

            return maxwealth;
    }
}
