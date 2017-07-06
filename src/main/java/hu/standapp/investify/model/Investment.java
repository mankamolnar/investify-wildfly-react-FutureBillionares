package hu.standapp.investify.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;

/**
 * Created by matyi on 2017.06.22..
 */
@Entity
public class Investment {
    /**
     * @param id of the Investment.
     * @param user , id of the User.
     * @param moneyPool , id of the MoneyPool.
     * @param sharehold the percent what the user bought from the house.
     * @param price the price what the user invest so far.
     * @param startDate the day of the pay in.
     * @param endDate a half year from the startDate.
     * @param closed represents that the user got the house or not.
     */

    private final static Logger logger = LoggerFactory.getLogger(Investment.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private User user;
    @ManyToOne
    private MoneyPool moneyPool;
    @Min(0)
    @Max(100)
    private int shareholdAmount;
    @Min(0)
    private int price;
    private Date startDate;
    private Date endDate;
    private boolean closed;

    public Investment() {
    }

    public Investment(User user, MoneyPool moneypool, int shareholdAmount, int price, Date start, Date end) {
        logger.info("Creating Investment Object | MoneyPool: " + moneypool + ", Sharehold: " + shareholdAmount +
                ", Price: " + price + ", Start Date: " + start + ", End Date: " + end);
        this.user = user;
        this.moneyPool = moneypool;
        this.shareholdAmount = shareholdAmount;
        this.price = price;
        this.startDate = start;
        this.endDate = end;
        this.closed = false;
    }

    /**
     * Basic getters and setters for the Investment.
     */

    public int getPriceAll() {
        return price * shareholdAmount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MoneyPool getMoneyPool() {
        return moneyPool;
    }

    public void setMoneyPool(MoneyPool moneyPool) {
        this.moneyPool = moneyPool;
    }

    public int getShareholdAmount() {
        return shareholdAmount;
    }

    public void setShareholdAmount(int sharehold) {
        this.shareholdAmount = sharehold;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}
