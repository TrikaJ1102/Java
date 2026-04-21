

import java.sql.*;

public class JDBCProgram {

    static final String URL = "jdbc:mysql://localhost:3306/RestaurantDB";
    static final String USER = "root";        // change if needed
    static final String PASSWORD = "sit123"; // change to your MySQL password

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = con.createStatement();

            // ---------------- INSERT 10 RESTAURANTS ----------------
            System.out.println("\nInserting Restaurants...");
            stmt.executeUpdate("INSERT INTO Restaurant VALUES (1,'Cafe Java','Pune')");
            stmt.executeUpdate("INSERT INTO Restaurant VALUES (2,'Food Hub','Mumbai')");
            stmt.executeUpdate("INSERT INTO Restaurant VALUES (3,'Spicy Treat','Delhi')");
            stmt.executeUpdate("INSERT INTO Restaurant VALUES (4,'Urban Bites','Pune')");
            stmt.executeUpdate("INSERT INTO Restaurant VALUES (5,'Tasty Corner','Nashik')");
            stmt.executeUpdate("INSERT INTO Restaurant VALUES (6,'Green Leaf','Chennai')");
            stmt.executeUpdate("INSERT INTO Restaurant VALUES (7,'Royal Dine','Jaipur')");
            stmt.executeUpdate("INSERT INTO Restaurant VALUES (8,'Quick Eat','Hyderabad')");
            stmt.executeUpdate("INSERT INTO Restaurant VALUES (9,'Food Plaza','Nagpur')");
            stmt.executeUpdate("INSERT INTO Restaurant VALUES (10,'Cafe Delight','Pune')");

            // ---------------- INSERT 10 MENU ITEMS ----------------
            System.out.println("\nInserting Menu Items...");
            stmt.executeUpdate("INSERT INTO MenuItem VALUES (1,'Pasta',120,1)");
            stmt.executeUpdate("INSERT INTO MenuItem VALUES (2,'Pizza',90,1)");
            stmt.executeUpdate("INSERT INTO MenuItem VALUES (3,'Burger',80,2)");
            stmt.executeUpdate("INSERT INTO MenuItem VALUES (4,'Paneer Tikka',150,3)");
            stmt.executeUpdate("INSERT INTO MenuItem VALUES (5,'Poha',50,1)");
            stmt.executeUpdate("INSERT INTO MenuItem VALUES (6,'Pav Bhaji',70,4)");
            stmt.executeUpdate("INSERT INTO MenuItem VALUES (7,'Noodles',110,5)");
            stmt.executeUpdate("INSERT INTO MenuItem VALUES (8,'Paratha',60,1)");
            stmt.executeUpdate("INSERT INTO MenuItem VALUES (9,'Fried Rice',130,6)");
            stmt.executeUpdate("INSERT INTO MenuItem VALUES (10,'Pudding',95,1)");

            // ---------------- SELECT price <= 100 ----------------
            System.out.println("\nMenu Items with Price <= 100:");
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM MenuItem WHERE Price <= 100");
            printResultSet(rs1);

            // ---------------- SELECT items in Cafe Java ----------------
            System.out.println("\nMenu Items in 'Cafe Java':");
            ResultSet rs2 = stmt.executeQuery(
                "SELECT m.* FROM MenuItem m JOIN Restaurant r ON m.ResId = r.Id WHERE r.Name = 'Cafe Java'"
            );
            printResultSet(rs2);

            // ---------------- UPDATE price <=100 to 200 ----------------
            System.out.println("\nUpdating prices <=100 to 200...");
            stmt.executeUpdate("UPDATE MenuItem SET Price = 200 WHERE Price <= 100");

            ResultSet rs3 = stmt.executeQuery("SELECT * FROM MenuItem");
            printResultSet(rs3);

            // ---------------- DELETE items starting with P ----------------
            System.out.println("\nDeleting items starting with 'P'...");
            stmt.executeUpdate("DELETE FROM MenuItem WHERE Name LIKE 'P%'");

            ResultSet rs4 = stmt.executeQuery("SELECT * FROM MenuItem");
            printResultSet(rs4);

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ---------------- PRINT RESULTSET IN TABULAR FORMAT ----------------
    public static void printResultSet(ResultSet rs) throws Exception {
        ResultSetMetaData md = rs.getMetaData();
        int columns = md.getColumnCount();

        // Print column names
        for (int i = 1; i <= columns; i++) {
            System.out.print(md.getColumnName(i) + "\t");
        }
        System.out.println();

        // Print rows
        while (rs.next()) {
            for (int i = 1; i <= columns; i++) {
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }
    }
}