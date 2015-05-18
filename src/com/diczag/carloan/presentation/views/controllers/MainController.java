package com.diczag.carloan.presentation.views.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class MainController implements Initializable, ScreenController {
	private ScreenDispatcher page;

	@FXML
	private Button btnManagement;

	@FXML
	private Button btnReservation;

	@Override
	public void setScreenPane(ScreenDispatcher page) {
		this.page = page;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}

	@FXML
	private void handleHeaderButtonsAction(ActionEvent event)
			throws IOException {
		if (event.getSource() == btnManagement) 
			page.setScreen("management");
		else 
			page.setScreen("main");

		/*
		Stage stage;
		Parent page;

		if (event.getSource() == management) {
			stage = (Stage) management.getScene().getWindow();
			page = FXMLLoader.load(getClass().getResource("../LoginView.fxml"));
		} else {
			stage = (Stage) reservation.getScene().getWindow();
			page = FXMLLoader.load(getClass().getResource("../MainView.fxml"));
		}

		// create a new scene with root and set the stage
		Scene scene = new Scene(page);
		stage.setScene(scene);
		stage.show();
		*/
	}
}
