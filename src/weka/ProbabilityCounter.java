package weka;

import java.io.File;
<<<<<<< HEAD
import javafx.scene.Node;
import weka.classifiers.trees.J48;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.gui.treevisualizer.PlaceNode2;
import weka.gui.treevisualizer.TreeVisualizer;
=======
>>>>>>> refs/remotes/zuzannapacholczyk/master

public class ProbabilityCounter {

	private File dataFile;
<<<<<<< HEAD
        private DataSource dataSource;
	private J48 classifier;
        private Instances data;
        private static ProbabilityCounter counterInstance;
        
	private ProbabilityCounter(File selectedFile) {
		dataFile = selectedFile;
	}

	private ProbabilityCounter() {
		readDefaultDataFile();
	}
        
        public static ProbabilityCounter getInstance(File file){
            if (counterInstance == null){
                if (file == null){
                    counterInstance = new ProbabilityCounter();
                }
                else{
                    counterInstance = new ProbabilityCounter(file);
                }
            }
        return counterInstance;
        }
        
	private void readDefaultDataFile() {
            try
            {
                String path = "defaultFile.arff";
                dataFile = new File(path);
            }
            catch (Exception e)
            {
            }
	}
        
        public void BuildClassifier() throws Exception{
            dataSource = new DataSource(dataFile.getPath());
            data = dataSource.getDataSet();
            
            if(data.classIndex() == -1)
                data.setClassIndex(data.numAttributes() - 1);         
            
            classifier = new J48();
            classifier.setUnpruned(false);
            classifier.buildClassifier(data);
        }
        
        public double CalculateProbability (double [] attributes) throws Exception{
            Instance instance = new Instance(attributes.length+1);
            instance.setDataset (data);
            for (int i = 0; i < attributes.length; i++){
                instance.setValue(i, attributes[i]);
            }
            System.out.println (instance);
            
            double[] probability;
            probability = classifier.distributionForInstance(instance);
            System.out.println("Rak złośliwy z prawdopodobieństwem: "+probability[1]);
            return probability[1];
        }
        
=======
	
	public ProbabilityCounter(File selectedFile) {
		dataFile = selectedFile;
	}

	public ProbabilityCounter() {
		readDefaultDataFile();
	}

	private void readDefaultDataFile() {
		// TODO Auto-generated method stub
		
	}

>>>>>>> refs/remotes/zuzannapacholczyk/master
}
