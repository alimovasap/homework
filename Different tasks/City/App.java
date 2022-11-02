public class App
{

    public static void showWeather(City city) 
    {
        System.out.println(String.format("В городе %s сегодня температура воздуха %d", city.getName(), city.getTemperature()));
    }

    public static void main(String[] args) 
    {
        City city = new City("Rehovot", 23);
        showWeather(city);
    }
}
