package weka;

import java.io.File;
import weka.classifiers.trees.J48;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class ProbabilityCounter {

	private File dataFile;
        private DataSource dataSource;
	private J48 classifier;
        
	public ProbabilityCounter(File selectedFile) {
		dataFile = selectedFile;
	}

	public ProbabilityCounter() {
		readDefaultDataFile();
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
            Instances data = dataSource.getDataSet();
            
            if(data.classIndex() == -1)
                data.setClassIndex(data.numAttributes() - 1);         
            
            classifier = new J48();
            classifier.setUnpruned(false);
            classifier.buildClassifier(data);
        }
        
        public double CalculateProbability (double [] attributes) throws Exception{
            Instance instance = new Instance(attributes.length+1);
            for (int i = 0; i < attributes.length; i++){
                instance.setValue(i, attributes[i]);
            }
            instance.setClassMissing();

            double[] probability;
            probability = classifier.distributionForInstance(instance);
            return probability[1];
        }
}
