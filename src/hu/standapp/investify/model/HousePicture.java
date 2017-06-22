package hu.standapp.investify.model;

import javax.persistence.*;

/**
 * Created by flowerpower on 2017. 06. 22..
 */
@Entity
public class HousePicture {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private House house;
    private String url;
    private String description;

    public HousePicture() {}

    public HousePicture(House house, String url, String description) {
        this.house = house;
        this.url = url;
        this.description = description;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
