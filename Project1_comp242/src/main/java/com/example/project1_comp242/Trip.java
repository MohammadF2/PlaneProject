package com.example.project1_comp242;

public class Trip implements Comparable<Trip> {
    private int flightNum;
    private String airLinesName;
    private String source;
    private String destination;
    private int capacity;

    public Trip(int flightNum, String airLinesName, String source, String destination, int capacity) {
        this.flightNum = flightNum;
        this.airLinesName = airLinesName;
        this.source = source;
        this.destination = destination;
        this.capacity = capacity;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }

    public String getAirLinesName() {
        return airLinesName;
    }

    public void setAirLinesName(String airLinesName) {
        this.airLinesName = airLinesName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    @Override
    public String toString() {
        return "Trip number: " + flightNum + ", Flight source: " + source + ", Flight destination: " + destination + ", on the " + airLinesName + " air lines \n";
    }

    @Override
    public int compareTo(Trip o) {

        if (o.flightNum > flightNum){
            return 0;
        } else if (o.flightNum == flightNum)
            return 1;
        else
            return 1;
    }
}




/*
235,Delta Air Lines,Jordan,London,270
128,Emirates Airline,Dubai,Istabul,220
460,Saudi Arabian Airlines,Jeddah,Moscow,320
780,China Airlines,Taipei,Paris,87
330,Malaysia Airlines,Kuala Lumpur,Rome,160
543,Thai Airways International,Bangkok,Frankfurt,180
778,Delta Air Lines,Atlanta,New York,180
556,Turkish Airlines,Istanbul,Dublin,210
 */