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

	ProbabilityCounter counter;

	@FXML
	private void initialize() {
		textField.setEditable(false);
	}

	@FXML
	private void cancelButtonClicked(ActionEvent event) {
		counter = ProbabilityCounter.getInstance(selectedFile);
		cancelButton.getScene().getWindow().hide();
	}

	@FXML
	private void okButtonClicked(ActionEvent event) {
		if (selectedFile != null) {
			counter = ProbabilityCounter.getInstance(selectedFile);
		} else {
			counter = ProbabilityCounter.getInstance(selectedFile);
		}

		okButton.getScene().getWindow().hide();
	}

	@FXML
	private void findButtonClicked(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Wybierz plik z danymi");
		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("ARFF", "*.arff*"));
		selectedFile = fileChooser.showOpenDialog(findButton.getScene().getWindow());
		textField.setText(selectedFile.getAbsolutePath());
	}
}
