package observer.weather_station_app;

public class StatisticsDisplay implements Observer, DisplayElement{
    private float maxTemperature;
    private float minTemperature;
    private float tempSum;
    private int numReadings;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemperature + "/" + minTemperature);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        } else if (temperature < minTemperature) {
            minTemperature = temperature;
        }

        display();
    }
}
