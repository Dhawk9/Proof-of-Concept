package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private Button Make_Reservation;
    @FXML
    private Button back_to_res;
    @FXML
    private Button submit;



    @FXML
   private void handleButtonAction(ActionEvent event) throws IOException{
       Stage stage;
       Parent root;
       if(event.getSource() == Make_Reservation){
           //get reference to the button's stage
           stage =(Stage) Make_Reservation.getScene().getWindow();
           //load other FXML document
           root = FXMLLoader.load(getClass().getResource("conceptreservation.fxml"));
       }
       else if (event.getSource() == back_to_res){
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


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
