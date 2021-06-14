package in.kavyasri.leetcode.easy.linkedlist_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashSetTest {
    @Test
    public void testCorrectOperation(){
        MyHashSet ms = new MyHashSet();
        Assertions.assertEquals(ms.add(1),true);
        Assertions.assertEquals(ms.add(2),true);
        Assertions.assertEquals(ms.contains(1),true);
        Assertions.assertEquals(ms.contains(3),false);
        Assertions.assertEquals(ms.add(2),true);
        Assertions.assertEquals(ms.contains(2),true);
        Assertions.assertEquals(ms.remove(2),false);
        Assertions.assertEquals(ms.contains(2),false);
    }

}