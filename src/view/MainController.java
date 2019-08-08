package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import launcher.Launcher2;

/**
 * This class is the main App skeleton controller that individual views will communicate with to access the database.
 * @author Kenny
 *
 */
public class MainController implements Initializable {
	
	private ViewType view;
	
	private static BorderPane rootPane;
	
	public MainController() {
	}
	
	public void setRootPane(BorderPane rootPane) {
		MainController.rootPane = rootPane;
	}


	@FXML
	public Button logoutButton;
	
	@FXML
	void logoutAction(ActionEvent event) {
			switchView(ViewType.Login);
		}
	
	public static void switchView(ViewType viewType) {
		try {
			FXMLLoader loader = null;
			switch(viewType) {
				case Admin:
					loader = new FXMLLoader(Launcher2.class.getResource("/view/AdminMainView.fxml"));
					loader.setController(new AdminController());
					break;
				case Technician:
					loader = new FXMLLoader(Launcher2.class.getResource("/view/TechMainView.fxml"));
					loader.setController(new TechnicianController());
					break;
				case Login:
					loader = new FXMLLoader(Launcher2.class.getResource("/view/LoginView.fxml"));
					loader.setController(new LoginController());
					break;
					
			}
			Parent view = loader.load();
			rootPane.setCenter(view);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}