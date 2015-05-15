package com.diczag.carloan.presentation.views.controllers;

import java.util.HashMap;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

public class ScreenDispatcher extends StackPane {
	// Contiene le schermate da visualizzare
	private HashMap<String, Node> screens = new HashMap<>();

	public ScreenDispatcher() {
		super();
	}

	// Aggiunge la schermata all'HashMap
	public void addScreen(String name, Node screen) {
		screens.put(name, screen);
	}

	// Estrae la schermata dall'HashMap
	public Node getScreen(String name) {
		return screens.get(name);
	}

	// Carica il file fxml associato alla schermata da aggiungere alla
	// collezione e
	// e infine imposta il controller associato
	public boolean loadScreen(String name, String resource) {
		try {
			FXMLLoader myLoader = new FXMLLoader(getClass().getResource(
					resource));
			Parent loadScreen = (Parent) myLoader.load();
			ScreenController myScreenControler = ((ScreenController) myLoader
					.getController());
			myScreenControler.setScreenPane(this);
			addScreen(name, loadScreen);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	// Visualizza la schermata
	public boolean setScreen(final String name) {
		// Con fade-in e fade-out

		/*
		if (screens.get(name) != null) { // screen loaded
			final DoubleProperty opacity = opacityProperty();

			if (!getChildren().isEmpty()) { // if there is more than one screen
				Timeline fade = new Timeline(new KeyFrame(Duration.ZERO,
						new KeyValue(opacity, 1.0)), new KeyFrame(new Duration(
						2000), new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent t) {
						getChildren().remove(0); // remove the displayed screen
						getChildren().add(0, screens.get(name)); // add the
																	// screen
						Timeline fadeIn = new Timeline(new KeyFrame(
								Duration.ZERO, new KeyValue(opacity, 0.0)),
								new KeyFrame(new Duration(2000), new KeyValue(
										opacity, 1.0)));
						fadeIn.play();
					}
				}, new KeyValue(opacity, 0.0)));
				fade.play();

			} else {
				setOpacity(0.0);
				getChildren().add(screens.get(name)); // no one else been
														// displayed, then just
														// show

				Timeline fadeIn = new Timeline(new KeyFrame(Duration.ZERO,
						new KeyValue(opacity, 0.0)), new KeyFrame(new Duration(
						1000), new KeyValue(opacity, 1.0)));
				fadeIn.play();
			}
			return true;
		} else {
			System.out.println("screen hasn't been loaded!!! \n");
			return false;
		}
		*/

		// Senza fade-in e fade-out

		if (screens.get(name) != null) {
			if (!getChildren().isEmpty()) {
				getChildren().remove(0);
				getChildren().add(0, screens.get(name));
			} else {
				getChildren().add(screens.get(name));
			}
			return true;
		} else {
			System.out.println("Schermata " + name + " non caricata");
			return false;
		}
	}

	// Rimuove la schermata dalla collezione
	public boolean unloadScreen(String name) {
		if (screens.remove(name) == null) {
			System.out.println("Schermata " + name + " non esiste");
			return false;
		} else {
			return true;
		}
	}
}
