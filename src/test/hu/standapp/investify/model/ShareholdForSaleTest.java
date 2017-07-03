package test.hu.standapp.investify.model;

import hu.standapp.investify.model.House;
import hu.standapp.investify.model.ShareholdForSale;
import hu.standapp.investify.model.Sharehold;
import hu.standapp.investify.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matyi on 2017.06.22..
 */
class ShareholdForSaleTest {


    User test = new User("mani", "hali", "hu");
    House testHouse = new House(1, 1, "h", "h", 1);
    Sharehold testShareHold = new Sharehold(testHouse, test, 1000, 2000, 20);
    ShareholdForSale testShareholdForSale = new ShareholdForSale(testShareHold, 5, 1000, null, null);

    @BeforeEach
    void setUp() {
        testShareholdForSale.setActive(true);
        testShareholdForSale.setShareholdForSale(5);
        testShareholdForSale.setPrice(1000);
    }

    @Test
    void getShareholdForSale() {
        assertEquals(5, testShareholdForSale.getShareholdForSale());
    }

    @Test
    void setShareholdForSale() {
        testShareholdForSale.setShareholdForSale(100);
        assertEquals(100, testShareholdForSale.getShareholdForSale());
    }

    @Test
    void getPrice() {
        assertEquals(1000, testShareholdForSale.getPrice());
    }

    @Test
    void setPrice() {
        testShareholdForSale.setPrice(5);
        assertEquals(5, testShareholdForSale.getPrice());
    }

    @Test
    void getStartDate() {
        assertNull(testShareholdForSale.getStartDate());
    }

    @Test
    void getEndDate() {
        assertNull(testShareholdForSale.getEndDate());
    }

    @Test
    void isActive() {
        assertTrue(testShareholdForSale.isActive());
    }

    @Test
    void setActive() {
        testShareholdForSale.setActive(false);
        assertFalse(testShareholdForSale.isActive());
    }

}