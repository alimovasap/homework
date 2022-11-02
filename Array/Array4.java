import java.util.Scanner;

public class Array4 
{
    public static int[] array;

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        array = new int[n];
        for (int i = 0; i < n; i++) 
        {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) 
        {
            int number = array[i];
            if (number > max) 
            {
                max = number;
            }
        }

        System.out.println(max);
    }
}

/* 
В этой задаче тебе нужно:
-Ввести с клавиатуры число N.
-Считать N целых чисел и заполнить ими массив array.
-Найти максимальное число среди элементов массива.
*/

