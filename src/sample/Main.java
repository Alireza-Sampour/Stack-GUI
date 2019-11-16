package sample;

import com.jfoenix.controls.JFXButton;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    private static List<JFXButton> buttonlist = new ArrayList<>();

    public static VBox vBox = new VBox();
    static Rotate rotate = new Rotate(-180);

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Stack");
        primaryStage.setScene(new Scene(root, 660, 636));
        root.setStyle("-fx-background-color: #2B323A;");
        setVBox();
        root.getChildren().add(vBox);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void setVBox() {
        vBox.setStyle("-fx-background-color: #2B323A;-fx-border-color: #fbe7c5;-fx-border-insets:3;-fx-border-radius:9;-fx-border-width:2;-fx-border-style:solid solid none solid;");
        vBox.getTransforms().add(rotate);
        vBox.setPrefWidth(200);
        vBox.setPrefHeight(419);
        vBox.setLayoutX(600);
        vBox.setLayoutY(600);
    }

    public static void addItem(String push) {

        Button button = new Button(push);
        buttonlist.add(button.getButton());
        vBox.getChildren().clear();
        vBox.getChildren().addAll(buttonlist);
    }

    public static void removeItem(int i) {
        buttonlist.remove(i);
        vBox.getChildren().clear();
        vBox.getChildren().addAll(buttonlist);
    }
}
