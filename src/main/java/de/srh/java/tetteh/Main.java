package de.srh.java.tetteh;

import de.srh.java.tetteh.database.MySQLConnection;
import de.srh.java.tetteh.fileReader.CSVReader;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    private static final String PATH = "src/main/resources/config.properties";




    public static void main(String[] args) {
 /*       Properties properties = new Properties();


        try {
            InputStream input = new FileInputStream(PATH);

            properties.load(input);

        }
        catch (Exception exception){
            System.out.println("Error: Cannot read properties!\n" + exception.getMessage());
            System.exit(-1);
        }*/
        CSVReader.readCsv();
        MySQLConnection mySQLConnection = new MySQLConnection();
        mySQLConnection.checkForDatabase();
    /*    mySQLConnection.createDB();
        mySQLConnection.createTables();
        mySQLConnection.deleteDB();*/
        // mySQLConnection.insertCountries(CSVReader.getListLocation());
        //   mySQLConnection.insertCities(CSVReader.getListLocation());
        // System.out.println(CSVReader.getListLocation().get(158).getCity());
        //  mySQLConnection.csvToSql(CSVReader.getListLocation());
        //  mySQLConnection.addCities(CSVReader.getListLocation());










    }


}