package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainFormController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button okButton;

    @FXML
    private PasswordField PasswordField;

    @FXML
    private TextField loginTextField;

    @FXML
    void okButtonClick(ActionEvent event) {
    	String password = PasswordField.getText();
    	boolean check;
    	check = password.contentEquals("Qwerty");
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Check password");
    	alert.setHeaderText("Result:");
    	if(check)
    	{
    		alert.setContentText("Correct");
    		 alert.showAndWait();
    	}
    	else
    	{
    		alert.setContentText("Incorrect");
    		 alert.showAndWait();
    	}
    	loginTextField.setText("");
    	PasswordField.setText("");
    }

    @FXML
    void initialize() {
        assert okButton != null : "fx:id=\"okButton\" was not injected: check your FXML file 'MainForm.fxml'.";
        assert PasswordField != null : "fx:id=\"PasswordField\" was not injected: check your FXML file 'MainForm.fxml'.";
        assert loginTextField != null : "fx:id=\"loginTextField\" was not injected: check your FXML file 'MainForm.fxml'.";

    }
}

