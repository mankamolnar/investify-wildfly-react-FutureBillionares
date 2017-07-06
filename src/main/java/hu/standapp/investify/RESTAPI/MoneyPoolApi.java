package hu.standapp.investify.RESTAPI;

import hu.standapp.investify.model.MoneyPool;
import hu.standapp.investify.services.MoneyPoolService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/moneypool")
public class MoneyPoolApi {

    @Inject
    private MoneyPoolService moneyPoolService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public MoneyPool getMoneyPool() {
        long id = 1;
        MoneyPool moneyPool = moneyPoolService.find(id);
        return moneyPool;
    }

}
