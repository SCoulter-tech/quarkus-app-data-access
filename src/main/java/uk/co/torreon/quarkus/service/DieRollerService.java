package uk.co.torreon.quarkus.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class DieRollerService {
    @ConfigProperty(name="die.sides")
    private int sides;

    public int getRoll() {
        return (int)(Math.random()*sides)+1;
    }
}
