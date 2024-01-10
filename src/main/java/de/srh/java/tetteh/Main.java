package de.srh.java.tetteh;

import fileReader.CsvReader;

public class Main {
    public static void main(String[] args) {

        CsvReader.readCsv();
        System.out.println(CsvReader.getCapitalCities());
        System.out.println(CsvReader.getCountries());
    }
}