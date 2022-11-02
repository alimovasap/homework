public class Array7 
{

    public static int[][] result = new int[10][];

    public static void main(String[] args) 
    {
        for (int i = 0; i < result.length; i++) 
        {
            result[i] = new int[i + 1];
            for (int j = 0; j < result[i].length; j++) 
            {
                result[i][j] = i + j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/* 
Создай треугольный массив, где значение каждого элемента — это сумма его индексов. Например:
array[7][3] = 7 + 3 = 10,
array[3][0] = 3 + 0 = 3.
*/