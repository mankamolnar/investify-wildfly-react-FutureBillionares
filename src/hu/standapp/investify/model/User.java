package hu.standapp.investify.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;
    private String password;
    private String email;
    private int cash;
    private boolean active;

    public User() {}

    public User(String name, String password, String email, int cash) {
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
