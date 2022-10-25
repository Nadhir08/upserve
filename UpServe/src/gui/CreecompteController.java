/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.User;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import services.CRUD;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class CreecompteController implements Initializable {

    @FXML
    private ImageView imageLOGO;
    @FXML
    private Button buttonsingin;
    @FXML
    private TextField textnom;
    @FXML
    private TextField textemail;
    @FXML
    private TextField textmdp;
    @FXML
    private TextField textregion;
    @FXML
    private TextField texttel;
    @FXML
    private ComboBox<String> combogenre;
    @FXML
    private ComboBox<String> comborole;
    @FXML
    private TextField textmunicipalite;
    @FXML
    private TextField textJT;
    @FXML
    private TextField textHT;
    @FXML
    private ComboBox<String> comboprofession;
    @FXML
    private Button buttoncreate;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
      ObservableList<String> genre = FXCollections.observableArrayList("femme", "homme");
      ObservableList<String> role = FXCollections.observableArrayList("admin", "client", "technicien");
      ObservableList<String> profession = FXCollections.observableArrayList("electricien", "plombier", "menuisier");
      comboprofession.setItems(profession);
              comborole.setItems(role);
              combogenre.setItems(genre);
    }    

    
    @FXML
    private void create(ActionEvent event) {
        CRUD cc = new CRUD();
        User NouvelleUser = new User (0, textnom.getText(), combogenre.getSelectionModel().getSelectedItem(), textemail.getText(), textmdp.getText(), textregion.getText(), textmunicipalite.getText(),texttel.getText(), comborole.getSelectionModel().getSelectedItem(),textJT.getText(),textHT.getText(), comboprofession.getSelectionModel().getSelectedItem());
        cc.ajouterUser(NouvelleUser);
         Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("compte creer avec succes !!");
            alert.showAndWait();

    }
    @FXML
    private void login(ActionEvent event)throws SQLException {
    
    }

  
}