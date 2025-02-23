package edu.uoc.ds.adt;

import edu.uoc.ds.traversal.Iterator;
import org.apache.commons.csv.*;
import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

public class PR1WeatherStationDataQueue {

    private Queue<WeatherStationData> qWeather;

    public static final int CAPACITY = 1500;
    public PR1WeatherStationDataQueue() {
        newQueue();
        this.fillQueue();
    }
    public void newQueue() {
        qWeather = new QueueArrayImpl<>(CAPACITY);
    }

    // Funció proporcionada
    private void fillQueue() {
        CSVParser csvParser = CSVReader.getCVSParser("weatherData.csv");
        for (CSVRecord record : csvParser) {
            WeatherStationData weatherData = new WeatherStationData(
                    DateUtils.getLocalDateTime(record.get("lastUpdated")),
                    record.get("weatherStation.name"),
                    record.get("weatherStation.province"),
                    Double.parseDouble(record.get("weatherStation.location.coordinates.0")),
                    Double.parseDouble(record.get("weatherStation.location.coordinates.1")),
                    Double.parseDouble(record.get("avgAirTemperature")),
                    Double.parseDouble(record.get("precipitation")),
                    Double.parseDouble(record.get("minAirTemperature")),
                    Double.parseDouble(record.get("maxAirTemperature"))
            );

            qWeather.add(weatherData);
        }
    }

    public Queue<WeatherStationData> getQueue() {
        return qWeather;
    }

    public double getMeanPrecipitation() {
        if (qWeather.isEmpty()) {
            return 0;
        }
        double sum = 0;
        int count = 0;
        Iterator<WeatherStationData> it = qWeather.values();
        while (it.hasNext()) {
            WeatherStationData data = it.next();
            sum += data.getPrecipitation();
            count++;
        }
        double mean = sum / count;
        return Math.floor(mean);
    }

    public double getMeanAvgAirTemperature() {
        if (qWeather.isEmpty()) {
            return 0;
        }
        double sum = 0;
        int count = 0;
        Iterator<WeatherStationData> it = qWeather.values();
        while (it.hasNext()) {
            WeatherStationData data = it.next();
            sum += data.getAvgAirTemperature();
            count++;
        }
        double mean = sum / count;

        return Math.floor(mean);
    }
}
