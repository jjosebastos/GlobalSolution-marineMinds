/**
 * Classe utilizada para a traçar a localização do usuario
 * de acordo com a relação da latitude e longitude.
 * @author MarineMinds
 * @version 1.0-SNAPSHOT
 **/

package com.mrm.model;

public class Localizacao {
    public double latitude;
    public double longitude;

    public Localizacao(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Localizacao(){}

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "\nLocalizacao{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
