package com.zuoyang.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum SingLetonEum {
    connectionFactory;
    private Connection connection;
    private SingLetonEum(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://39.105.162.18:3306";
            String user="root";
            String password="Dxf747598";
            connection = DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection(){
        return connection;
    }
}
