package observer.weather_station_app;

interface Observer {
    void update(float temperature, float humidity, float pressure);
}
