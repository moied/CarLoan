package com.diczag.carloan.presentation;
	
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import com.diczag.carloan.business.entity.*;

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
        
        /* Test Extra
        int giorni = 5;
        int giorniSet = 9;
        Extra extra1 = new GuidatoreAddizionale(giorni, 4);
        Extra extra2 = new GuidatoreAddizionale(giorniSet, 4);
        Extra extra3 = new Assicurazione(giorniSet);
        System.out.println("Extra 1: " + extra1.getImporto());
        System.out.println("Extra 2: " + extra2.getImporto()); 
        System.out.println("Extra 3: " + extra3.getImporto());*/
	}

}
