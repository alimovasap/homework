import java.util.ArrayList;

public class ArrayList7 
{

    public static void main(String[] args) 
    {
        var students = new ArrayList<Student>();
        students.add(new Student("Jack"));
        students.add(new Student("Nick"));
        students.add(new Student("Nicolos"));
        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students) 
    {
        for (int i = 0; i < students.size(); i++) 
        {
            System.out.println(students.get(i).getName());
        }
    }
}
