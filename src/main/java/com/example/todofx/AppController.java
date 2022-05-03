package com.example.todofx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AppController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn;

    @FXML
    private TextField input;

    @FXML
    private Label label;
/*
    @FXML
    void btnClick(ActionEvent event) {
        label.setText(input.getText());
        input.setText("");

    }*/

    @FXML
    void initialize() {

    }
}