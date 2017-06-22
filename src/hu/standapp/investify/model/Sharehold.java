package hu.standapp.investify.model;

import javax.persistence.*;

/**
 * Created by gombaspeteer on 6/22/17.
 */
@Entity
public class Sharehold {
    /**
     * @param id of the Sharehold.
     * @param houseId , id of the house.
     * @param userId , id of the user.
     * @param boughtPrice , the price that the user paid for the sharehold.
     * @param soldPrice , the price that the user get for a the sharehold.
     * @param shareHoldTotal , the percent of the house that the user own.
     */
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

    /**
     *Basic getters and setters for the Sharehold.
     *
     */

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
