package hu.standapp.investify.services;

import hu.standapp.investify.model.House;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class HouseService extends AbstractFacade<House> {

    @PersistenceContext(unitName = "bfsExampleUnit")
    EntityManager em;

    public HouseService() {
        super(House.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
