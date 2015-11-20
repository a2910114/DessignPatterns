package com.mykhaylenko.dessign.numberincrement;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

/**
 * Created by pavlo.mykhaylenko on 11/3/2015.
 */
public class MainTest extends TestCase {

    @Test
    public void testIncrementNumberRange() throws Exception {
        String low = "17.899.9990";
        String high = "17.899.9999";
        List<String> list = Main.incrementNumberRange(low, high);
        assertEquals(list.size(), 10);
    }

    @Test
    public void testIncrementNumberRangeOneNumber() throws Exception {
        String low = "17.899.9999";
        String high = "17.899.9999";
        List<String> list = Main.incrementNumberRange(low, high);
        assertEquals(list.size(), 1);
    }

    @Test
    public void testIncrementNumberRangeTwoNumber() throws Exception {
        String low = "17.899.9998";
        String high = "17.899.9999";
        List<String> list = Main.incrementNumberRange(low, high);
        assertEquals(list.size(), 2);
    }

    @Test
    public void testIncrementNumberRangeEndNumber() throws Exception {
        String low = "16.899.9999";
        String high = "17.200.0003";
        List<String> list = Main.incrementNumberRange(low, high);
        assertEquals(list.size(), 5);
    }

    @Test
    public void testIncrementNumberRangeManyNumber() throws Exception {
        String low = "16.899.0000";
        String high = "16.899.9999";
        List<String> list = Main.incrementNumberRange(low, high);
        assertEquals(list.size(), 10000);
    }

    @Test
    public void testIncrementNumberRangeReverseNumber() throws Exception {
        String low = "17.899.9998";
        String high = "11.200.0003";
        List<String> list = Main.incrementNumberRange(low, high);
        assertEquals(list.size(), 6);
    }
}