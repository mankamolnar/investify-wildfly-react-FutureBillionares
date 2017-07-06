package hu.standapp.investify.services;

import hu.standapp.investify.model.ShareholdForSale;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ShareholdForSaleService extends AbstractFacade<ShareholdForSale> {

    @PersistenceContext(unitName = "bfsExampleUnit")
    EntityManager em;

    public ShareholdForSaleService() {
        super(ShareholdForSale.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}