package hu.standapp.investify.services;

import hu.standapp.investify.model.MoneyPool;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MoneyPoolService extends AbstractFacade<MoneyPool> {

    @PersistenceContext(unitName = "bfsExampleUnit")
    EntityManager em;

    public MoneyPoolService() {
        super(MoneyPool.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
