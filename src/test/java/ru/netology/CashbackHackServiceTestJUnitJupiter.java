package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTestJUnitJupiter {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainWhenPurchaseIsLessThanLowLimitForBonus() {
        int expected = 100;
        int actual = service.remain(900);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenPurchaseIsZero() {
        int expected = 1000;
        int actual = service.remain(0);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenPurchaseIsLessThanMinBoundaryForOne() {
        int expected = 1;
        int actual = service.remain(999);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenPurchaseIsMoreThanMinBoundary() {
        int expected = 999;
        int actual = service.remain(1001);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenPurchaseEqualsBoundary() {
        int expected = 0;
        int actual = service.remain(1000);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenPurchaseMultipleBoundary() {
        int expected = 0;
        int actual = service.remain(2000);
        Assertions.assertEquals(actual, expected);
    }
}

