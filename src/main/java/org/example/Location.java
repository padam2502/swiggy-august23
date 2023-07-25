package org.example;

public class Location {
    String restroid;
     float lat;
     float lang;

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLang() {
        return lang;
    }

    public void setLang(float lang) {
        this.lang = lang;
    }
    public String getRestroid()
    {
        return restroid;
    }

    public void setRestroid(String restroid) {
        this.restroid = restroid;
    }

    @Override
    public String toString() {
        return "Location{" +
                "restroid='" + restroid + '\'' +
                ", lat=" + lat +
                ", lang=" + lang +
                '}';
    }
}
