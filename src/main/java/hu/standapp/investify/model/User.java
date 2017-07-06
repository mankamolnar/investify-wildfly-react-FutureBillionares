package hu.standapp.investify.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.security.provider.SHA;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by flowerpower on 2017. 06. 21..
 */
@Entity(name="Users")
public class User {

    /**
     * @param id  of the User.
     * @param name Username for the user.
     * @param password password for the user.
     * @param email of the user.
     * @param cash the amount of virtual money of the User.
     * @param active will be false if user want to delete the account.
     */


    private final static Logger logger = LoggerFactory.getLogger(User.class);

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;
    private String password;
    private String email;
    private int cash;
    private boolean active;
    @OneToMany
    private List<Investment> investment;
    @OneToMany
    private List<Sharehold> shareholds;

    public User() {}

    public User(String name, String password, String email) {
        logger.info("Creating User Object | Name: "+name+", password: *****, Email: "+email);

        this.name = name;
        this.password = password;
        this.email = email;
        this.cash = 0;
        this.active = true;
    }

    /**
     * Basic getters and setters for the User.
     */

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
