package hu.standapp.investify.model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by flowerpower on 2017. 06. 22..
 */
class InvestmentTest {

    User testUser = new User("mano", "halo", "hali", 100, true);
    MoneyPool moneyPool = new MoneyPool(100, 1000, 50);
    Investment testInvestment = new Investment(testUser, moneyPool, 3, 100, new Date(10000), new Date(10000));

    @Test
    void getPriceAll() {
        assertEquals(testInvestment.getPriceAll(), 300);
    }

    @Test
    void getSharehold() {
        assertEquals(testInvestment.getSharehold(), 3);
    }

    @Test
    void getPrice() {
        assertEquals(testInvestment.getPrice(), 100);
    }

    @Test
    void getStartDate() {
        assertEquals(testInvestment.getStartDate(), new Date(10000));
    }

    @Test
    void getEndDate() {
        assertEquals(testInvestment.getEndDate(), new Date(10000));
    }

    @Test
    void isClosed() {
        assertEquals(testInvestment.isClosed(), false);
    }

}