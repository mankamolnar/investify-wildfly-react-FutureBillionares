package hu.standapp.investify.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by gombaspeteer on 6/22/17.
 */

@Entity
public class Market {

    /**
     * @param id of the Market
     * @param shareholdId , id of hte sharehold.
     * @param shareholdForSale the part of the sharehold that the user want to sale.
     * @param price of the sharehold that the user want to sale.
     * @param startDate the date when the user made the sharhold for sale.
     * @param endDate the date when the sharehold was sold.
     * @param active is the sharehold for sale.
     */


    private final static Logger logger = LoggerFactory.getLogger(Market.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Sharehold sharehold;
    private int shareholdForSale;
    private int price;
    private Date startDate;
    private Date endDate;
    private boolean active;

    public Market (){}

    public Market(Sharehold sharehold, int shareholdForSale, int price, Date startDate, Date endDate){
        logger.info("Creating Market Object | Sharehold: "+sharehold+", Sharehold for sale: "+shareholdForSale+
                ", Price: "+price+", Start date: "+startDate+", End date: "+endDate);
        this.sharehold = sharehold;
        this.shareholdForSale = shareholdForSale;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = true;
    }

    /**
     *Basic getters and setters for the Market
     */

    public int getShareholdForSale() {
        return shareholdForSale;
    }

    public void setShareholdForSale(int shareholdForSale) {
        this.shareholdForSale = shareholdForSale;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
