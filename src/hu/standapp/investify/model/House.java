package hu.standapp.investify.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by flowerpower on 2017. 06. 22..
 */
@Entity
public class House {

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
        this.area = area;
        this.zipCode = zipCode;
        this.city = city;
        this.address = address;
        this.predictedIncome = predictedIncome;
    }

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
