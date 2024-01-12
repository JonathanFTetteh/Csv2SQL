package de.srh.java.tetteh.database;

import de.srh.java.tetteh.Locations;

import java.sql.Connection;
import java.util.List;

public interface IDatabaseConnection {

    Connection getConnection();

    boolean csvToSql(List<Locations> locations);

    boolean insertCountries(List<Locations> locations);
    boolean insertCities(List<Locations> locations);
}
