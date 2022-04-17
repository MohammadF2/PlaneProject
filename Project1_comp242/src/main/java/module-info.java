module com.example.project1_comp242 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project1_comp242 to javafx.fxml;
    exports com.example.project1_comp242;
}