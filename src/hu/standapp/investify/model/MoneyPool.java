package hu.standapp.investify.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.security.provider.SHA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by flowerpower on 2017. 06. 22..
 */
@Entity
public class MoneyPool {

    private final static Logger logger = LoggerFactory.getLogger(MoneyPool.class);

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private int payedIn;
    private int goal;
    private int shareholdPrice;

    public MoneyPool() {}

    public MoneyPool(int payedIn, int goal, int shareholdPrice) {
        logger.info("Creating MoneyPool Object | Payed In: "+payedIn+", Goal: "+goal+", Sharehold Price: "+shareholdPrice);
        this.payedIn = payedIn;
        this.goal = goal;
        this.shareholdPrice = shareholdPrice;
    }

    public int getPayedIn() {
        return payedIn;
    }

    public void setPayedIn(int payedIn) {
        this.payedIn = payedIn;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getShareholdPrice() {
        return shareholdPrice;
    }

    public void setShareholdPrice(int shareholdPrice) {
        this.shareholdPrice = shareholdPrice;
    }
}
