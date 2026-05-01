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

public class RestaurantUI {

    private Stage stage;
    private TableView<RestaurantRow> tableView;
    private ObservableList<RestaurantRow> data;

    private TextField idField;
    private TextField nameField;
    private TextField addressField;

    private Label statusLabel;

    public RestaurantUI(Stage stage) {
        this.stage = stage;
    }

    public void show() {

        Label title = new Label("Restaurant Table - CRUD Operations");
        title.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        Button backBtn = new Button("← Back to Menu");
        backBtn.setOnAction(e -> MainApp.showMainMenu(stage));

        HBox topBar = new HBox(20, backBtn, title);
        topBar.setAlignment(Pos.CENTER_LEFT);
        topBar.setPadding(new Insets(10));

        tableView = new TableView<>();
        data = FXCollections.observableArrayList();
        tableView.setItems(data);

        TableColumn<RestaurantRow, String> idCol = new TableColumn<>("ID");
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        idCol.setPrefWidth(60);

        TableColumn<RestaurantRow, String> nameCol = new TableColumn<>("Name");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        nameCol.setPrefWidth(180);

        TableColumn<RestaurantRow, String> addressCol = new TableColumn<>("Address");
        addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        addressCol.setPrefWidth(220);

        tableView.getColumns().addAll(idCol, nameCol, addressCol);

        tableView.setOnMouseClicked(e -> {
            RestaurantRow selected = tableView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                idField.setText(selected.getId());
                nameField.setText(selected.getName());
                addressField.setText(selected.getAddress());
            }
        });

        idField = new TextField();
        nameField = new TextField();
        addressField = new TextField();

        idField.setPromptText("e.g. 11");
        nameField.setPromptText("e.g. Spice Garden");
        addressField.setPromptText("e.g. 123 MG Road");

        GridPane form = new GridPane();
        form.setHgap(10);
        form.setVgap(10);
        form.setPadding(new Insets(10));

        form.add(new Label("ID:"), 0, 0);
        form.add(idField, 1, 0);
        form.add(new Label("Name:"), 0, 1);
        form.add(nameField, 1, 1);
        form.add(new Label("Address:"), 0, 2);
        form.add(addressField, 1, 2);

        Button insertBtn = new Button("INSERT");
        Button selectBtn = new Button("SELECT ALL");
        Button updateBtn = new Button("UPDATE");
        Button deleteBtn = new Button("DELETE");
        Button clearBtn = new Button("Clear Fields");

        insertBtn.setOnAction(e -> handleInsert());
        selectBtn.setOnAction(e -> handleSelectAll());
        updateBtn.setOnAction(e -> handleUpdate());
        deleteBtn.setOnAction(e -> handleDelete());

        clearBtn.setOnAction(e -> {
            idField.clear();
            nameField.clear();
            addressField.clear();
            statusLabel.setText("Fields cleared.");
        });

        VBox buttonBox = new VBox(10, insertBtn, selectBtn, updateBtn, deleteBtn, clearBtn);
        buttonBox.setPadding(new Insets(10));

        VBox rightPanel = new VBox(15, form, buttonBox);
        rightPanel.setPadding(new Insets(10));

        statusLabel = new Label("Ready.");

        BorderPane root = new BorderPane();
        root.setTop(topBar);
        root.setCenter(tableView);
        root.setRight(rightPanel);
        root.setBottom(statusLabel);

        Scene scene = new Scene(root, 800, 450);
        stage.setScene(scene);
        stage.setTitle("Manage Restaurants");
        stage.show();

        handleSelectAll();
    }

    private void handleInsert() {
        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            String address = addressField.getText();

            RestaurantJDBC.insertRestaurant(MainApp.con, id, name, address);
            setStatus("Inserted", "green");
            handleSelectAll();
        } catch (Exception e) {
            setStatus("Error: " + e.getMessage(), "red");
        }
    }

    private void handleSelectAll() {
        try {
            data.clear();
            ArrayList<String[]> rows = RestaurantJDBC.getAllRestaurants(MainApp.con);

            for (String[] row : rows) {
                data.add(new RestaurantRow(row[0], row[1], row[2]));
            }

            setStatus("Loaded " + rows.size(), "blue");
        } catch (Exception e) {
            setStatus("Error: " + e.getMessage(), "red");
        }
    }

    private void handleUpdate() {
        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            String address = addressField.getText();

            RestaurantJDBC.updateRestaurant(MainApp.con, id, name, address);
            setStatus("Updated", "green");
            handleSelectAll();
        } catch (Exception e) {
            setStatus("Error", "red");
        }
    }

    private void handleDelete() {
        try {
            int id = Integer.parseInt(idField.getText());

            RestaurantJDBC.deleteRestaurant(MainApp.con, id);
            setStatus("Deleted", "green");
            handleSelectAll();
        } catch (Exception e) {
            setStatus("Error", "red");
        }
    }

    private void setStatus(String msg, String color) {
        statusLabel.setText(msg);
        statusLabel.setStyle("-fx-text-fill: " + color);
    }

    public static class RestaurantRow {
        private String id, name, address;

        public RestaurantRow(String id, String name, String address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }
    }
}