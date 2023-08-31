package restful;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ex4")
public class Ex4 {
    

    @Path("people/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @DELETE
    public List<Human> deleteHuman(@PathParam("id") Integer id){
        
        return Tools.getPeople().stream().filter((Human h)-> h.getId() != id).collect(Collectors.toList());
    }
}
