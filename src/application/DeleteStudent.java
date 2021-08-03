package application;

import java.io.File; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


public class DeleteStudent extends MainController implements Initializable {
	
	@FXML
	private Button deletebtn;
	@FXML
	private Button cancelbtn;
	@FXML
	private TextField enterid;
	@FXML
	private Label statuslbl;
	
	
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	
	/* user can delete any student using the id*/
	public void Deleting() {
		try {
			if(enterid.getText().trim().equals("")) {
				statuslbl.setText("Please Enter Valid Student ID ");
			}
			else {
			File newFile = new File("newStudents.txt");
			BufferedReader MyReader2 = new BufferedReader(new FileReader("students.txt"));
			BufferedWriter Mywriter2 = new BufferedWriter(new FileWriter("newStudents.txt"));
			String z;
			
			while((z=MyReader2.readLine())!=null) {
				if(!z.equalsIgnoreCase(enterid.getText())) {
					Mywriter2.write(z);
					Mywriter2.newLine();
				}
				if(z.equalsIgnoreCase(enterid.getText())) {
				statuslbl.setText("Student Deleted !");
					for(int j=0;j<7;j++) {
							z=MyReader2.readLine();
						}
				}
			}
					MyReader2.close();
					Mywriter2.close();
					fileStudent.delete();
					newFile.renameTo(fileStudent);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void Cancel(ActionEvent event) {
	    Stage stage = (Stage) cancelbtn.getScene().getWindow();
	    stage.close();
	}	

}