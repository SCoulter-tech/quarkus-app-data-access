package uk.co.torreon.quarkus.model;

import java.util.List;

public class GreetingResponse {
    private String greeting;

    private int dieRoll;

    private List<String> roomNumbers;

    public List<String> getRoomNumbers() {
        return roomNumbers;
    }

    public void setRoomNumbers(List<String> roomNumbers) {
        this.roomNumbers = roomNumbers;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public int getDieRoll() {
        return dieRoll;
    }

    public void setDieRoll(int dieRoll) {
        this.dieRoll = dieRoll;
    }
}
