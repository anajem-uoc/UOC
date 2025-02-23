package edu.uoc.ds.adt;
import java.time.LocalDateTime;

public class WeatherStationData {
    private LocalDateTime lastUpdated;
    private String stationName;
    private String province;
    private double coordinate0;
    private double coordinate1;
    private double avgAirTemperature;
    private double precipitation;
    private double minAirTemperature;
    private double maxAirTemperature;

    public WeatherStationData(LocalDateTime lastUpdated, String stationName, String province,
                              double coordinate0, double coordinate1, double avgAirTemperature,
                              double precipitation, double minAirTemperature, double maxAirTemperature) {
        this.lastUpdated = lastUpdated;
        this.stationName = stationName;
        this.province = province;
        this.coordinate0 = coordinate0;
        this.coordinate1 = coordinate1;
        this.avgAirTemperature = avgAirTemperature;
        this.precipitation = precipitation;
        this.minAirTemperature = minAirTemperature;
        this.maxAirTemperature = maxAirTemperature;
    }

    public String getStationName() {
        return stationName;
    }

    public double getAvgAirTemperature() {
        return avgAirTemperature;
    }

    public double getPrecipitation() {
        return precipitation;
    }


    @Override
    public String toString() {
        return "WeatherStationData{" +
                "lastUpdated=" + lastUpdated +
                ", stationName='" + stationName + '\'' +
                ", province='" + province + '\'' +
                ", coordinate0=" + coordinate0 +
                ", coordinate1=" + coordinate1 +
                ", avgAirTemperature=" + avgAirTemperature +
                ", precipitation=" + precipitation +
                ", minAirTemperature=" + minAirTemperature +
                ", maxAirTemperature=" + maxAirTemperature +
                '}';
    }
}
