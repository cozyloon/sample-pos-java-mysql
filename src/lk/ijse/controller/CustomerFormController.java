package lk.ijse.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerFormController {
    public AnchorPane root;
    public TextField txtCusId;
    public TextField txtCusName;
    public TextField txtCusSalary;
    public TextField txtCusAddress;
    public Button btnSave;
    public TableView tblCustomers;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colSalary;
    public TableColumn colAddress;
    public Button btnNewCustomer;
    public Button btnBack;
    public TableColumn colOperate;

    private void navigation(String s) throws IOException {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource(s))));
        stage.centerOnScreen();
    }

    public void btnSaveOnClick(MouseEvent mouseEvent) throws IOException {

    }

    public void btnNewCustomerOnClick(MouseEvent mouseEvent) {
    }

    public void btnonClickBack(MouseEvent mouseEvent) throws IOException {
        navigation("/lk/ijse/view/DashboardForm.fxml");
    }
}
