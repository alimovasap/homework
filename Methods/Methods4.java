public class Methods4 
{
    public static String city = "Токио";
    public static double population = 34.5;

    public static void main(String[] args) 
    {
        printCityPopulation("Джакарта", 25.3);
    }

    public static void printCityPopulation(String city, double population)
    {
        System.out.println("Население города " + city + " составляет " + population + " млн человек.");
        System.out.println("В то время как в самом густонаселенном городе " + Solution.city + " население составляет " + Solution.population + " млн человек.");
    }
}