/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apkbuatansendiri;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField InUser;
    @FXML
    private TextField InPass;
    @FXML
    private Button btnLogin;
   
    private Label tampilPass;
    String username, password;
   
    public String user="izzul";
    public String pass="dimulai";

    /**
     * Initializes the controller class.
     */
   

    @FXML
    private void handleButtonAction(ActionEvent event) {
         username=InUser.getText();
       password=InPass.getText();
       
       if(username.equalsIgnoreCase(user) && password.equalsIgnoreCase(pass)){
           try{
               ((Node)(event.getSource())).getScene().getWindow().hide();
               
               FXMLLoader fxmlLoader = new FXMLLoader();
               fxmlLoader.setLocation(getClass().getResource("Home.fxml"));
               Scene scene = new Scene(fxmlLoader.load(),830,450);
               
               Stage stage = new Stage();
               stage.setScene(scene);
               stage.setTitle("izzul");
               stage.show();
           }
           catch(IOException e){
               System.out.println("Failed to create new window."+e);
       }
       }
    }
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
