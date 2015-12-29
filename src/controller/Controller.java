package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;

public class Controller {

	@FXML
	private Slider slider1;
	
	@FXML
	private Slider slider2;
	
	@FXML
	private Slider slider3;
	
	@FXML
	private Slider slider4;
	
	@FXML
	private Slider slider5;
	
	@FXML
	private Slider slider6;
	
	@FXML
	private Slider slider7;
	
	@FXML
	private Slider slider8;
	
	@FXML
	private Slider slider9;
	
	@FXML
	private Button buttonClean;
	
	@FXML
	private Button buttonCount;
	
	public Controller() {
		
	}
	
	@FXML
	private void initialize() {
		initializeSlideBars();
	}

	private void initializeSlideBars() {
		slider1.setMin(1);
		slider1.setMax(10);
		slider1.setShowTickLabels(true);
		slider1.setShowTickMarks(true);
		slider1.setMajorTickUnit(1);
		slider1.setMinorTickCount(0);
		slider1.setSnapToTicks(true);
	}
	
	@FXML
	private void buttonCleanClicked(ActionEvent event) {
		// TODO
	}
	
	@FXML
	private void buttonCountClicked(ActionEvent event) {
		// TODO
	}
	
}
