package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class Controller {

    StackWithLinkList<String> stack = new StackWithLinkList<>();

    @FXML
    private AnchorPane mainAnchorPane;

    @FXML
    private JFXButton popButton;

    @FXML
    private Label popLabel;

    @FXML
    private JFXButton pushButton;

    @FXML
    private JFXTextField pushTF;

    @FXML
    private JFXButton peekButton;

    @FXML
    private JFXButton sizeOfStackButton;

    @FXML
    private Label peekLabel;

    @FXML
    private Label sizeLabel;

    @FXML
    private JFXButton helpButton;

    @FXML
    private AnchorPane helpAnchorPane;

    @FXML
    private JFXButton backButton;

    @FXML
    void backHandleButtonAction(ActionEvent event) {
        if (event.getSource() == backButton) {
            helpAnchorPane.setVisible(false);
        }
    }

    @FXML
    void helpHandleButtonAction(ActionEvent event) {
        if (event.getSource() == helpButton) {
            helpAnchorPane.setVisible(true);
        }
    }

    @FXML
    void stackButtonHandleAction(ActionEvent event) {
        if (event.getSource() == popButton) {
            if (stack.pop() != null) {
                Main.removeItem(0);
                popLabel.setText("  " + stack.pop() + " deleted.");
            } else {
                System.out.print("454");
                popLabel.setText("Stack is empty.");
            }
            pushTF.setText("");
            peekLabel.setText("");
            sizeLabel.setText("");
        } else if (event.getSource() == pushButton) {
            if (pushTF.getText().equals("")) {
                pushTF.setStyle("-fx-border-color:red;-fx-border-insets:1;-fx-border-radius:9;");
            } else {
                pushTF.setStyle("-fx-border-color:#E7626F;-fx-border-insets:1;-fx-border-radius:9;");
                stack.push(pushTF.getText());
                Main.addItem(pushTF.getText());
                pushTF.setText("");
                popLabel.setText("");
                peekLabel.setText("");
                sizeLabel.setText("");
            }
        } else if (event.getSource() == peekButton) {
            peekLabel.setText(stack.peek());
            pushTF.setText("");
            popLabel.setText("");
            sizeLabel.setText("");
        } else if (event.getSource() == sizeOfStackButton) {
            sizeLabel.setText("" + stack.size());
        }
    }
}
