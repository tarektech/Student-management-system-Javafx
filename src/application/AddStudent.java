//this the add method which make the student stored in the file 
package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public  class AddStudent extends MainController implements Initializable  {

	public void initialize(URL location, ResourceBundle resources) {
		
		}

	
	@FXML
	private TextField txtname;
	@FXML
	private TextField txtsurname;
	@FXML
	private TextField txtage;
	@FXML
	private TextField txtdepart;
	@FXML
	private TextField txtstuid;
	@FXML
	private TextField txtnum;
	@FXML
	private TextField txtemail;
	@FXML
	private Button cancelbtn;
	@FXML
	private Button savebtn;
	@FXML
	public Label status;
	/*
	 * the add student is created to let the user add student information
	 * */
	
	public void Saving(ActionEvent event) {
	
		try { 
		BufferedWriter Mywriter = new BufferedWriter(new FileWriter("students.txt",true));
		
			if(txtstuid.getText().trim().equals("")||txtname.getText().trim().equals("")||txtsurname.getText().trim().equals("")
					||txtage.getText().trim().equals("")||txtdepart.getText().trim().equals("")||txtnum.getText().trim().equals("")
					||txtemail.getText().trim().equals("")) {
				
				status.setText("You must fill all fields !!");
			}
			else {
				Mywriter.write(txtstuid.getText());
				Mywriter.newLine();
				Mywriter.write(txtname.getText());
				Mywriter.newLine();
				Mywriter.write(txtsurname.getText());
				Mywriter.newLine();
				Mywriter.write(txtage.getText());
				Mywriter.newLine();
				Mywriter.write(txtdepart.getText());
				Mywriter.newLine();
				Mywriter.write(txtnum.getText());
				Mywriter.newLine();
				Mywriter.write(txtemail.getText());
				Mywriter.newLine();
				Mywriter.newLine();
				Mywriter.close();
				status.setText("Student Saved !");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
}
	public void Cancel(ActionEvent event) {
	    Stage stage = (Stage) cancelbtn.getScene().getWindow();
	    stage.close();
	}
	
	
}
