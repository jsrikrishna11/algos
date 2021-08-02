package week1.tests;


import org.junit.Test;
import week1.LinkedListUtils;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class LinkedListUtilsTest{
    @Test
    public void insertSortedLogic(){
        LinkedList<Integer> liPass = new LinkedList<>();
        liPass.add(1); liPass.add(4); liPass.add(8); liPass.add(11);
        System.out.println("Passed: " + liPass);
        LinkedList<Integer> liAssert = new LinkedList<>();
        liAssert.add(1);  liAssert.add(4); liAssert.add(5); liAssert.add(8); liAssert.add(11);
        System.out.println("Expected: " + liAssert);
        LinkedListUtils.insertSorted(liPass,5);

        assertEquals( liPass, liAssert);
        liAssert.add(13);
        System.out.println("Passed: " + liPass);
        LinkedListUtils.insertSorted(liPass, 13);
        assertEquals(liPass , liAssert);
        System.out.println("Expected: " + liAssert);
        System.out.println("Got: " + liPass);
    }

    @Test
    public void removeMaxValuesTest(){
        LinkedList<String> li = new LinkedList<>();
        //[z,q,d,s,b,a,z,q,q,s] - 2
        li.add("z"); li.add("a"); li.add("x"); li.add("w"); li.add("z"); li.add("i"); li.add("z");
        li.add("u"); li.add("z"); li.add("a");

        LinkedListUtils.removeMaximumValues(li, 1);
        System.out.println(li);
    }
    @Test
    public void subSequenceTest(){
        LinkedList<Integer> li = new LinkedList<>();
        li.add(1); li.add(2); li.add(1); li.add(2); li.add(6); li.add(5); li.add(9);

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(9);

        boolean result = LinkedListUtils.containsSubsequence(li,l1);
        assertFalse(!result);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(2); l2.add(1); l2.add(2);
        result = LinkedListUtils.containsSubsequence(li,l2);
        assert result == true;
    }
}
