package shoppingcart;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class Cart {
    private Model model = new Model();
    // View view = new View();
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private ComboBox<Item> cboSelectedItem;
    @FXML
    private Label lblUnit;
    @FXML
    private Label lblPrice;
    @FXML
    private Label lblPurchasedNumber;
    @FXML
    private Slider sldSelectUnits;
    @FXML
    void initialize() {
        //bind cboSelectedItem with data
        cboSelectedItem.setItems(model.getItemsObservableList());
        //attach a listener to cboSelectedItem to display unit quantity and price labels
        //and set the sldSelectUnits back to 0
//        cboSelectedItem.valueProperty().addListener((observable, oldValue, newValue) -> {
//            if (cboSelectedItem.getSelectionModel().getSelectedIndex() >= 0) {
//                lblUnit.setText(String.format("%.2f %s", newValue.getUnitQuantity(), newValue.getUnit()));
//                lblPrice.setText(String.format("$ %.2f", newValue.getUnitPrice()));
//                sldSelectUnits.setValue(0);
//            }
//        });
        cboSelectedItem.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (cboSelectedItem.getSelectionModel().getSelectedIndex() >= 0) {
                lblUnit.setText(String.format("%.2f %s", newValue.getUnitQuantity(), newValue.getUnit()));
                lblPrice.setText(String.format("$ %.2f", newValue.getUnitPrice()));
                sldSelectUnits.setValue(0);
            }
        });
        //bind purchase units label with slider value
        lblPurchasedNumber.textProperty().bind(Bindings.format("%.0f", sldSelectUnits.valueProperty()));
    }
}
