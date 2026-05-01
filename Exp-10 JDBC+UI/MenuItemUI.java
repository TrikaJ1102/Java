import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class MenuItemUI {

    private Stage stage;
    private TableView<MenuItemRow> tableView;
    private ObservableList<MenuItemRow> data;

    private TextField idField, nameField, priceField, resIdField, filterPriceField;
    private Label statusLabel;

    public MenuItemUI(Stage stage) {
        this.stage = stage;
    }

    public void show() {

        Button backBtn = new Button("← Back");
        backBtn.setOnAction(e -> MainApp.showMainMenu(stage));

        tableView = new TableView<>();
        data = FXCollections.observableArrayList();
        tableView.setItems(data);

        TableColumn<MenuItemRow, String> idCol = new TableColumn<>("ID");
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<MenuItemRow, String> nameCol = new TableColumn<>("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<MenuItemRow, String> priceCol = new TableColumn<>("Price");
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<MenuItemRow, String> resCol = new TableColumn<>("ResID");
        resCol.setCellValueFactory(new PropertyValueFactory<>("resId"));

        tableView.getColumns().addAll(idCol, nameCol, priceCol, resCol);

        idField = new TextField();
        nameField = new TextField();
        priceField = new TextField();
        resIdField = new TextField();
        filterPriceField = new TextField();

        Button insertBtn = new Button("INSERT");
        Button selectBtn = new Button("SELECT");
        Button updateBtn = new Button("UPDATE");
        Button deleteBtn = new Button("DELETE");
        Button filterBtn = new Button("FILTER");

        insertBtn.setOnAction(e -> handleInsert());
        selectBtn.setOnAction(e -> handleSelect());
        updateBtn.setOnAction(e -> handleUpdate());
        deleteBtn.setOnAction(e -> handleDelete());
        filterBtn.setOnAction(e -> handleFilter());

        VBox layout = new VBox(10,
                backBtn,
                tableView,
                idField, nameField, priceField, resIdField,
                insertBtn, selectBtn, updateBtn, deleteBtn,
                filterPriceField, filterBtn);

        layout.setPadding(new Insets(10));

        statusLabel = new Label();

        BorderPane root = new BorderPane();
        root.setCenter(layout);
        root.setBottom(statusLabel);

        stage.setScene(new Scene(root, 700, 500));
        stage.show();

        handleSelect();
    }

    private void handleInsert() {
        try {
            RestaurantJDBC.insertMenuItem(MainApp.con,
                    Integer.parseInt(idField.getText()),
                    nameField.getText(),
                    Double.parseDouble(priceField.getText()),
                    Integer.parseInt(resIdField.getText()));

            setStatus("Inserted", "green");
            handleSelect();
        } catch (Exception e) {
            setStatus("Error", "red");
        }
    }

    private void handleSelect() {
        try {
            data.clear();
            ArrayList<String[]> rows = RestaurantJDBC.getAllMenuItems(MainApp.con);

            for (String[] r : rows)
                data.add(new MenuItemRow(r[0], r[1], r[2], r[3]));

            setStatus("Loaded", "blue");
        } catch (Exception e) {
            setStatus("Error", "red");
        }
    }

    private void handleUpdate() {
        try {
            RestaurantJDBC.updateMenuItem(MainApp.con,
                    Integer.parseInt(idField.getText()),
                    nameField.getText(),
                    Double.parseDouble(priceField.getText()),
                    Integer.parseInt(resIdField.getText()));

            setStatus("Updated", "green");
            handleSelect();
        } catch (Exception e) {
            setStatus("Error", "red");
        }
    }

    private void handleDelete() {
        try {
            RestaurantJDBC.deleteMenuItem(MainApp.con,
                    Integer.parseInt(idField.getText()));

            setStatus("Deleted", "green");
            handleSelect();
        } catch (Exception e) {
            setStatus("Error", "red");
        }
    }

    private void handleFilter() {
        try {
            data.clear();
            ArrayList<String[]> rows = RestaurantJDBC.getMenuItemsByMaxPrice(
                    MainApp.con,
                    Double.parseDouble(filterPriceField.getText()));

            for (String[] r : rows)
                data.add(new MenuItemRow(r[0], r[1], r[2], r[3]));

            setStatus("Filtered", "purple");
        } catch (Exception e) {
            setStatus("Error", "red");
        }
    }

    private void setStatus(String msg, String color) {
        statusLabel.setText(msg);
        statusLabel.setStyle("-fx-text-fill:" + color);
    }

    public static class MenuItemRow {
        private String id, name, price, resId;

        public MenuItemRow(String id, String name, String price, String resId) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.resId = resId;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getPrice() {
            return price;
        }

        public String getResId() {
            return resId;
        }
    }
}