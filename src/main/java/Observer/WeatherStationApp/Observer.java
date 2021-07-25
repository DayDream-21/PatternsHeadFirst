package Observer.WeatherStationApp;

interface Observer {
    void update(float temperature, float humidity, float pressure);
}
