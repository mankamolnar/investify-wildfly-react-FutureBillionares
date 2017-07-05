package hu.standapp.investify;

import hu.standapp.investify.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by matyi on 2017.06.22..
 */
public class ExampleData {

    private EntityManagerFactory emf;
    private EntityManager em;
    private static ExampleData instance;

    private static final Logger logger = LoggerFactory.getLogger(ExampleData.class);

    private ExampleData() {
        emf = Persistence.createEntityManagerFactory("bfsExampleUnit");
        em = emf.createEntityManager();
    }

    public static ExampleData getInstance() {
        if (instance == null) {
            instance = new ExampleData();
            instance.createExampleData();
            return instance;
        }
        return instance;
    }


    private void createExampleData() {
        em.clear();

        logger.info("Creating example data");
        User exampleUser = new User("mani", "hali", "hu");
        House exampleHouse = new House(1000, 0000, "City city", "Address address", 1000000);
        HousePicture exampleHousePicture = new HousePicture(exampleHouse, "URL", "Description");
        MoneyPool exampleMoneyPool = new MoneyPool(4500000, 10000000, 100000, 20);
        Sharehold exampleSharehold = new Sharehold(exampleHouse, exampleUser, 10000, 10000, 40);
        ShareholdForSale exampleShareholdForSale = new ShareholdForSale(exampleSharehold, 1, 1, null, null);
        Investment exampleInvestment = new Investment(exampleUser, exampleMoneyPool, 5, 1000, null, null);

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        logger.info("Saving example data.");
        em.persist(exampleUser);
        em.persist(exampleHouse);
        em.persist(exampleHousePicture);
        em.persist(exampleMoneyPool);
        em.persist(exampleSharehold);
        em.persist(exampleShareholdForSale);
        em.persist(exampleInvestment);
        transaction.commit();
        logger.info("Save complete");
    }

    public EntityManager getEntityManager() {
        return em;
    }
}
