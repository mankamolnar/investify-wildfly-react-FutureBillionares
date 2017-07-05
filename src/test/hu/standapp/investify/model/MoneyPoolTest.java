package test.hu.standapp.investify.model;

import hu.standapp.investify.model.MoneyPool;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matyi on 2017.06.22..
 */
class MoneyPoolTest {

    MoneyPool testMoneypool = new MoneyPool(400, 1000, 10, 20);

    @BeforeEach
    void setUp() {
        testMoneypool.setGoal(1000);
        testMoneypool.setPayedIn(400);
        testMoneypool.setUnitPrice(10);
    }

    @Test
    void getPayedIn() {
        assertEquals(400, testMoneypool.getPayedIn());
    }

    @Test
    void setPayedIn() {
        testMoneypool.setPayedIn(0);
        assertEquals(0, testMoneypool.getPayedIn());
    }

    @Test
    void getGoal() {
        assertEquals(1000, testMoneypool.getGoal());
    }

    @Test
    void setGoal() {
        testMoneypool.setGoal(999999);
        assertEquals(999999, testMoneypool.getGoal());
    }

    @Test
    void getShareholdPrice() {
        assertEquals(10, testMoneypool.getUnitPrice());
    }

    @Test
    void setShareholdPrice() {
        testMoneypool.setUnitPrice(5);
        assertEquals(5, testMoneypool.getUnitPrice());
    }

}