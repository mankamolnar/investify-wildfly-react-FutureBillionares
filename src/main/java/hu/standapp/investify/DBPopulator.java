package hu.standapp.investify;

import hu.standapp.investify.model.*;
import hu.standapp.investify.services.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 * Created by matyi on 2017.06.22..
 */
@Singleton
@Startup
public class DBPopulator {

    @Inject
    private MoneyPoolService moneyPoolService;

    @Inject
    private HousePictureService housePictureService;

    @Inject
    private HouseService houseService;

    @Inject
    private InvestmentService investmentService;

    @Inject
    private ShareholdForSaleService shareholdForSaleService;

    @Inject
    private ShareholdService shareholdService;

    @Inject
    private UserService userService;

    private static final Logger logger = LoggerFactory.getLogger(DBPopulator.class);

    @PostConstruct
    public void populate() {

        logger.info("Creating example data");

        MoneyPool exampleMoneyPool = new MoneyPool(3500000, 10000000, 100000, 20);
        User exampleUser = new User("mani", "hali", "hu");
        House exampleHouse = new House(1000, 0000, "City city", "Address address", 1000000);
        HousePicture exampleHousePicture = new HousePicture(exampleHouse, "URL", "Description");
        Sharehold exampleSharehold = new Sharehold(exampleHouse, exampleUser, 10000, 10000, 40);
        ShareholdForSale exampleShareholdForSale = new ShareholdForSale(exampleSharehold, 1, 1, null, null);
        Investment exampleInvestment = new Investment(exampleUser, exampleMoneyPool, 5, 1000, null, null);

        logger.info("Saving example data.");

        moneyPoolService.create(exampleMoneyPool);
        userService.create(exampleUser);
        houseService.create(exampleHouse);
        housePictureService.create(exampleHousePicture);
        shareholdService.create(exampleSharehold);
        shareholdForSaleService.create(exampleShareholdForSale);
        investmentService.create(exampleInvestment);

        logger.info("Save complete");
    }

}
