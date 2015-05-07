package com.diczag.carloan.presentation;
	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainView extends Application {
	
	@FXML
	private AnchorPane header;
	
	@FXML
	private AnchorPane content;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent page = FXMLLoader.load(getClass().getResource("views/MainView.fxml"));

        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("views/images/icon.png")));
        primaryStage.setTitle("CarLoan");
        primaryStage.setScene(new Scene(page));
        primaryStage.show();
	}

}
