public class WeatherForecastTester {
    public static void main(String[] args) {
        // Create a WeatherForecast object using the default constructor
        WeatherForecast defaultForecast = new WeatherForecast();
        System.out.println("Default Forecast:");
        System.out.println("Temperature (F): " + defaultForecast.getTemperature());
        System.out.println("Temperature (C): " + defaultForecast.getTemperatureCelsius());
        System.out.println("Condition: " + defaultForecast.getCondition());
        
        // Create a WeatherForecast object using the overloaded constructor
        WeatherForecast customForecast = new WeatherForecast(85, "cloudy");
        System.out.println("\nCustom Forecast:");
        System.out.println("Temperature (F): " + customForecast.getTemperature());
        System.out.println("Temperature (C): " + customForecast.getTemperatureCelsius());
        System.out.println("Condition: " + customForecast.getCondition());
        
        // Modify the weather forecast using mutators
        customForecast.setTemperature(90);
        customForecast.setCondition("rainy");
        System.out.println("\nUpdated Custom Forecast:");
        System.out.println("Temperature (F): " + customForecast.getTemperature());
        System.out.println("Temperature (C): " + customForecast.getTemperatureCelsius());
        System.out.println("Condition: " + customForecast.getCondition());
    }
}
