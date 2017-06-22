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
public class HousePicture {

    private final static Logger logger = LoggerFactory.getLogger(HousePicture.class);

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private House house;
    @Column(name = "URL")
    private String url;
    @Column(name = "Description")
    private String description;

    public HousePicture() {}

    public HousePicture(House house, String url, String description) {
        logger.info("Creating HousePicture Object | House: "+house+", URL: "+url+", Description: "+description);
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
