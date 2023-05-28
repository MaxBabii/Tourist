package com.maksym.tourist.tourist;

public class Distribution {
    private String Cities;
    private String PopularPlaces;
    private String Pab;
    private String Hotel;

    public Distribution(String Cities, String PopularPlaces, String Pab, String Hotel){
        this.Cities = Cities;
        this.PopularPlaces = PopularPlaces;
        this.Pab = Pab;
        this.Hotel = Hotel;
    }

    public String getCities() {
        return Cities;
    }

    public void setCities(String cities) {
        Cities = cities;
    }

    public String getPopularPlaces() {
        return PopularPlaces;
    }

    public void setPopularPlaces(String popularPlaces) {
        PopularPlaces = popularPlaces;
    }

    public String getPab() {
        return Pab;
    }

    public void setPab(String pab) {
        Pab = pab;
    }

    public String getHotel() {
        return Hotel;
    }

    public void setHotel(String hotel) {
        Hotel = hotel;
    }
}
