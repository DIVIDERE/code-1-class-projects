public class WeatherForecast {
    private int temperature = 70;       // default temperature in Fahrenheit
    private String condition = "sunny";     // default weather condition

    // Default constructor
    public WeatherForecast() {
    }
        // uses default values set above
    
    // Overloaded constructor
    public WeatherForecast(int temperature, String condition) {
        this.temperature = temperature;
        this.condition = condition;
    }
    
    // Mutators
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }

    // Accessors
    public int getTemperature() {
        return temperature;
    }
    public double getTemperatureCelsius() {
        return (temperature - 32) * 5 / 9;
    }
    public String getCondition() {
        return condition;
    }
}
