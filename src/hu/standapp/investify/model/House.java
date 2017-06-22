package hu.standapp.investify.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by flowerpower on 2017. 06. 22..
 */
@Entity
public class House {


    /**
     * @param id of the House.
     * @param area the whole area of the house.
     * @param zipcode of the city.
     * @param adress of the house.
     * @param predictedIncome the foretold income for the house.
     *
     */
    private final static Logger logger = LoggerFactory.getLogger(House.class);

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private int area;
    private int zipCode;
    private String city;
    private String address;
    private int predictedIncome;
    
    public House() {}

    public House(int area, int zipCode, String city, String address, int predictedIncome) {
        logger.info("Creating House Object | Area "+area+", Zip Code: " +zipCode+ ", City: "+city+", Adress: "+address+", Predicted Income: "+predictedIncome);
        this.area = area;
        this.zipCode = zipCode;
        this.city = city;
        this.address = address;
        this.predictedIncome = predictedIncome;
    }

    /**
     * Basic getters and setters for the House.
     *
     */

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPredictedIncome() {
        return predictedIncome;
    }

    public void setPredictedIncome(int predictedIncome) {
        this.predictedIncome = predictedIncome;
    }
}
