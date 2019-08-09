/*******************************************************************************
 * Copyright (c) 2019 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package view;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import launcher.Launcher;
import model.Database;

/**
 * The controller for the admin view.
 * <br>This class allows for an admin user to create new instances of equipment, customers, jobs, and technicians.
 * @author Kenny
 *
 */
public class AdminController implements EventHandler<ActionEvent>, Initializable {
	@FXML
	private ListView statisticsListView, memoListView, jobsListView;
	@FXML
	private MenuButton actionMenuButton;
	@FXML
	private TextField memoTextField;
	
	private Database database;
	
	public AdminController() {
		database = Database.getInstance();
	}
	
	
	
	public void addMemo() {
	}
	
	/**
	 * Displays a pop up dialogue box where the user can add equipment to the database of existing equipment.
	 */
	public void handleAddEquipment() {
		try {
			Stage popupWindow = new Stage();
			FXMLLoader loader = new FXMLLoader(Launcher.class.getResource("/view/PopUpAddEquipment.fxml"));
			EquipmentPopupController controller = new EquipmentPopupController();
			loader.setController(controller);
			Parent root = loader.load();
			popupWindow.setScene(new Scene(root));
			popupWindow.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
