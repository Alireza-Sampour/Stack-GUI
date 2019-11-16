package sample;

import com.jfoenix.controls.JFXButton;

public class Button {

    private JFXButton button;
    private String style = "";

    public Button(String push) {
        button = new JFXButton(push);
        button.setPrefWidth(200);
        button.setPrefHeight(33);
        button.setRotate(180);
        style = "-fx-background-color:#547E66;-fx-text-Fill:#fbe7c5;-fx-background-radius: 9;-fx-font-size:13;-fx-background-insets: 1;-fx-border-color: #547E66;-fx-border-radius:9; -fx-border-insets:1;";
        button.setStyle(style);
    }

    public JFXButton getButton() {
        return this.button;
    }
}
