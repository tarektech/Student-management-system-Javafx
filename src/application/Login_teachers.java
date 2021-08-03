package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Login_teachers {

	@FXML
	private Label lbllogin;
	@FXML
	private TextField txtusername;
	@FXML
	private TextField txtpassword;

	
	
	
	
	
	public void Login(ActionEvent event) throws Exception {

		if (txtusername.getText().equals("admin") && txtpassword.getText().equals("admin")) {
			lbllogin.setText("Login Success");

			Stage primaryStage = new Stage();

			Parent root = FXMLLoader.load(getClass().getResource("/application/Menu.fxml"));
			Scene scene = new Scene(root, 588, 566);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setResizable(false);

		} else {
			lbllogin.setText("Login Failed");
		}
	}
	
	
}
