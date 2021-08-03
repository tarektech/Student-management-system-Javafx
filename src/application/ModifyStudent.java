package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class ModifyStudent extends MainController implements Initializable{
	
	@FXML
	private Button modifyexit;
	@FXML
	private Button modifybtn;
	@FXML
	private TextField enterid;
	@FXML
	private Label statuslbl;
	
public void initialize(URL location, ResourceBundle resources) {
		
	}
	


	public void Modifying() {
		try {
			if(enterid.getText().trim().equals("")) {
				statuslbl.setText("Please Enter Valid Student ID ");
			}
			else {
			File newFile = new File("newStudents.txt");
			BufferedReader MyReader2 = new BufferedReader(new FileReader("students.txt"));
			BufferedWriter Mywriter2 = new BufferedWriter(new FileWriter("newStudents.txt"));
			String z;
			int flag=0;
			
			while((z=MyReader2.readLine())!=null) {
				if(!z.equalsIgnoreCase(enterid.getText())) {
					Mywriter2.write(z);
					Mywriter2.newLine();
				}
				if(z.equalsIgnoreCase(enterid.getText())) {
					flag=1;
				statuslbl.setText("Student Selected !");
					for(int j=0;j<7;j++) {
							z=MyReader2.readLine();
						}
				}
			}
					MyReader2.close();
					Mywriter2.close();
					fileStudent.delete();
					newFile.renameTo(fileStudent);
					
					if(flag==1)
					{
					MainController M = new MainController();
					M.Add(null);
					}	
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	
	
	
	public void Cancel(ActionEvent event) {
	    Stage stage = (Stage) modifyexit.getScene().getWindow();
	    stage.close();
	}	
	
}
