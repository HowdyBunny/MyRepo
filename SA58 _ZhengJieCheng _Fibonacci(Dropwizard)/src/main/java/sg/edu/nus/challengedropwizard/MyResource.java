package sg.edu.nus.challengedropwizard;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/getMinCoinNumber")
@Produces(MediaType.APPLICATION_JSON)
public class MyResource {
    private final MyService coinService;

    public MyResource(MyService coinService) {
        this.coinService = coinService;
    }

    @GET
    public Response getMinCoinNumber(@QueryParam("targetAmount") double targetAmount,
                                     @QueryParam("coinDenominations") List<Double> coinDenominations) {
        List<Double> res = coinService.computeMinCoinNumber(targetAmount, coinDenominations);
        return Response.ok(res).build();
    }
}