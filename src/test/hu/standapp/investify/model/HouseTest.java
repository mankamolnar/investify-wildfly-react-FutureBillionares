package hu.standapp.investify.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by flowerpower on 2017. 06. 22..
 */
class HouseTest {

    House testHouse = new House(12, 2016, "SzentFcknEndre", "Imádomavelőt utca 12", 500);

    @Test
    void getArea() {
        assertEquals(testHouse.getArea(), 12);
    }

    @Test
    void setArea() {
        testHouse.setArea(13);
        assertEquals(testHouse.getArea(), 13);
    }

    @Test
    void getZipCode() {
        assertEquals(testHouse.getZipCode(), 2016);
    }

    @Test
    void setZipCode() {
        testHouse.setZipCode(2017);
        assertEquals(testHouse.getZipCode(), 2017);
    }

    @Test
    void getCity() {
        assertEquals(testHouse.getCity(), "SzentFcknEndre");
    }

    @Test
    void setCity() {
        testHouse.setCity("Budapest");
        assertEquals(testHouse.getCity(), "Budapest");
    }

    @Test
    void getAddress() {
        assertEquals(testHouse.getAddress(), "Imádomavelőt utca 12");
    }

    @Test
    void setAddress() {
        testHouse.setAddress("fecske u");
        assertEquals(testHouse.getAddress(), "fecske u");
    }

    @Test
    void getPredictedIncome() {
        assertEquals(testHouse.getPredictedIncome(), 500);
    }

    @Test
    void setPredictedIncome() {
        testHouse.setPredictedIncome(600);
        assertEquals(testHouse.getPredictedIncome(), 600);
    }

}