package hu.standapp.investify.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by flowerpower on 2017. 06. 22..
 */
@Entity
public class MoneyPool {
    /**
     * @param id of the MoneyPool.
     * @param payedIn amount of the money paid in by users so far.
     * @param goal the amount what we want to gather.
     * @param shareholdPrice the unit price of the sharehold.
     */

    private final static Logger logger = LoggerFactory.getLogger(MoneyPool.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int payedIn;
    private int goal;
    private int unitPrice;
    private int investors;
    @OneToMany(mappedBy = "moneyPool")
    private List<Investment> investments = new ArrayList<>();

    public MoneyPool() {
    }

    public MoneyPool(int payedIn, int goal, int unitPrice, int investors) {
        logger.info("Creating MoneyPool Object | Payed In: " + payedIn + ", Goal: " + goal + ", Sharehold Price: " + unitPrice);
        this.payedIn = payedIn;
        this.goal = goal;
        this.unitPrice = unitPrice;
        this.investors = investors;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * Basic getters and setter for the MoneyPool.
     */


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

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int shareholdPrice) {
        this.unitPrice = shareholdPrice;
    }

    public int getInvestors() {
        return investors;
    }

    public void setInvestors(int investors) {
        this.investors = investors;
    }

    public List<Investment> getInvestments() {
        return investments;
    }

    public void setInvestments(List<Investment> investments) {
        this.investments = investments;
    }
}
