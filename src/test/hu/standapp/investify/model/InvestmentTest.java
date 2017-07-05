package hu.standapp.investify.model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by flowerpower on 2017. 06. 22..
 */
class InvestmentTest {

    User testUser = new User("mano", "halo", "hali");
    MoneyPool moneyPool = new MoneyPool(100, 1000, 50, 20);
    Investment testInvestment = new Investment(testUser, moneyPool, 3, 100, new Date(10000), new Date(10000));

    @Test
    void getPriceAll() {
        assertEquals(testInvestment.getPriceAll(), 300);
    }

    @Test
    void getSharehold() {
        assertEquals(testInvestment.getShareholdAmount(), 3);
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