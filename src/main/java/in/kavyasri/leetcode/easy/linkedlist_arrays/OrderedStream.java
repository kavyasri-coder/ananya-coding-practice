package in.kavyasri.leetcode.easy.linkedlist_arrays;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream {
    public static void main(String[] args) {
        OrderedStream os = new OrderedStream(5);
        System.out.println(os.insert(3,"cccc"));
        System.out.println(os.insert(1,"aaaa"));
        System.out.println(os.insert(2,"bbbb"));
        System.out.println(os.insert(5,"eeee"));
        System.out.println(os.insert(4,"dddd"));

    }
    private String[] streams;
    private int counter = 0;
    public OrderedStream(int n) {
        streams = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        List<String> stream = new ArrayList<>();
        streams[idKey-1] = value;
        while (counter < streams.length && streams[counter] != null)
        {
            stream.add(streams[counter]);
            counter++;
        }
        return stream;
    }
}