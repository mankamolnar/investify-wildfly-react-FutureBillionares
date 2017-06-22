package hu.standapp.investify.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by flowerpower on 2017. 06. 22..
 */
class HousePictureTest {
    House testHouse = new House(12, 2016, "SzentFcknEndre", "Imádomavelőt utca 12", 500);
    HousePicture testHousePicture = new HousePicture(testHouse, "testhouse.png", "nice living room");

    @Test
    void getHouse() {
        assertEquals(testHouse, testHousePicture.getHouse());
    }

    @Test
    void setHouse() {
        House newTestHouse = new House(12, 2016, "SzentFcknEndre", "Imádomavelőt utca 12", 500);
        assertFalse(testHousePicture.getHouse() == newTestHouse);
    }

    @Test
    void getUrl() {
        assertEquals(testHousePicture.getUrl(), "testhouse.png");
    }

    @Test
    void setUrl() {
        testHousePicture.setUrl("haho");
        assertEquals(testHousePicture.getUrl(), "haho");
    }

    @Test
    void getDescription() {
        assertEquals(testHousePicture.getDescription(), "nice living room");
    }

    @Test
    void setDescription() {
        testHousePicture.setDescription("notenksz");
        assertEquals(testHousePicture.getDescription(), "notenksz");
    }

}