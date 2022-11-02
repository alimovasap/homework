import java.util.ArrayList;

public class ArrayList1
{
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
    }

    public static void main(String[] args) 
    {
        initEmployees();
    }

    public static void paySalary(String name) 
    {
        if (waitingEmployees.contains(name) && !alreadyGotSalaryEmployees.contains(name)) 
        {
            alreadyGotSalaryEmployees.add(name);
            for (int i = 0; i < waitingEmployees.size(); i++) 
            {
                if (waitingEmployees.get(i) != null && waitingEmployees.get(i).equals(name)) 
                {
                    waitingEmployees.set(i, null);
                    break;
                }
            }
        }
    }
}

/* 
В классе Solution есть список сотрудников waitingEmployees, которые ждут зарплату, 
и список сотрудников alreadyGotSalaryEmployees, которые её уже получили. Необходимо реализовать метод paySalary(String), 
который в качестве аргумента принимает имя сотрудника, желающего получить зарплату.
Метод должен проверить наличие сотрудника в списке waitingEmployees, и если он не получал зарплату, выдать её.
*/