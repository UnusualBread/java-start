package C02_java.M02_code_organization.S01_code_style.L02_naming_variables;

/*
Refactor the following poorly named variables in a weather
application to follow Java naming conventions:
int t = 25;
int h = 60;
int w = 6;
Print three lines with the refactored variable names and their values.
*/

public class T02_WeatherDataPrinter {
    public static void main(String[] args) {
        int airTemperature = 25;
        int airHumidity = 60;
        int windSpeed = 6;

        // TODO: Refactor variable names and print the results
        System.out.println("airTemperature = " + airTemperature);
        System.out.println("airHumidity = " + airHumidity);
        System.out.println("windSpeed = " + windSpeed);
    }
}
