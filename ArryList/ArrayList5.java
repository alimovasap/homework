import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList5 
{
    public static ArrayList<String> programmingLanguages = 
    new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Java", "Pascal"));

    public static void main(String[] args) 
    {
       for (int i = 0; i < programmingLanguages.size(); i++) 
        {
            if(programmingLanguages.get(i).equals("Pascal"))
            {
            programmingLanguages.remove(i);
            break;
            }
        }
    }
}
