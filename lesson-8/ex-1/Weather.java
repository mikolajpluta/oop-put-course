public class Weather{
    private Forecast forecast;
    private String cloudiness;

    public Weather(Forecast fc, String clouds){
        this.forecast = fc;
        this.cloudiness = clouds;
    }
    public void showWeatherParameters(){
        System.out.println("temperature: " + Float.toString(this.forecast.celsiusTemperature()) + " Celsius degrees\nhumidity: "
        + Float.toString(this.forecast.percentageHumidity()) + "%\ncloudiness: " + this.cloudiness);
    }
}
