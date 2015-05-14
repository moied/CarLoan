package com.diczag.carloan.presentation.views.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainViewController {

	@FXML
	private Button management;
		
	@FXML
	private Button reservation;
	
	@FXML
	private void handleHeaderButtonsAction(ActionEvent event) throws IOException {
	     Stage stage;
	     Parent page;
	     
	     if (event.getSource() == management) {
	    	 stage = (Stage) management.getScene().getWindow(); 
		     page = FXMLLoader.load(getClass().getResource("../LoginView.fxml"));
	     } else {
	    	 stage = (Stage) reservation.getScene().getWindow(); 
		     page = FXMLLoader.load(getClass().getResource("../MainView.fxml"));
	     }
	     
	     //create a new scene with root and set the stage
	     Scene scene = new Scene(page);
	     stage.setScene(scene);
	     stage.show();
	}
	
}
