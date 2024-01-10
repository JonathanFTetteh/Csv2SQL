package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class MySQLConnection {


        private String host = "127.0.0.1";
        private String username = "root";
        private String password = "";
        private int port = 3306;
        private String dbname = "Csv2SQL";
        private Connection connection = null;

        public MySQLConnection(Properties dbProperties) {
            if (dbProperties != null) {
                System.out.println("INFO: reading database config...");

                host = dbProperties.getProperty("db.host");
                username = dbProperties.getProperty("db.username");
                password = dbProperties.getProperty("db.password");
                port = Integer.valueOf(dbProperties.getProperty("db.port"));
                dbname = dbProperties.getProperty("db.dbname");
            }
        }


    }

