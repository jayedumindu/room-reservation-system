package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HomePage {
    public Button loginbtn;
    public Button reservebtn;
    public Button bookingsbtn;
    public AnchorPane mainPane;

    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)mainPane.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Admin-Login.fxml"))));

    }

    public void resOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)mainPane.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Receptionist-Reservations.fxml"))));
    }

    public void bookingOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage)mainPane.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Receptionist-Bookings.fxml"))));
    }
}
