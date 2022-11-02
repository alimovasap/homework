public class Exception2 
{

    public static final String PROMPT_STRING = "Введите номер студента, или exit для выхода: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "Отвечает ";
    public static final String NOT_EXIST = "Студента с таким номером не существует";
    public static final String INTEGER_REQUIRED = "Нужно ввести целое число";

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
            try
            {
                System.out.print(PROMPT_STRING);
                String input = scanner.nextLine();
                if (input.toLowerCase().equals(EXIT)) 
                {
                    break;
                }
                int studentId = Integer.parseInt(input);
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            }
            catch(NumberFormatException e)
            {
               System.out.println(INTEGER_REQUIRED);  
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
               System.out.println(NOT_EXIST);  
            }
        }
    }
}