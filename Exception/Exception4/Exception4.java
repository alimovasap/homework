public class Exception4 
{
    public static void main(String[] args) 
    {
        Lion lion = new Lion();
        lion.eat(new Food("мясо"));
        lion.eat(null);
    }
}
