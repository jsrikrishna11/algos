package week1.tests;


import org.junit.Test;
import week1.LinkedListUtils;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

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

    }
}
