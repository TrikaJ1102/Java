import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.Connection;

public class MainApp extends Application {

    static Connection con;

    @Override
    public void start(Stage primaryStage) {
        try {
            con = RestaurantJDBC.getConnection();
            RestaurantJDBC.createTables(con);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Database Error");
            alert.setHeaderText("Could not connect to database.");
            alert.setContentText(e.getMessage());
            alert.showAndWait();
            return;
        }

        showMainMenu(primaryStage);
    }

    public static void showMainMenu(Stage stage) {

        Label titleLabel = new Label("Restaurant Management System");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        Label subLabel = new Label("Select a table to manage:");

        Button restaurantBtn = new Button("Manage Restaurants");
        Button menuItemBtn = new Button("Manage Menu Items");
        Button exitBtn = new Button("Exit");

        restaurantBtn.setOnAction(e -> new RestaurantUI(stage).show());
        menuItemBtn.setOnAction(e -> new MenuItemUI(stage).show());

        exitBtn.setOnAction(e -> {
            try {
                if (con != null && !con.isClosed())
                    con.close();
            } catch (Exception ex) {
            }
            stage.close();
        });

        VBox vbox = new VBox(15, titleLabel, subLabel, restaurantBtn, menuItemBtn, exitBtn);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(40));

        BorderPane root = new BorderPane();
        root.setCenter(vbox);

        stage.setScene(new Scene(root, 450, 350));
        stage.setTitle("Restaurant Management System");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}