
package application;
/*
 * this class the main window which has the login menu of the application 
 * the fxml file is the window holder
 * */

import javafx.application.Application; 
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Menu extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/LoginMenu.fxml"));			
			Scene scene = new Scene(root,300,300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		primaryStage.setResizable(false);
	}
	
	/*
	 * this is the main method of the whole application 
	 * without the main the application will not work
	 * */
	public static void main(String[] args) {
		launch(args);
	}
}
