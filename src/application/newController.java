package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class newController implements Initializable {

	@FXML
	private TextField myTextField;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	
	public void setTextField(String txt)
	{
		myTextField.setText(txt);
	}

}
