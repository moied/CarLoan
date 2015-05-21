package com.diczag.carloan.presentation.views.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.diczag.carloan.business.entity.User;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class MainController implements Initializable, ScreenController {
	protected ScreenDispatcher page;

	@FXML
	private Button btnManagement;

	@FXML
	private Button btnReservation;
	
	@FXML
	private Label lblWelcome;

	@FXML
	private Label lblUser;

	@FXML
	private Label lblLogout;

	// Per inizializzazioni di schermata con uso di page usare overriding
	// del metodo setScreenPane altrimenti overriding del metodo initialize
	@Override
	public void setScreenPane(ScreenDispatcher page) {
		this.page = page;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void onSetScreen() {
		User loggedUser = page.getApp().getLoggedUser();
		if (loggedUser != null) {
			lblWelcome.setVisible(true);
			lblUser.setText(loggedUser.getUsername());
			lblUser.setVisible(true);
			lblLogout.setVisible(true);
		} else {
			lblWelcome.setVisible(false);
			lblUser.setVisible(false);
			lblLogout.setVisible(false);
		}	
	}
	
	@FXML
	private void handleHeaderButtonsAction(ActionEvent event)
			throws IOException {
		if (event.getSource() == btnManagement) {
			if (page.getApp().getLoggedUser() == null)
				page.setScreen("login");
			else
				page.setScreen("management");
		} else
			page.setScreen("main");
	}
	
	@FXML
	private void handleButtonLogout(MouseEvent event)
			throws IOException {
		page.getApp().userLogout();
		page.setScreen("main");
	}

}
