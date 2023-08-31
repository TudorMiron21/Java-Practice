package restful;

import java.util.List;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ex1")
public class Ex1 {
    

    @Path("people")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Human> getPeople(){
        return Tools.getPeople();
    }
}
