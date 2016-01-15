package controller;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import weka.ProbabilityCounter;

public class PopupController {

	@FXML
	private TextField textField;

	@FXML
	private Button findButton;

	@FXML
	private Button cancelButton;

	@FXML
	private Button okButton;
	
	File selectedFile = null;
<<<<<<< HEAD
        ProbabilityCounter counter;
=======
	
>>>>>>> refs/remotes/zuzannapacholczyk/master
	@FXML
	private void initialize() {
		textField.setEditable(false);
	}

	@FXML
	private void cancelButtonClicked(ActionEvent event) {
<<<<<<< HEAD
		counter = ProbabilityCounter.getInstance(selectedFile);
=======
		ProbabilityCounter counter = new ProbabilityCounter();
>>>>>>> refs/remotes/zuzannapacholczyk/master
		cancelButton.getScene().getWindow().hide();
	}

	@FXML
	private void okButtonClicked(ActionEvent event) {
		if(selectedFile != null) {
<<<<<<< HEAD
                        counter = ProbabilityCounter.getInstance(selectedFile);
		}
		else {
			counter = ProbabilityCounter.getInstance(selectedFile);
		}
                
		okButton.getScene().getWindow().hide();
                
=======
			ProbabilityCounter counter = new ProbabilityCounter(selectedFile);
		}
		else {
			ProbabilityCounter counter = new ProbabilityCounter();
		}
		okButton.getScene().getWindow().hide();
>>>>>>> refs/remotes/zuzannapacholczyk/master
	}

	@FXML
	private void findButtonClicked(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Wybierz plik z danymi");
		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("ARFF", "*.arff*"));
<<<<<<< HEAD
		selectedFile = fileChooser.showOpenDialog(findButton.getScene().getWindow());
=======
		File selectedFile = fileChooser.showOpenDialog(findButton.getScene().getWindow());
>>>>>>> refs/remotes/zuzannapacholczyk/master
		textField.setText(selectedFile.getAbsolutePath());
	}
}
