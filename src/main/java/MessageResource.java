import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("message")
public class MessageResource {
    @GET
    public String defaultTestService() {
        //  http://localhost:8080/lightpoint/resource/message
        return "Hello. The service is up!";
    }

    @GET
    @Path("/{username}")
    public String getUserByPath(@PathParam("username") String userName) {
        //  http://localhost:8080/lightpoint-1.0/resource/message/Lionel
        return "Hello, " + userName + "! This is using a Path Parameter";
    }

    @GET
    @Path("/user")
    public String getUserByQueryParameter(@QueryParam("name") String userName) {
        //  http://localhost:8080/lightpoint/resource/message/user?name=Lionel
        return "Hello, " + userName + "! This is using a Query Parameter";
    }

}
