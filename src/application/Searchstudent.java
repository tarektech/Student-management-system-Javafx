package application;


import java.io.FileReader;
import java.io.BufferedReader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;

public class Searchstudent extends MainController implements Initializable {
	
	@FXML
	private Button searchexit;
	@FXML
	private TextField searchid;
	@FXML
	private TextArea txtdata;
	@FXML
	private Label statuslbl;
	
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	/*
	 * the user can find the student information using the id 
	 * the id is the link to the other classes
	 * */
	public void Searching() {
		try {
			BufferedReader MyReader1 = new BufferedReader(new FileReader("students.txt"));
			String x;
			String z;
			txtdata.clear();
			while((z=MyReader1.readLine())!=null) {
				if(z.equalsIgnoreCase(searchid.getText())) {
					statuslbl.setText("Student Found !");
					for(int i=0;i<6;i++) {
							x=MyReader1.readLine();
							txtdata.appendText(x);
							txtdata.appendText("\n");	
					}	
					break;
				}
				else {
					statuslbl.setText("Student Not Found !!");
				}
			}
					MyReader1.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void SearchExit(ActionEvent event) {
	    Stage stage = (Stage) searchexit.getScene().getWindow();
	    stage.close();
	}	

}
