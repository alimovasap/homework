import java.util.HashMap;

public class HashMap1 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) 
    {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.print("Средний балл группы: " + getAverageMark());
    }

    public static void addStudents() 
    {
        grades.put("Jack", 4.3d);
        grades.put("Nicolas", 4.1d);
        grades.put("Alex", 4.9d);
        grades.put("Jhon", 3.7d);
        grades.put("Mike", 3.2d);
    }

    public static void printStudents() 
    {
        for (String name: grades.keySet())
        {
            System.out.println(name);
        }
    }

    public static Double getAverageMark() 
    {
        Double identity = 0d;
        for (Double value : grades.values()) 
        {
            identity += value;
        }
        return identity / grades.size();
    }
}

/* 
В классе Solution объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента,
 а значение - его средняя оценка. На этот раз твоя задача — реализовать методы:
printStudents, который выводит только имена всех студентов (ключ коллекции);
getAverageMark, который возвращает средний балл всех студентов.
*/
