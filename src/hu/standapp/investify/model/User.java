package hu.standapp.investify.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by flowerpower on 2017. 06. 21..
 */
@Entity(name="Users")
public class User {

    private final static Logger logger = LoggerFactory.getLogger(User.class);

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;
    private String password;
    private String email;
    private int cash;
    private boolean active;

    public User() {}

    public User(String name, String password, String email, boolean active) {
        logger.info("Creating User Object | Name: "+name+", password: *****, Email: "+email);
        this.name = name;
        this.password = password;
        this.email = email;
        this.cash = 0;
        this.active = active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCash() {
        return cash;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
