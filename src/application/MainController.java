
package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/*
 * the maincontroller holds the menu of the application which is come after the login menu
 * the fxml here has the main windows of the application window 
 * */

public class MainController extends Login_teachers implements Initializable {
	@FXML
	private Button Exit;

	public void initialize(URL location, ResourceBundle resources) {
	}

	// the main file which holds all the students information
	File fileStudent = new File("students.txt");

	public void Add(ActionEvent event) {
		try {
			Stage adding = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/ADDStu.fxml"));
			Scene scene = new Scene(root, 643, 475);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			adding.setScene(scene);
			adding.show();
			adding.setResizable(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Search(ActionEvent event) {
		try {
			Stage searching = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/SearchStu.fxml"));
			Scene scene = new Scene(root, 399, 371);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			searching.setScene(scene);
			searching.show();
			searching.setResizable(false);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void ShowAll(ActionEvent event) {

		try {

			Stage showing = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/ShowAll.fxml"));
			Scene scene = new Scene(root, 612, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			showing.setScene(scene);
			showing.show();
			showing.setResizable(false);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void Modify(ActionEvent event) {
		try {
			Stage edit = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Modify.fxml"));
			Scene scene = new Scene(root, 338, 268);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			edit.setScene(scene);
			edit.show();
			edit.setResizable(false);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void Delete(ActionEvent event) {
		try {
			Stage del = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Delete.fxml"));
			Scene scene = new Scene(root, 426, 300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			del.setScene(scene);
			del.show();
			del.setResizable(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ExitProgram(ActionEvent event) {
		try {
			Stage stage = (Stage) Exit.getScene().getWindow();
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
