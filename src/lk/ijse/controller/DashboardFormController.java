package lk.ijse.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {
    public AnchorPane root;

    private void navigation(String s) throws IOException {
        Stage stage= (Stage) root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource(s))));
        stage.centerOnScreen();
    }

    public void imgOnClickCus(MouseEvent mouseEvent) throws IOException {
        navigation("/lk/ijse/view/CustomerForm.fxml");
    }

    public void imgOnClickItem(MouseEvent mouseEvent) throws IOException {
        navigation("/lk/ijse/view/ItemForm.fxml");
    }

    public void imgOnClickOrder(MouseEvent mouseEvent) throws IOException {
        navigation("/lk/ijse/view/OrderForm.fxml");
    }

    public void imgOnClickSettings(MouseEvent mouseEvent) throws IOException {
        navigation("/lk/ijse/view/");
    }
}
