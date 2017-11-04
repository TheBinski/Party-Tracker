import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class MainWindowController implements Initializable{

    @FXML
    Label strengthMod, dexMod, conMod, intMod, wisMod, chaMod;
    @FXML
    ChoiceBox allignmentBox, raceBox, classBox;
    @FXML
    TextField charName, strNum, dexNum, conNum, intNum, wisNum, chaNum;

    @FXML
    protected void openHelpWindow(ActionEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("helpWindow.fxml"));
            Stage stage = new Stage();
            stage.setTitle("About");
            stage.setScene(new Scene(root, 600, 450));
            stage.show();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
