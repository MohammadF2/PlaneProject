package com.example.project1_comp242;

public class Passenger implements Comparable<Passenger> {

    private int flightNum;
    private String ticketNum;
    private String name;
    private long passportNum;
    private String nationality;
    private String date;

    public Passenger(int flightNum, String ticketNum, String name, long passportNum, String nationality, String date) {
        this.flightNum = flightNum;
        this.ticketNum = ticketNum;
        this.name = name;
        this.passportNum = passportNum;
        this.nationality = nationality;
        this.date = date;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }

    public String getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(long passportNum) {
        this.passportNum = passportNum;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Passenger name: " + name + ", Passport: " + passportNum + ", Ticket number: " + ticketNum + ", Flight number: " + flightNum + "\n";
    }

    @Override
    public int compareTo(Passenger o) {
        if (o.ticketNum.compareTo(ticketNum) > 0){
            return 0;
        } else if (o.ticketNum.equals(ticketNum))
            return 1;
        else
            return 1;
    }
}



/*
330,4567654,Salman Akeem,T65493,Afghan,15/02/1970
556,948372,Cyrillus Facundo,5438523,Argentine,17/05/1981
778,1453678,Maria Francisca,9823852,Brazilian,01/10/2001
128,7483762,Oliver Jacob,87689378,British,12/11/1998
330,8758934,Eleuterio Eutimio,E857335,Argentine,15/09/1997
543,5873833,Amer Aqeel,T847573,Afghan,20/01/2002
128,3287463,Emma William,85739833,Canadian,31/12/1992
556,9874563,Fang Wei,34563567,Chinese,22/08/1996
330,45244212,Hassan Jamal,99876775,Egyptian,17/07/1997
128,54766677,Mary Robert,12980954,English,20/04/1982
330,87347659,Badr Bilal,67543453,Pakistani,09/10/1988
235,56443276,Adaeze Adankwo,89234567,Nigerien,25/11/1999
460,87654356,Kareem Omar,98123453,Jordanian,29/03/1971
330,65674367,Asahi Akio,786345126,Japanese,25/09/1958
556,67534986,Leonardo Tommaso,657489876,Italian,27/08/1963
330,64213435,Agathe Louis,78653923,French,17/07/1989
543,342489789,Noah Luuk,56743987,Dutch,09/06/1985
330,87687438,James Benjamin,89789543,American,19/05/1983
 */