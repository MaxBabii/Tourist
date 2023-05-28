package com.maksym.tourist.tourist;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private TableView<Distribution> TouristTable;
    @FXML
    private TableColumn<Distribution, String> Cities;
    @FXML
    private TableColumn<Distribution, String> Hotel;

    @FXML
    private TableColumn<Distribution, String> Pab;

    @FXML
    private TableColumn<Distribution, String> PopularPlaces;
    @FXML
    private TextField EnterField;
    @FXML
    private Button SendButton;

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Cities.setCellValueFactory(new PropertyValueFactory<Distribution, String>("Cities"));
        PopularPlaces.setCellValueFactory(new PropertyValueFactory<Distribution, String>("PopularPlaces"));
        Pab.setCellValueFactory(new PropertyValueFactory<Distribution, String>("Pab"));
        Hotel.setCellValueFactory(new PropertyValueFactory<Distribution, String>("Hotel"));
//        TouristTable.setItems(getDistributionsList());
    }
//    ObservableList<Distribution> getDistributionsList(){
//        ObservableList<Distribution> distributions = FXCollections.observableArrayList();
//        distributions.add(new Distribution(data.getEnterField() * 25 / 100, data.getEnterField() * 20 / 100,data.getEnterField() * 15 / 100,data.getEnterField() * 30 / 100,data.getEnterField() * 10 / 100));
//        return distributions;
//    }

}
