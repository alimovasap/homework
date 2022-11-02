public class Methods1 
{
    public static void main(String[] args) 
    {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) 
    {
        
        for (int i = 0; i < array.length / 2; i++) 
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void printArray(int[] array) 
    {
        for (int i : array) 
        {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

/* 
Pеализовать метод reverseArray(). Он должен менять порядок элементов массива на обратный.
Метод должен работать только с массивами целочисленных значений (int[]).
Если массив содержал элементы:
1, 2, 3, 4, 5, 6, 7, 8, 9, 0
то после вызова метода reverseArray() должен содержать:
0, 9, 8, 7, 6, 5, 4, 3, 2, 1
*/

