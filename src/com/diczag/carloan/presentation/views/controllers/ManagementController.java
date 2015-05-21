package com.diczag.carloan.presentation.views.controllers;

import com.diczag.carloan.business.entity.ACTOR;
import com.diczag.carloan.business.entity.User;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ManagementController extends MainController {
	
	@FXML
    private Button btnCars;

    @FXML
    private Button btnEmployees;

    @FXML
    private Button btnAgency;

    @FXML
    private Button btnPrices;
    
    @Override
	public void setScreenPane(ScreenDispatcher page) {
		super.setScreenPane(page);
	}
    
    @Override
	public void onSetScreen() {
		super.onSetScreen();
		User loggedUser = this.page.getApp().getLoggedUser();
		if (!loggedUser.getActor().equals(ACTOR.ADMINISTRATOR)) {
			btnCars.setVisible(false);
			btnEmployees.setVisible(false);
			btnAgency.setVisible(false);
			btnPrices.setVisible(false);
		}
	}

}
