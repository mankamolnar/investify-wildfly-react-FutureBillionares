package hu.standapp.investify.services;

import hu.standapp.investify.model.HousePicture;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class HousePictureService extends AbstractFacade <HousePicture> {

    @PersistenceContext(unitName = "bfsExampleUnit")
    private EntityManager em;

    public HousePictureService() {
        super(HousePicture.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
