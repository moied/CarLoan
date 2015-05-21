package com.diczag.carloan.presentation;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import com.diczag.carloan.business.entity.*;
import com.diczag.carloan.presentation.views.controllers.ScreenDispatcher;

public class CarLoan extends Application {
	public static String mainFXML = "../MainView.fxml";
	public static String loginFXML = "../LoginView.fxml";
	public static String managementFXML = "../ManagementView.fxml";
	
	private User loggedUser;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		User newUser = new Customer();
		newUser.setUsername("m1ky91");
		newUser.setPassword("180191");
		User.addUser(newUser);
		
		User newUser2 = new Employee();
		newUser2.setUsername("ivan");
		newUser2.setPassword("ivan");
		User.addUser(newUser2);
		
		User newUser3 = new Administrator();
		newUser3.setUsername("admin");
		newUser3.setPassword("admin");
		User.addUser(newUser3);
		
		loggedUser = newUser;
		
		ScreenDispatcher mainContainer = new ScreenDispatcher();
		mainContainer.setApp(this);
        mainContainer.loadScreen("main", CarLoan.mainFXML);
        mainContainer.loadScreen("login", CarLoan.loginFXML);
        mainContainer.loadScreen("management", CarLoan.managementFXML);
        mainContainer.setScreen("main");
        
        Scene scene = new Scene(mainContainer);

        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("views/images/icon.png")));
        primaryStage.setTitle("CarLoan");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        // Prova branch michele
        // Test Extra
        /*
        int giorni = 5;
        int giorniSet = 9;
        Extra extra1 = new AdditionalDriver(giorni, true, 4);
        Extra extra2 = new AdditionalDriver(giorniSet, false, 0);
        Extra extra3 = new Insurance(giorniSet, true);
        System.out.println("Extra 1: " + extra1.getPrice());
        System.out.println("Extra 2: " + extra2.getPrice()); 
        System.out.println("Extra 3: " + extra3.getPrice());*/
	}
	
	public static void main(String[] args) {
        launch(args);
    }
	
	public User getLoggedUser() {
        return loggedUser;
    }
	
	public void userLogout(){
        loggedUser = null;
    }
}
