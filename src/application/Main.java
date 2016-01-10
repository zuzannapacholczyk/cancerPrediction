package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("application.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Analiza zagrozenia rakiem piersi");

//			// popup do wyboru pliku
//			Parent popup = FXMLLoader.load(getClass().getResource("popup.fxml"));
//			Scene popupScene = new Scene(popup);
//			popupScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			Stage popupStage = new Stage();
//			popupStage.setScene(popupScene);
//			popupStage.initModality(Modality.APPLICATION_MODAL);
//			popupStage.setTitle("Wybierz plik z danymi");
			
			primaryStage.show();
//			popupStage.showAndWait();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
