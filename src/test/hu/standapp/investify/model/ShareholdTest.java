package test.hu.standapp.investify.model;

import hu.standapp.investify.model.House;
import hu.standapp.investify.model.Sharehold;
import hu.standapp.investify.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matyi on 2017.06.22..
 */
class ShareholdTest {

    User test = new User("mani", "hali", "hu", true);
    House testHouse = new House(1, 1, "h", "h", 1);
    Sharehold testShareHold = new Sharehold(testHouse, test, 1000, 2000, 20);

    @BeforeEach
    void setUp() {
        testShareHold.setBoughtPrice(1000);
        testShareHold.setSoldPrice(2000);
        testShareHold.setShareHoldTotal(20);
    }

    @Test
    void getBoughtPrice() {
        assertEquals(1000, testShareHold.getBoughtPrice());
    }

    @Test
    void setBoughtPrice() {
        testShareHold.setBoughtPrice(0);
        assertEquals(0, testShareHold.getBoughtPrice());
    }

    @Test
    void getSoldPrice() {
        assertEquals(2000, testShareHold.getSoldPrice());
    }

    @Test
    void setSoldPrice() {
        testShareHold.setSoldPrice(0);
        assertEquals(0, testShareHold.getSoldPrice());
    }

    @Test
    void getShareHoldTotal() {
        assertEquals(20, testShareHold.getShareHoldTotal());
    }

    @Test
    void setShareHoldTotal() {
        testShareHold.setShareHoldTotal(0);
        assertEquals(0, testShareHold.getShareHoldTotal());
    }

}