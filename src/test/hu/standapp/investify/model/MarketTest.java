package test.hu.standapp.investify.model;

import hu.standapp.investify.model.House;
import hu.standapp.investify.model.Market;
import hu.standapp.investify.model.Sharehold;
import hu.standapp.investify.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matyi on 2017.06.22..
 */
class MarketTest {


    User test = new User("mani", "hali", "hu", true);
    House testHouse = new House(1, 1, "h", "h", 1);
    Sharehold testShareHold = new Sharehold(testHouse, test, 1000, 2000, 20);
    Market testMarket = new Market(testShareHold, 5, 1000, null, null);

    @BeforeEach
    void setUp() {
        testMarket.setActive(true);
        testMarket.setShareholdForSale(5);
        testMarket.setPrice(1000);
    }

    @Test
    void getShareholdForSale() {
        assertEquals(5, testMarket.getShareholdForSale());
    }

    @Test
    void setShareholdForSale() {
        testMarket.setShareholdForSale(100);
        assertEquals(100, testMarket.getShareholdForSale());
    }

    @Test
    void getPrice() {
        assertEquals(1000, testMarket.getPrice());
    }

    @Test
    void setPrice() {
        testMarket.setPrice(5);
        assertEquals(5, testMarket.getPrice());
    }

    @Test
    void getStartDate() {
        assertNull(testMarket.getStartDate());
    }

    @Test
    void getEndDate() {
        assertNull(testMarket.getEndDate());
    }

    @Test
    void isActive() {
        assertTrue(testMarket.isActive());
    }

    @Test
    void setActive() {
        testMarket.setActive(false);
        assertFalse(testMarket.isActive());
    }

}