package com.diczag.carloan.presentation;
	
import java.util.GregorianCalendar;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import com.diczag.carloan.business.entity.Driver;

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
        
        // Prova branch michele
        // Test Extra
        /*int giorni = 5;
        int giorniSet = 9;
        Extra extra1 = new AdditionalDriver(giorni, true, 4);
        Extra extra2 = new AdditionalDriver(giorniSet, false, 0);
        Extra extra3 = new Insurance(giorniSet, true);
        System.out.println("Extra 1: " + extra1.getPrice());
        System.out.println("Extra 2: " + extra2.getPrice()); 
        System.out.println("Extra 3: " + extra3.getPrice());*/
        
        /*GregorianCalendar birthIvan = new GregorianCalendar();
        birthIvan.set(1991,1,18);
        Driver ivan = new Driver("zgrvni", "ivan", "zagaria", 'm', "via piero della francesca", "3342233617", "zagariaivan@gmail.com", "001", birthIvan);
        System.out.println("Età di ivan: " + ivan.getEta());*/
	}

}
