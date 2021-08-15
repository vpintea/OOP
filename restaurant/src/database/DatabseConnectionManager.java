package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabseConnectionManager {

    private Connection conn;

    private static DatabseConnectionManager connectionInstance = new DatabseConnectionManager();

    private DatabseConnectionManager() {

    }

    public static DatabseConnectionManager getManagerInstance(){
        return connectionInstance;
    }

    /**
     * contains connection details
     * @throws SQLException
     */
    public void connect() throws SQLException {
        // processing specific to database connection details...
        conn = DriverManager.getConnection("Some/Database/URL");
        System.out.println("Established Databse Connection..");
    }

    public Connection getConnectionObject() {
        return conn;

    }

}
