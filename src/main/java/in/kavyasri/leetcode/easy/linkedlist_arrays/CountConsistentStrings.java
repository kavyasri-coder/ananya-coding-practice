package in.kavyasri.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;

public class CountConsistentStrings {
    public static void main(String[] args) {
        CountConsistentStrings obj = new CountConsistentStrings();

        System.out.println(obj.countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));

    }
    public int countConsistentStrings(String allowed, String[] words) {
            int count = words.length;
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words[i].length(); j++) {
                    if (allowed.indexOf(words[i].charAt(j)) == -1) {
                        count--;
                        break;
                    }
                }
            }
            return count;
        }
    }
