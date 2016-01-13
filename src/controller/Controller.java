package controller;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import weka.ProbabilityCounter;

public class Controller {

	/**
	 * Ka�dy element gui, do kt�rego chcemy si� odwo�a� musi mie� okre�lone
	 * fx:id w pliku fxml i musi by� ono takie samo jak nazwa zmiennej tutaj z
	 * adnotacj� @FXML
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
	private Label label1;
	
	@FXML
	private Label label2;
	
	@FXML
	private Label label3;
	
	@FXML
	private Label label4;
	
	@FXML
	private Label label5;
	
	@FXML
	private Label label6;
	
	@FXML
	private Label label7;
	
	@FXML
	private Label label8;
	
	@FXML
	private Label label9;
	
	@FXML
	private Button buttonClean;
	
	@FXML
	private Button buttonCount;
        
        
        private List<Slider> sliders;
        
        File selectedFile = null;
        ProbabilityCounter counter;
        
	public Controller() {
		
        }
	
	/**
	 * Metoda wywo�ywana przy starcie programu. Ustawia warto�ci pocz�tkowe.
	 */
        @FXML
	private void initialize() {
		initializeSlideBars();
                counter = ProbabilityCounter.getInstance(selectedFile);
	}

	private void initializeSlideBars() {
		
                sliders = new LinkedList<>();
                sliders.add(slider1);
		// Ustawienie skali 1-10 dla slidera. Dla ka�dego trzeba zrobi� to samo
		slider1.setMin(1);
		slider1.setMax(10);
		slider1.setShowTickLabels(true);
		slider1.setShowTickMarks(true);
		slider1.setMajorTickUnit(1);
		slider1.setMinorTickCount(0);
		slider1.setSnapToTicks(true);
		
                sliders.add(slider2);
		slider2.setMin(1);
		slider2.setMax(10);
		slider2.setShowTickLabels(true);
		slider2.setShowTickMarks(true);
		slider2.setMajorTickUnit(1);
		slider2.setMinorTickCount(0);
		slider2.setSnapToTicks(true);
		
                sliders.add(slider3);
		slider3.setMin(1);
		slider3.setMax(10);
		slider3.setShowTickLabels(true);
		slider3.setShowTickMarks(true);
		slider3.setMajorTickUnit(1);
		slider3.setMinorTickCount(0);
		slider3.setSnapToTicks(true);
		
                sliders.add(slider4);
		slider4.setMin(1);
		slider4.setMax(10);
		slider4.setShowTickLabels(true);
		slider4.setShowTickMarks(true);
		slider4.setMajorTickUnit(1);
		slider4.setMinorTickCount(0);
		slider4.setSnapToTicks(true);
		
                sliders.add(slider5);
		slider5.setMin(1);
		slider5.setMax(10);
		slider5.setShowTickLabels(true);
		slider5.setShowTickMarks(true);
		slider5.setMajorTickUnit(1);
		slider5.setMinorTickCount(0);
		slider5.setSnapToTicks(true);
		
                sliders.add(slider6);
		slider6.setMin(1);
		slider6.setMax(10);
		slider6.setShowTickLabels(true);
		slider6.setShowTickMarks(true);
		slider6.setMajorTickUnit(1);
		slider6.setMinorTickCount(0);
		slider6.setSnapToTicks(true);
		
                sliders.add(slider7);
		slider7.setMin(1);
		slider7.setMax(10);
		slider7.setShowTickLabels(true);
		slider7.setShowTickMarks(true);
		slider7.setMajorTickUnit(1);
		slider7.setMinorTickCount(0);
		slider7.setSnapToTicks(true);
		
                sliders.add(slider8);
		slider8.setMin(1);
		slider8.setMax(10);
		slider8.setShowTickLabels(true);
		slider8.setShowTickMarks(true);
		slider8.setMajorTickUnit(1);
		slider8.setMinorTickCount(0);
		slider8.setSnapToTicks(true);
		
                sliders.add(slider9);
		slider9.setMin(1);
		slider9.setMax(10);
		slider9.setShowTickLabels(true);
		slider9.setShowTickMarks(true);
		slider9.setMajorTickUnit(1);
		slider9.setMinorTickCount(0);
		slider9.setSnapToTicks(true);
	}
	
	/**
	 * Metoda o tej samej nazwie, co w onAction w pliku fxml. Ta dotyczy przycisku "Wyczy��"
	 * @param event
	 */
	@FXML
	private void buttonCleanClicked(ActionEvent event) {
            for (Slider s : sliders)
                s.setValue(1);
	}
	
	/**
	 * Metoda o tej samej nazwie, co w onAction w pliku fxml. Ta dotyczy przycisku "Oblicz"
	 * @param event
	 */
	@FXML
	private void buttonCountClicked(ActionEvent event) throws Exception {
                double [] attributesValues = new double[sliders.size()];
                
                for (int i = 0; i < attributesValues.length; i++)
                    attributesValues[i] = sliders.get(i).getValue();
                
                counter.BuildClassifier();
                double calculatedProbability = counter.CalculateProbability(attributesValues);
                ShowEvaluation(calculatedProbability);              
        }
        
    private void ShowEvaluation(double probability) {
                label1.setText(Double.toString(slider1.getValue()));
                label2.setText(Double.toString(slider2.getValue()));
                label3.setText(Double.toString(slider3.getValue()));
                label4.setText(Double.toString(slider4.getValue()));
                label5.setText(Double.toString(slider5.getValue()));
                label6.setText(Double.toString(slider6.getValue()));
                label7.setText(Double.toString(slider7.getValue()));
                label8.setText(Double.toString(slider8.getValue()));
                label9.setText(Double.toString(slider9.getValue()));
                
                               
                
    }
        
        
	
}
