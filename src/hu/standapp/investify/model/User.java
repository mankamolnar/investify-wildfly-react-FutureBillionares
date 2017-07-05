package hu.standapp.investify.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
        this.password = passToHash(password);
        this.email = email;
        this.cash = 0;
        this.active = true;
    }


    public String passToHash(String password) {

        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] bytes = md.digest();


            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }

        return generatedPassword;

    }
    public boolean  checkPassword(String enteredPassword){
        boolean isEquals = false;
        String generatedHash = passToHash(enteredPassword);
        if (generatedHash.equals(password)){
            isEquals = true;
        }
        return isEquals;
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
