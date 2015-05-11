package com.diczag.carloan.presentation;

import java.util.LinkedList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import com.diczag.carloan.business.entity.Agency;
import com.diczag.carloan.business.entity.Car;
import com.diczag.carloan.business.entity.ExecutiveCar;
import com.diczag.carloan.business.entity.LuxuryCar;
import com.diczag.carloan.business.entity.MediumCar;
import com.diczag.carloan.business.entity.SmallCar;

public class MainView extends Application {

	@FXML
	private AnchorPane header;

	@FXML
	private AnchorPane content;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent page = FXMLLoader.load(getClass().getResource(
				"views/MainView.fxml"));

		primaryStage.getIcons().add(
				new Image(getClass().getResourceAsStream(
						"views/images/icon.png")));
		primaryStage.setTitle("CarLoan");
		primaryStage.setScene(new Scene(page));
		primaryStage.show();

		// Prova branch michele
		// Test Extra
		int giorni = 5;
		int giorniSet = 9;
		/*
		 * Extra extra1 = new AdditionalDriver(giorni, true, 4); Extra extra2 =
		 * new AdditionalDriver(giorniSet, false, 0); Extra extra3 = new
		 * Insurance(giorniSet, true); System.out.println("Extra 1: " +
		 * extra1.getPrice()); System.out.println("Extra 2: " +
		 * extra2.getPrice()); System.out.println("Extra 3: " +
		 * extra3.getPrice());
		 */

		/*
		 * GregorianCalendar birthIvan = new GregorianCalendar();
		 * birthIvan.set(1991,1,18); Driver ivan = new Driver("zgrvni", "ivan",
		 * "zagaria", 'm', "via piero della francesca", "3342233617",
		 * "zagariaivan@gmail.com", "001", birthIvan);
		 * System.out.println("Età di ivan: " + ivan.getEta());
		 */

		Car fiat500 = new Car("dd550el", "fiat", "500", new SmallCar(giorni),
				null);
		Car giulietta = new Car("ef421el", "alfa_romeo", "giulietta",
				new MediumCar(giorni), null);
		Car a6 = new Car("kk415oi", "audi", "a6", new ExecutiveCar(giorniSet),null);
		Car panamera = new Car("rt696ko", "porshe", "panamera", new LuxuryCar(giorni), null);

		Agency varrett = new Agency(1, "Barletta", "via pcciaun d mamt",
				"3342233617", "0883555478");
		
		List<Car> macchine = new LinkedList<Car>();
		macchine.add(fiat500);
		macchine.add(giulietta);
		macchine.add(a6);
		macchine.add(panamera);
		
		varrett.addAllCars(macchine);
		
		List<Car> carrett = new LinkedList<Car>();
		carrett = varrett.getCars();
		
		for(Car c : carrett)
			System.out.println(c.getPlate() + ", " + c.getBrand() + ", " + c.getModel() + ", " + c.getCategory().getPrice() + ", " + c.getAgency().getCity());

	}
}
