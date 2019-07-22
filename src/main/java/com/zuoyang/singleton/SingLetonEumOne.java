package com.zuoyang.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingLetonEumOne {
    public enum SingLetonEumTest {
        connectionFactory;
        private Connection connection;
        private SingLetonEumTest(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306";
                String user="root";
                String password="root";
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
    public static Connection getConnection(){
        return SingLetonEumTest.connectionFactory.getConnection();
    }
}
