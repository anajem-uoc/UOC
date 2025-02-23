package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class PR1WheatherStationDataQueueTest {

    PR1WeatherStationDataQueue pr1q;

    public static final int SIZE = 1304; //Hardcoded per el test


    @Before
    public void setUp() {
        this.pr1q = new PR1WeatherStationDataQueue();

        assertNotNull(this.pr1q.getQueue());

    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @org.junit.Test
    public void queueTest() {
        assertEquals(SIZE, this.pr1q.getQueue().size());

        WeatherStationData weatherData1 = this.pr1q.getQueue().poll();
        Assert.assertEquals("MANRESA", weatherData1.getStationName());
        Assert.assertEquals(0, weatherData1.getPrecipitation(), 0);
        Assert.assertEquals(18.4, weatherData1.getAvgAirTemperature(), 0);

        WeatherStationData weatherData2 = this.pr1q.getQueue().poll();
        Assert.assertEquals("MANRESA", weatherData2.getStationName());
        Assert.assertEquals(0, weatherData2.getPrecipitation(), 0);
        Assert.assertEquals(17.0, weatherData2.getAvgAirTemperature(), 0);

        Assert.assertEquals(1, pr1q.getMeanPrecipitation(), 0);
        Assert.assertEquals(15.0, pr1q.getMeanAvgAirTemperature(), 0);
    }

}
