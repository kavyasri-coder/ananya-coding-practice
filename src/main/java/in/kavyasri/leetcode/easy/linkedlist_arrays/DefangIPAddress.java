package in.kavyasri.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;


public class DefangIPAddress {
    public static void main(String[] args) {
        DefangIPAddress obj = new DefangIPAddress();
        Scanner scanner = new Scanner(System.in);
        System.out.println(obj.defangIPaddr(scanner.next()));
    }
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
