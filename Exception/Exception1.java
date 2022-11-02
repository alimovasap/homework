import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exception1 
{

    public static final String PROMPT_STRING = "Введите номер студента, или exit для выхода: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Отвечает ";
    public static final String NOT_EXIST = "Студента с таким номером не существует";

    static List<String> studentsJournal = Arrays.asList(
            "Jack"
            , "John"
            , "Mike"
            , "Nick"
            , "Henry");

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();
            if (input.toLowerCase().equals(EXIT)) 
            {
                break;
            }

            int studentId = Integer.parseInt(input);
            try 
            {
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } 
            catch (Exception e) 
            {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
