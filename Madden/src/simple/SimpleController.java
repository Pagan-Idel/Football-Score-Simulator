package simple;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SimpleController implements Initializable {

    // Home Team FXML
    @FXML
    private TextField HTN;
    @FXML
    private TextField HTO;
    @FXML
    private TextField HTD;
    @FXML
    private TextField HTS;
    // Away Team FXML
    @FXML
    private TextField ATN;
    @FXML
    private TextField ATO;
    @FXML
    private TextField ATD;
    @FXML
    private TextField ATS;
    // Button FXML
    @FXML
    private Button myButton;


    @Override // This method is called by the FXMLLoader when initialization is complete
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        assert myButton != null : "fx:id=\"myButton\" was not injected: check your FXML file 'simple.fxml'.";

        // initialize your logic here: all @FXML variables will have been injected
        myButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                // Create new TeamBean instance
                TeamBean TeamStats = new TeamBean();

                //Save Variables from text fields to 'TeamStats' Instance
                // Home Team Variables
                TeamStats.setH_n(HTN.getText());
                TeamStats.setH_o(Integer.parseInt(HTO.getText()));
                TeamStats.setH_d(Integer.parseInt(HTD.getText()));
                TeamStats.setH_s(Integer.parseInt(HTS.getText()));
                // Away Team Variables
                TeamStats.setA_n(ATN.getText());
                TeamStats.setA_o(Integer.parseInt(ATO.getText()));
                TeamStats.setA_d(Integer.parseInt(ATD.getText()));
                TeamStats.setA_s(Integer.parseInt(ATS.getText()));

                // Print TeamBean 'TeamStats' instance
                System.out.println(TeamStats.toString());
            }
        });
    }
}