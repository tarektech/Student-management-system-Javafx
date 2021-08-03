package application;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.net.URL;
import java.util.ResourceBundle;

public class ShowAll extends MainController implements Initializable {

	@FXML
	private Button showext;
	@FXML
	private TextArea showarea;

	public void initialize(URL location, ResourceBundle resources) {

	}

	/*
	 * this class is to show all students information
	 */
	public void Showing() {
		try {
			BufferedReader MyReader1 = new BufferedReader(new FileReader("students.txt"));
			String x;
			showarea.clear();
			while ((x = MyReader1.readLine()) != null) {
				showarea.appendText("\t" + x);
				showarea.appendText("\t\t\t\t\t\t\t");
				x = MyReader1.readLine();
				showarea.appendText(x);
				showarea.appendText(" ");
				x = MyReader1.readLine();
				showarea.appendText(x);
				x = MyReader1.readLine();
				x = MyReader1.readLine();
				x = MyReader1.readLine();
				x = MyReader1.readLine();
				x = MyReader1.readLine();
				showarea.appendText("\n");
			}
			MyReader1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void ShowExit(ActionEvent event) {
		Stage stage = (Stage) showext.getScene().getWindow();
		stage.close();
	}

}
