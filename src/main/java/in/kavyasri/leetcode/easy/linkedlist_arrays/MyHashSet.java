package in.kavyasri.leetcode.easy.linkedlist_arrays;
import java.util.HashMap;
public class MyHashSet {
    public static void main(String[] args) {
        MyHashSet ms = new MyHashSet();
        System.out.println(ms.add(1));
        System.out.println(ms.add(2));
        System.out.println(ms.contains(1));
        System.out.println(ms.contains(3));
        System.out.println(ms.add(2));
        System.out.println(ms.contains(2));
        System.out.println(ms.remove(2));
        System.out.println(ms.contains(2));

    }
    private HashMap<Integer,Boolean> internalHashMap;

    public MyHashSet() {
        internalHashMap = new HashMap<>();

    }

    public boolean add(int key) {
        internalHashMap.put(key,true);
        return contains(key);
    }

    public boolean remove(int key) {
        internalHashMap.remove(key);
        return contains(key);
    }

    public boolean contains(int key) {

        return internalHashMap.containsKey(key) && internalHashMap.get(key);
    }

}