package uk.co.torreon.quarkus.webservice;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import uk.co.torreon.quarkus.model.GreetingResponse;
import uk.co.torreon.quarkus.service.GreetingService;

@Path("/hello")
public class GreetingResource {
    private final GreetingService greetingService;

    public GreetingResource(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GET
    public GreetingResponse hello() {
        return this.greetingService.getGreeting();
    }
}
