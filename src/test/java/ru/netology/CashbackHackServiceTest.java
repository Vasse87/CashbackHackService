package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainWhenPurchaseIsLessThanLowLimitForBonus() {
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenPurchaseIsZero() {
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenPurchaseIsLessThanMinBoundaryForOne() {
        int expected = 1;
        int actual = service.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenPurchaseIsMoreThanMinBoundary() {
        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenPurchaseEqualsBoundary() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenPurchaseMultipleBoundary() {
        int expected = 0;
        int actual = service.remain(2000);
        assertEquals(actual, expected);
    }
}