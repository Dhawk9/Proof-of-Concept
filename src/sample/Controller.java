package sample;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private void change_scene(ActionEvent event) throws IOException {
        System.out.println("I've been clicked!");
        Parent Main_parent = FXMLLoader.load(getClass().getResource("conceptreservation.fxml"));
        Scene Main_scene = new Scene(Main_parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(Main_scene);
        window.show();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
