package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class resController implements Initializable {

    @FXML
    private Button back_to_main;
    @FXML
    private Button select_vehicle;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        if(event.getSource() == back_to_main){
            stage = (Stage) back_to_main.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("conceptmain.fxml"));
        }
        else {
            stage = (Stage) select_vehicle.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("conceptvehicles.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
