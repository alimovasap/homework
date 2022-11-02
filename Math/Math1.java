import java.util.Scanner;

public class Math1 
{

    public static void main(String[] args) 
    {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) 
    {
        int min = ints[0];
        for (int number : ints) 
        {
            min = Math.min(min, number);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 чисел: ");
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) 
        {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}

/* 
Считать 10 чисел с консоли и заполнить ими массив с помощью метода getArrayOfTenElements().
Найти минимальный элемент массива и вернуть этот элемент с помощью метода min(int[]).
В методе min(int[]) обязательно используй метод Math.min(int, int).
*/
