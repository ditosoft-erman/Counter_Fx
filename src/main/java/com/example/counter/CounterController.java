package com.example.counter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CounterController {

    @FXML
    private Label counterLabel;

    private int counter = 0;

    @FXML
    protected void onIncrementButtonClick() {
        counter++;
        counterLabel.setText(String.valueOf(counter));
    }

    @FXML
    protected void onDecrementButtonClick() {
        counter--;
        counterLabel.setText(String.valueOf(counter));
    }
}
