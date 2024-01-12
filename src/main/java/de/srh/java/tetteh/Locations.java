package de.srh.java.tetteh;

public class Locations {

    private String city, country;

    public String getCity() {
        return city;
    }

    public Locations(String city, String country) {
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Locations{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getCountry() {
        return country;
    }

}
