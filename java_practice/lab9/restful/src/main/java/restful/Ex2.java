package restful;

import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("ex2")
public class Ex2 {
    

    @Path("people/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Human getHuman(@PathParam("id") Integer id){

       return Tools.getPeople().stream().filter(h-> h.getId() == id).findFirst().orElse(null);
    }
}
