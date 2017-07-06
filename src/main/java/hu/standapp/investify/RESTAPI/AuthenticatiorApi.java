package hu.standapp.investify.RESTAPI;

import hu.standapp.investify.model.User;
import hu.standapp.investify.services.UserService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/auth")
public class AuthenticatiorApi {

    private List<User> users;

    @Inject
    private UserService userService;

    @GET
    @Path("{username}/{password}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(
            @PathParam("username") String username,
            @PathParam("password") String password) {

        users = userService.findAll();
        for (User user : users) {
            if (user.getName().equals(username) && user.getPassword().equals(password)) {
                return user;
            }

        }
        return null;

    }

}
