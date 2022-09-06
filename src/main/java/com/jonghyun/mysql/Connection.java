package com.jonghyun.mysql;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection {


    public static java.sql.Connection connection;
    public static Statement statement;
    public static boolean isConnected;

    public Connection() {
        isConnected = true;
        try {
            String[] arg = Mysql.info;
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + arg[0] + ":" + arg[1] + "/" + arg[2] + "?useSSL=false&autoReconnect=true&serverTimezone=UTC", arg[3], arg[4]);
            statement = connection.createStatement();
        } catch(Exception e)
        {
            e.printStackTrace();
            isConnected = false;
        }
    }

}
