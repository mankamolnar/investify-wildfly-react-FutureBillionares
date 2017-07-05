package test.hu.standapp.investify.model;

import hu.standapp.investify.model.House;
import hu.standapp.investify.model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by matyi on 2017.06.22..
 */
class UserTest {


    User test = new User("mani", "hali", "hu");



    @BeforeEach
    void setUp() {
        test.setEmail("hu");
        test.setActive(true);
    }

    @Test
    void getEmail() {
        assertEquals("hu", test.getEmail());
    }

    @Test
    void setEmail() {
        test.setEmail("com");
        assertEquals("com", test.getEmail());
    }

    @Test
    void getCash() {
        assertEquals(0, test.getCash());
    }

    @Test
    void isActive() {
        assertTrue(test.isActive());
    }

    @Test
    void setActive() {
        test.setActive(false);
        assertFalse(test.isActive());
    }
    @Test
    void passWordCheck(){
        boolean x = test.checkPassword("hali");
        assertTrue(x);
    }

}