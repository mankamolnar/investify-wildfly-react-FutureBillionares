package hu.standapp.investify.services;

import hu.standapp.investify.model.Sharehold;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ShareholdService extends AbstractFacade<Sharehold> {

    @PersistenceContext(unitName = "bfsExampleUnit")
    EntityManager em;

    public ShareholdService() {
        super(Sharehold.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}