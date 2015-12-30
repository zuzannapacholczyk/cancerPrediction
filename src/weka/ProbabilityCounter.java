package weka;

import java.io.File;

public class ProbabilityCounter {

	private File dataFile;
	
	public ProbabilityCounter(File selectedFile) {
		dataFile = selectedFile;
	}

	public ProbabilityCounter() {
		readDefaultDataFile();
	}

	private void readDefaultDataFile() {
		// TODO Auto-generated method stub
		
	}

}
