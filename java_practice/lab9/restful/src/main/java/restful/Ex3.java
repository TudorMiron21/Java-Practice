package restful;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ex3")
public class Ex3 {


    @Path("people")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Human> addPeople(Human human){
        List<Human> newList = Tools.getPeople().stream().collect(Collectors.toList());
        newList.add(human);
        return newList;
    }
    

}
