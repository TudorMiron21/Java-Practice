// package tudor.practice;

// import java.io.IOException;
// import java.io.Reader;

// import javax.ws.rs.GET;
// import javax.ws.rs.Path;
// import javax.ws.rs.Produces;
// import javax.ws.rs.core.MediaType;

// import org.apache.ibatis.session.SqlSession;
// import org.apache.ibatis.session.SqlSessionFactory;
// import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// import java.io.IOException;
// import java.io.Reader;
// import org.apache.ibatis.io.Resources;
// import org.apache.ibatis.session.*;

// /**
//  * Root resource (exposed at "myresource" path)
//  */
// // @Path("myresource")
// public class MyResource {

//     // /**
//     // * Method handling HTTP GET requests. The returned object will be sent
//     // * to the client as "text/plain" media type.
//     // *
//     // * @return String that will be returned as a text/plain response.
//     // */
//     // @GET
//     // @Produces(MediaType.TEXT_PLAIN)
//     // public String getIt() {
//     // return "Got it!";
//     // }

//     private static SqlSessionFactory factory = null;

//     public static void main(String[] args) throws IOException {
//         String resource = "mybatis-config.xml";
//         Reader reader = Resources.getResourceAsReader(resource);
//         factory = new SqlSessionFactoryBuilder().build(reader);
//         factory.getConfiguration().addMapper(Mapper.class);
//         reader.close();
//         try (SqlSession session = factory.openSession();) {
//             // method with annotation from interface
//             String version = session.selectOne("getAgents");
//             System.out.println(version);
//         }
//     }
// }
package tudor.practice;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyResource {

    private static SqlSessionFactory factory = null;

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        factory = new SqlSessionFactoryBuilder().build(reader);
        reader.close();
        try (SqlSession session = factory.openSession();) {
            Mapper mapper = session.getMapper(Mapper.class);
            // Assuming getAgents() returns a list of Agent objects
            List<Agent> agents = mapper.getAgents();
            for (Agent agent : agents) {
                System.out.println(agent);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}