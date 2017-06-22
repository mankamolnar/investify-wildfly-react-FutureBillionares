package hu.standapp.investify.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.security.provider.SHA;

import javax.persistence.*;

/**
 * Created by gombaspeteer on 6/22/17.
 */
@Entity
public class Sharehold {

    private final static Logger logger = LoggerFactory.getLogger(Sharehold.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private House house;
    @ManyToOne
    private User user;
    private int boughtPrice;
    private int soldPrice;
    private int shareHoldTotal;

    public Sharehold(){}

    public Sharehold(House house, User user, int boughtPrice, int soldPrice, int shareHoldTotal){
        logger.info("Creating Sharehold Object | House: "+house+" User + "+user+", Bought price: "+boughtPrice+
        ", Sold Price: "+soldPrice+", Sharehold total: "+shareHoldTotal);
        this.house = house;
        this.user = user;
        this.boughtPrice = boughtPrice;
        this.soldPrice = soldPrice;
        this.shareHoldTotal = shareHoldTotal;
    }


    public int getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(int boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public int getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(int soldPrice) {
        this.soldPrice = soldPrice;
    }

    public int getShareHoldTotal() {
        return shareHoldTotal;
    }

    public void setShareHoldTotal(int shareHoldTotal) {
        this.shareHoldTotal = shareHoldTotal;
    }
}
