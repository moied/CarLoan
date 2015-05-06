package com.diczag.carloan.presentation;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class MainView extends Application {
	
	@FXML
	private AnchorPane header;
	
	@FXML
	private AnchorPane content;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		try {
			AnchorPane page = (AnchorPane) FXMLLoader.load(MainView.class.getResource("views/MainView.fxml"));
            Scene scene = new Scene(page);
            primaryStage.setScene(scene);
            primaryStage.setTitle("CarLoan");
            primaryStage.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}

}
