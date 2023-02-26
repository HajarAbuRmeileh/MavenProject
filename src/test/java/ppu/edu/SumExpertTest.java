package ppu.edu;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import ppu.edu.SumExpert;

class SumExpertTest {
    @Test
    public void testAddInts() {
        assertEquals(4, SumExpert.add(2, 2));
        assertEquals(10, SumExpert.add(5, 5));
        assertEquals(0, SumExpert.add(0, 0));
        assertEquals(-5, SumExpert.add(0, -5));
        assertEquals(100, SumExpert.add(50, 50));
    }

    @Test
    public void testAddArrayList() {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        assertEquals(15, SumExpert.add(arr1));

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(0);
        arr2.add(0);
        arr2.add(0);
        arr2.add(0);
        arr2.add(0);
        assertEquals(0, SumExpert.add(arr2));

        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        arr3.add(-1);
        arr3.add(2);
        arr3.add(-3);
        arr3.add(4);
        arr3.add(-5);
        assertEquals(-3, SumExpert.add(arr3));
    }

}