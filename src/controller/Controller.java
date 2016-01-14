package controller;

<<<<<<< HEAD
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import javafx.embed.swing.SwingNode;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import weka.ProbabilityCounter;
import weka.core.Utils;
=======
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
>>>>>>> refs/remotes/zuzannapacholczyk/master

public class Controller {

	/**
<<<<<<< HEAD
	 * Kaï¿½dy element gui, do ktï¿½rego chcemy siï¿½ odwoï¿½aï¿½ musi mieï¿½ okreï¿½lone
	 * fx:id w pliku fxml i musi byï¿½ ono takie samo jak nazwa zmiennej tutaj z
	 * adnotacjï¿½ @FXML
=======
	 * Ka¿dy element gui, do którego chcemy siê odwo³aæ musi mieæ okreœlone
	 * fx:id w pliku fxml i musi byæ ono takie samo jak nazwa zmiennej tutaj z
	 * adnotacj¹ @FXML
>>>>>>> refs/remotes/zuzannapacholczyk/master
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
<<<<<<< HEAD
        
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
=======
>>>>>>> refs/remotes/zuzannapacholczyk/master
	
	@FXML
	private Button buttonClean;
	
	@FXML
	private Button buttonCount;
<<<<<<< HEAD
        
        @FXML
        private Label labelProb;
        
        @FXML
        private Label labelDiagnosis;
        
        private List<Slider> sliders;
        
        File selectedFile = null;
        ProbabilityCounter counter;
        
	public Controller() {
		
        }
	
	/**
	 * Metoda wywoï¿½ywana przy starcie programu. Ustawia wartoï¿½ci poczï¿½tkowe.
	 */
        @FXML
	private void initialize() {
		initializeSlideBars();
                counter = ProbabilityCounter.getInstance(selectedFile);
=======
	
	public Controller() {
		
	}
	
	/**
	 * Metoda wywo³ywana przy starcie programu. Ustawia wartoœci pocz¹tkowe.
	 */
	@FXML
	private void initialize() {
		initializeSlideBars();
>>>>>>> refs/remotes/zuzannapacholczyk/master
	}

	private void initializeSlideBars() {
		
<<<<<<< HEAD
                sliders = new LinkedList<>();
                sliders.add(slider1);
		// Ustawienie skali 1-10 dla slidera. Dla kaï¿½dego trzeba zrobiï¿½ to samo
=======
		// Ustawienie skali 1-10 dla slidera. Dla ka¿dego trzeba zrobiæ to samo
>>>>>>> refs/remotes/zuzannapacholczyk/master
		slider1.setMin(1);
		slider1.setMax(10);
		slider1.setShowTickLabels(true);
		slider1.setShowTickMarks(true);
		slider1.setMajorTickUnit(1);
		slider1.setMinorTickCount(0);
		slider1.setSnapToTicks(true);
		
<<<<<<< HEAD
                sliders.add(slider2);
=======
>>>>>>> refs/remotes/zuzannapacholczyk/master
		slider2.setMin(1);
		slider2.setMax(10);
		slider2.setShowTickLabels(true);
		slider2.setShowTickMarks(true);
		slider2.setMajorTickUnit(1);
		slider2.setMinorTickCount(0);
		slider2.setSnapToTicks(true);
		
<<<<<<< HEAD
                sliders.add(slider3);
=======
>>>>>>> refs/remotes/zuzannapacholczyk/master
		slider3.setMin(1);
		slider3.setMax(10);
		slider3.setShowTickLabels(true);
		slider3.setShowTickMarks(true);
		slider3.setMajorTickUnit(1);
		slider3.setMinorTickCount(0);
		slider3.setSnapToTicks(true);
		
<<<<<<< HEAD
                sliders.add(slider4);
=======
>>>>>>> refs/remotes/zuzannapacholczyk/master
		slider4.setMin(1);
		slider4.setMax(10);
		slider4.setShowTickLabels(true);
		slider4.setShowTickMarks(true);
		slider4.setMajorTickUnit(1);
		slider4.setMinorTickCount(0);
		slider4.setSnapToTicks(true);
		
<<<<<<< HEAD
                sliders.add(slider5);
=======
>>>>>>> refs/remotes/zuzannapacholczyk/master
		slider5.setMin(1);
		slider5.setMax(10);
		slider5.setShowTickLabels(true);
		slider5.setShowTickMarks(true);
		slider5.setMajorTickUnit(1);
		slider5.setMinorTickCount(0);
		slider5.setSnapToTicks(true);
		
<<<<<<< HEAD
                sliders.add(slider6);
=======
>>>>>>> refs/remotes/zuzannapacholczyk/master
		slider6.setMin(1);
		slider6.setMax(10);
		slider6.setShowTickLabels(true);
		slider6.setShowTickMarks(true);
		slider6.setMajorTickUnit(1);
		slider6.setMinorTickCount(0);
		slider6.setSnapToTicks(true);
		
<<<<<<< HEAD
                sliders.add(slider7);
=======
>>>>>>> refs/remotes/zuzannapacholczyk/master
		slider7.setMin(1);
		slider7.setMax(10);
		slider7.setShowTickLabels(true);
		slider7.setShowTickMarks(true);
		slider7.setMajorTickUnit(1);
		slider7.setMinorTickCount(0);
		slider7.setSnapToTicks(true);
		
<<<<<<< HEAD
                sliders.add(slider8);
=======
>>>>>>> refs/remotes/zuzannapacholczyk/master
		slider8.setMin(1);
		slider8.setMax(10);
		slider8.setShowTickLabels(true);
		slider8.setShowTickMarks(true);
		slider8.setMajorTickUnit(1);
		slider8.setMinorTickCount(0);
		slider8.setSnapToTicks(true);
		
<<<<<<< HEAD
                sliders.add(slider9);
=======
>>>>>>> refs/remotes/zuzannapacholczyk/master
		slider9.setMin(1);
		slider9.setMax(10);
		slider9.setShowTickLabels(true);
		slider9.setShowTickMarks(true);
		slider9.setMajorTickUnit(1);
		slider9.setMinorTickCount(0);
		slider9.setSnapToTicks(true);
	}
	
	/**
<<<<<<< HEAD
	 * Metoda o tej samej nazwie, co w onAction w pliku fxml. Ta dotyczy przycisku "Wyczyï¿½ï¿½"
=======
	 * Metoda o tej samej nazwie, co w onAction w pliku fxml. Ta dotyczy przycisku "Wyczyœæ"
>>>>>>> refs/remotes/zuzannapacholczyk/master
	 * @param event
	 */
	@FXML
	private void buttonCleanClicked(ActionEvent event) {
<<<<<<< HEAD
            for (Slider s : sliders)
                s.setValue(1);
=======
		// TODO
		
>>>>>>> refs/remotes/zuzannapacholczyk/master
	}
	
	/**
	 * Metoda o tej samej nazwie, co w onAction w pliku fxml. Ta dotyczy przycisku "Oblicz"
	 * @param event
	 */
	@FXML
<<<<<<< HEAD
	private void buttonCountClicked(ActionEvent event) throws Exception {
                double [] attributesValues = new double[sliders.size()];
                
                for (int i = 0; i < attributesValues.length; i++)
                    attributesValues[i] = sliders.get(i).getValue();
                
                counter.BuildClassifier();
                double calculatedProbability = counter.CalculateProbability(attributesValues);
                ShowEvaluation(calculatedProbability);              
        }
        
    private void ShowEvaluation(double probability) throws Exception {
                SetResultLabels();
                labelProb.setText(Utils.doubleToString(probability*100, 2)+"%");
                SetDiagnosisLabel(probability);
                VisualizeTree(); 
    }

    private void SetResultLabels() {
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

    private void SetDiagnosisLabel(double probability) {
                String diagnosis="";
                if(probability<0.1)
                    diagnosis="Wszystko ok";
                else if (probability<0.5)
                    diagnosis="Åšrednio";
                else
                    diagnosis="Tragedia";    
                labelDiagnosis.setText(diagnosis);
    }   

    private void VisualizeTree() {
                
    }
=======
	private void buttonCountClicked(ActionEvent event) {
		// TODO
	}
	
>>>>>>> refs/remotes/zuzannapacholczyk/master
}
