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
	private Instances data;
	private static ProbabilityCounter counterInstance;

	private ProbabilityCounter(File selectedFile) {
		dataFile = selectedFile;
	}

	private ProbabilityCounter() {
		readDefaultDataFile();
	}

	public static ProbabilityCounter getInstance(File file) {
		if (counterInstance == null) {
			if (file == null) {
				counterInstance = new ProbabilityCounter();
			} else {
				counterInstance = new ProbabilityCounter(file);
			}
		}
		return counterInstance;
	}

	private void readDefaultDataFile() {
		try {
			String path = "defaultFile.arff";
			dataFile = new File(path);
		} catch (Exception e) {
		}
	}

	public void buildClassifier() throws Exception {
		dataSource = new DataSource(dataFile.getPath());
		data = dataSource.getDataSet();

		if (data.classIndex() == -1)
			data.setClassIndex(data.numAttributes() - 1);

		classifier = new J48();
		classifier.setUnpruned(false);
		classifier.buildClassifier(data);
	}

	public double calculateProbability(double[] attributes) throws Exception {
		Instance instance = new Instance(attributes.length + 1);
		instance.setDataset(data);
		for (int i = 0; i < attributes.length; i++) {
			instance.setValue(i, attributes[i]);
		}
		System.out.println(instance);

		double[] probability;
		probability = classifier.distributionForInstance(instance);
		System.out.println("Rak zlosliwy z prawdopodobienstwem: " + probability[1]);
		return probability[1];
	}
}
