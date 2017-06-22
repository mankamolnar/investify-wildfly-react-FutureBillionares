package hu.standapp.investify.model;

import javax.persistence.*;

/**
 * Created by gombaspeteer on 6/22/17.
 */
@Entity
public class Sharehold {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private House houseId;
    @ManyToOne
    private User userId;
    private int boughtPrice;
    private int soldPrice;
    private int shareHoldTotal;

    public Sharehold(){}

    public Sharehold(House houseId, User userId, int boughtPrice, int soldPrice, int shareHoldTotal){
        this.houseId = houseId;
        this.userId = userId;
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
