package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class vehiclesController {

    @FXML
    private Button back_to_res;
    @FXML
    private Button submit;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        if (event.getSource() == back_to_res){
            stage = (Stage) back_to_res.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("conceptreservation.fxml"));
        }
        else{
            stage = (Stage) submit.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("conceptmain.fxml"));
        }
        //create a new scene with root and set the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
