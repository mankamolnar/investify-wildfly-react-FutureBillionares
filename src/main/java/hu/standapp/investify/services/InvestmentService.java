package hu.standapp.investify.services;

import hu.standapp.investify.model.Investment;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class InvestmentService extends AbstractFacade<Investment> {

    @PersistenceContext(unitName = "bfsExampleUnit")
    EntityManager em;

    public InvestmentService() {
        super(Investment.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}