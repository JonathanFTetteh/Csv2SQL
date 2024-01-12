package de.srh.java.tetteh.fileReader;

import de.srh.java.tetteh.Locations;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public  class CSVReader {

    public static List<Locations> getListLocation() {
        return listLocation;
    }

    private static List<Locations> listLocation;
        private static  String path = "src/main/resources/country-list.csv";
        private static List<String> capitalCities;

        private static List<String> countries;

    public static void setPath(String path) {
        CSVReader.path = path;
        System.out.println("Pfard=" +path);
    }

        public static List<String> getCapitalCities() {
            return capitalCities;
        }

    public static List<String> getCountries() {
        return countries;
    }

    public static void readCsv(){

            capitalCities = new ArrayList<>();
            countries = new ArrayList<>();

            try {
                BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(path), StandardCharsets.UTF_8);
                String line = bufferedReader.readLine();
                while (line != null){
                    String[] attributes = line.split(",");
                    String city = attributes[1].replace("\"","");
                    capitalCities.add(city);
                    String country = attributes[0].replace("\"","");
                    countries.add(country);
                    line = bufferedReader.readLine();

                }

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
