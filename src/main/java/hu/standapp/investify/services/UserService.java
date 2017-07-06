package hu.standapp.investify.services;

import hu.standapp.investify.model.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserService extends AbstractFacade<User> {

    @PersistenceContext(unitName = "bfsExampleUnit")
    EntityManager em;

    public UserService() {
        super(User.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
