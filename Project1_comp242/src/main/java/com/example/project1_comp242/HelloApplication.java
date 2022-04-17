package com.example.project1_comp242;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.css.CssParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class HelloApplication extends Application {
    LinkedList<Trip> trips = new LinkedList<Trip>();
    LinkedList<Passenger> passegers = new LinkedList<Passenger>();
    Label TripE = new Label();
    Label PassE = new Label();
    Label loginE = new Label();

    @Override
    public void start(Stage stage) throws IOException {

        String cssButton = "-fx-background-color: #090a0c, "
                + "linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),"
                + "linear-gradient(#20262b, #191d22),"
                + "radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));"
                + "-fx-background-radius: 5,4,3,5;"
                + "-fx-background-insets: 0,1,2,0;"
                + "-fx-text-fill: white;"
                + "-fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );"
                + "-fx-font-family: \"Arial\";"
                + "-fx-text-fill: linear-gradient(white, #d0d0d0);"
                + "-fx-font-size: 12px;"
                + "-fx-padding: 10 20 10 20;";




        Image background = new Image("C:\\Users\\fajoo\\IdeaProjects\\Project1_comp242\\background.png");
        ImageView backgroundV = new ImageView(background);
        ImageView backgroundV1 = new ImageView(background);
        TextField userNameTF = new TextField();
        PasswordField passwordF = new PasswordField();
        Button logingB = new Button("Login");
        logingB.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 17));
        logingB.setStyle(cssButton);



        StackPane backgroundP = new StackPane();
        backgroundP.setStyle("-fx-background-image: C\\Users\\fajoo\\IdeaProjects\\Project1_comp242\\background; -fx-background-repeat: no-repeat; -fx-background-size: 1150 650; -fx-background-position: center center;"); // i search in the web onm how to give my app background
        GridPane logingp = new GridPane();
        logingp.setAlignment(Pos.CENTER);
        logingp.setHgap(15);
        logingp.setVgap(15);
        Label l1 = new Label("Please login to continue: ");
        l1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        l1.setTextFill(Color.WHITE);
        Label l2 = new Label("UserName: ");
        l2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 17));
        l2.setTextFill(Color.WHITE);
        Label l3 = new Label("Password: ");
        l3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 17));
        l3.setTextFill(Color.WHITE);
        logingp.add(l1,1,0);
        logingp.add(l2,0,1);
        logingp.add(userNameTF,1,1);
        logingp.add(l3,0,2);
        logingp.add(passwordF,1,2);
        logingp.add(logingB, 1,3);
        logingp.add(loginE,1,4);
        backgroundP.getChildren().add(backgroundV);
        backgroundP.getChildren().add(logingp);
        Label topT = new Label("Flight manager");
        topT.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 22));
        topT.setAlignment(Pos.CENTER);
        logingp.setAlignment(Pos.CENTER);


        Button readDataB = new Button("Read data");
        readDataB.setStyle(cssButton);
        Button displayFlights = new Button("Display flights");
        displayFlights.setStyle(cssButton);
        Button displayPassengers = new Button("Display passengers info");
        displayPassengers.setStyle(cssButton);
        Button AddEditFligh = new Button("Add / Edit flight info");
        AddEditFligh.setStyle(cssButton);
        Button reserveT = new Button("Reserve a ticket");
        reserveT.setStyle(cssButton);
        Button cancelRes = new Button("Cancel a reservation");
        cancelRes.setStyle(cssButton);
        Button checkIfres = new Button("Check if ticket Reserved");
        checkIfres.setStyle(cssButton);
        Button checkforPas = new Button("Search for passenger");
        checkforPas.setStyle(cssButton);
        Button exit = new Button("exit");
        exit.setStyle(cssButton);



        StackPane backgroundP1 = new StackPane();
        backgroundP1.setStyle("-fx-background-image: C\\Users\\fajoo\\IdeaProjects\\Project1_comp242\\background; -fx-background-repeat: no-repeat; -fx-background-size: 1150 650; -fx-background-position: center center;"); // i search in the web onm how to give my app background
        GridPane mainGp = new GridPane();
        mainGp.setAlignment(Pos.CENTER);
        mainGp.setHgap(15);
        mainGp.setVgap(15);
        mainGp.add(readDataB,0,0);
        mainGp.add(displayFlights,0,1);
        mainGp.add(displayPassengers,0,2);
        mainGp.add(AddEditFligh,0,3);
        mainGp.add(reserveT,0,4);
        mainGp.add(cancelRes,0,5);
        mainGp.add(checkIfres,0,6);
        mainGp.add(checkforPas,0,7);
        mainGp.add(exit,0,8);
        backgroundP1.getChildren().add(backgroundV1);
        backgroundP1.getChildren().add(mainGp);






        Scene mainScene = new Scene(backgroundP, 1150, 650);
        Scene programMS = new Scene(backgroundP1,1150,650);
        stage.setTitle("Flight manager");
        stage.getIcons().add(new Image("C:\\Users\\fajoo\\IdeaProjects\\Project1_comp242\\logo.png"));
        stage.setScene(mainScene);
        stage.show();


        logingB.setOnAction(e -> {
            String userName = "root";
            String password = "root123";
            loginE.setTextFill(Color.web("#ff0000", 0.8));
            if (userNameTF.getText().equals(userName)){
                if (passwordF.getText().equals(password)){
                    stage.setScene(programMS);
                } else
                    loginE.setText("Error: wrong password");
            } else
                loginE.setText("Error: wrong userName or password");
        });


        readDataB.setOnAction(e -> {

        });





    }

    public static void main(String[] args) {
        launch();
    }

    private void readTripsData() throws FileNotFoundException {
        File fr = new File("trips.txt");
        Scanner frs = new Scanner(fr);
        String [] u;
        if (fr.length() > 0) {
            try {
                while (frs.hasNextLine()) {
                    u = frs.nextLine().split(",");
                    println(Integer.parseInt(u[0])+ u[1]+u[2]+u[3]+Integer.parseInt(u[4]));
                    trips.insert(new Trip(Integer.parseInt(u[0]), u[1],u[2],u[3],Integer.parseInt(u[4])));
                    trips.traversList();
                }
                System.out.println("All customer data was loaded successfully");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Warning: customer data file is empty");
            }
        } else {
            System.out.println("Warning: customer data file is empty");
        }
    }

    //trips.insert(new Trip(Integer.parseInt(data[0]), data[1],data[2],data[3],Integer.parseInt(data[4])));

    private void readPassengersData(){

    }

    private void reserve(int tripNum, long passengerPassport){
        Node<Trip> crrT = trips.getHead();
        Node<Passenger> crrP = passegers.getHead();
        while(crrT != null){
            if (tripNum == (crrT.getData().getFlightNum())){
                if (crrT.getData().getCapacity() > 0){
                    while (crrP != null){
                        if (passengerPassport == (crrP.getData().getPassportNum())) {
                            crrP.getData().setFlightNum(tripNum);
                            crrT.getData().setCapacity(crrT.getData().getCapacity() - 1);
                            println("A ticket was reserved for " + crrP.getData().getName() + " successfully");
                            return;
                        } else crrP = crrP.getNext();
                    }
                    println("Error: passenger passport number is incorrect");
                    return;
                }
            }
            else crrT = crrT.getNext();
        }
        println("Error: flight number is incorrect");
    }

    private void cancelReservation(int tripNum, long passengerPassport){
        Node<Trip> crrT = trips.getHead();
        Node<Passenger> crrP = passegers.getHead();
        while(crrT != null){
            if (tripNum == (crrT.getData().getFlightNum())){
                if (crrT.getData().getCapacity() > 0){
                    while (crrP != null){
                        if (passengerPassport == (crrP.getData().getPassportNum())) {
                            crrP.getData().setFlightNum(-1);
                            crrT.getData().setCapacity(crrT.getData().getCapacity() + 1);
                            println("A ticket Reservation was removed for " + crrP.getData().getName() + " successfully");
                            return;
                        } else crrP = crrP.getNext();
                    }
                    println("Error: passenger passport number is incorrect");
                    return;
                }
            }
            else crrT = crrT.getNext();
        }
        println("Error: flight number is incorrect");
    }

    private void addFlight(int flightNum, String airLinesName, String source, String distanation, int capacity){
        if (capacity > 500){
            return;
        } else {
            trips.insert(new Trip(flightNum,airLinesName,source,distanation,capacity));
        }
    }

    private void editFlight(int flightNum, String airLines, String source, String distanation, int capacity){
        Node<Trip> crrT = trips.getHead();
        if (flightNum == -1){
            println("Error: trip number cant be null");
            return;
        } else {
            while(crrT != null){
                if (flightNum == (crrT.getData().getFlightNum())){
                    if(!airLines.equals(null))
                        crrT.getData().setAirLinesName(airLines);
                    if(!source.equals(null))
                        crrT.getData().setSource(source);
                    if(!distanation.equals(null))
                        crrT.getData().setDestination(distanation);
                    if (capacity > 0)
                        crrT.getData().setCapacity(capacity);
                    return;
                }
                crrT = crrT.getNext();
            }
            println("Error: wrong trip number");
        }
    }

    private void printFlightP(int tripNum){
        Node<Trip> crrT = trips.getHead();
        Node<Passenger> crrP = passegers.getHead();
        while(crrT != null){
            if (tripNum == (crrT.getData().getFlightNum())){
                    while (crrP != null){
                        println(crrP.getData().toString());
                        crrP = crrP.getNext();
                    }
                    println("All passengers data for this trip was printed");
                    return;
            }
            else crrT = crrT.getNext();
        }
        println("Error: flight number is incorrect");
    }

    private boolean isResirved(int flightNum, long passengerNum){
        Node<Passenger> currP = passegers.getHead();
        while (currP != null){
            if (passengerNum == (currP.getData().getPassportNum())) {
                if(currP.getData().getFlightNum() == (flightNum))
                    return true;
            }
            currP = currP.getNext();
        }
        return false;
    }

    private void findPassenger(long passportNum){
        Node<Passenger> currP = passegers.getHead();
        while (currP != null){
            if (passportNum==(currP.getData().getPassportNum())) {
                println(currP.getData().toString());
                return;
            }
            currP = currP.getNext();
        }
    }

    private void println(Object text){
        System.out.println(text);
    }

    private void print(Object text){
        System.out.print(text);
    }

}