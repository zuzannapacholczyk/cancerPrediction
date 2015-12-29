package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;

public class Controller {

	/**
	 * Ka¿dy element gui, do którego chcemy siê odwo³aæ musi mieæ okreœlone
	 * fx:id w pliku fxml i musi byæ ono takie samo jak nazwa zmiennej tutaj z
	 * adnotacj¹ @FXML
	 */
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
	
	/**
	 * Metoda wywo³ywana przy starcie programu. Ustawia wartoœci pocz¹tkowe.
	 */
	@FXML
	private void initialize() {
		initializeSlideBars();
	}

	private void initializeSlideBars() {
		
		// Ustawienie skali 1-10 dla slidera. Dla ka¿dego trzeba zrobiæ to samo
		slider1.setMin(1);
		slider1.setMax(10);
		slider1.setShowTickLabels(true);
		slider1.setShowTickMarks(true);
		slider1.setMajorTickUnit(1);
		slider1.setMinorTickCount(0);
		slider1.setSnapToTicks(true);
		
		slider2.setMin(1);
		slider2.setMax(10);
		slider2.setShowTickLabels(true);
		slider2.setShowTickMarks(true);
		slider2.setMajorTickUnit(1);
		slider2.setMinorTickCount(0);
		slider2.setSnapToTicks(true);
		
		slider3.setMin(1);
		slider3.setMax(10);
		slider3.setShowTickLabels(true);
		slider3.setShowTickMarks(true);
		slider3.setMajorTickUnit(1);
		slider3.setMinorTickCount(0);
		slider3.setSnapToTicks(true);
		
		slider4.setMin(1);
		slider4.setMax(10);
		slider4.setShowTickLabels(true);
		slider4.setShowTickMarks(true);
		slider4.setMajorTickUnit(1);
		slider4.setMinorTickCount(0);
		slider4.setSnapToTicks(true);
		
		slider5.setMin(1);
		slider5.setMax(10);
		slider5.setShowTickLabels(true);
		slider5.setShowTickMarks(true);
		slider5.setMajorTickUnit(1);
		slider5.setMinorTickCount(0);
		slider5.setSnapToTicks(true);
		
		slider6.setMin(1);
		slider6.setMax(10);
		slider6.setShowTickLabels(true);
		slider6.setShowTickMarks(true);
		slider6.setMajorTickUnit(1);
		slider6.setMinorTickCount(0);
		slider6.setSnapToTicks(true);
		
		slider7.setMin(1);
		slider7.setMax(10);
		slider7.setShowTickLabels(true);
		slider7.setShowTickMarks(true);
		slider7.setMajorTickUnit(1);
		slider7.setMinorTickCount(0);
		slider7.setSnapToTicks(true);
		
		slider8.setMin(1);
		slider8.setMax(10);
		slider8.setShowTickLabels(true);
		slider8.setShowTickMarks(true);
		slider8.setMajorTickUnit(1);
		slider8.setMinorTickCount(0);
		slider8.setSnapToTicks(true);
		
		slider9.setMin(1);
		slider9.setMax(10);
		slider9.setShowTickLabels(true);
		slider9.setShowTickMarks(true);
		slider9.setMajorTickUnit(1);
		slider9.setMinorTickCount(0);
		slider9.setSnapToTicks(true);
	}
	
	/**
	 * Metoda o tej samej nazwie, co w onAction w pliku fxml. Ta dotyczy przycisku "Wyczyœæ"
	 * @param event
	 */
	@FXML
	private void buttonCleanClicked(ActionEvent event) {
		// TODO
		
	}
	
	/**
	 * Metoda o tej samej nazwie, co w onAction w pliku fxml. Ta dotyczy przycisku "Oblicz"
	 * @param event
	 */
	@FXML
	private void buttonCountClicked(ActionEvent event) {
		// TODO
	}
	
}
