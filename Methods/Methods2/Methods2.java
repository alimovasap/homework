public class Methods2 
{
    public static void main(String[] args) 
    {
        Person person = new Person("Jack", "Jackson");
        System.out.println("Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Full name: " + person.getFullName());
    }
}
