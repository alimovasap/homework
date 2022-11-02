public class Methods3 
{
    public static void main(String[] args) 
    {
        int[] array = {123, 7, -14, 67, 16, 98, 75, 576};
        printArray(array);
        System.out.println("Min: " + getMinValue(array));
        System.out.println("Max: " + getMaxValue(array));
    }

    public static int getMaxValue(int[] array) 
    {
        int max = Integer.MIN_VALUE;
        for (int value : array) 
        {
            if (value > max) 
            {
                max = value;
            }
        }
        return max;
    }

    public static int getMinValue(int[] array) 
    {
        int min = Integer.MAX_VALUE;
        for (int value : array) 
        {
            if (value < min) 
            {
                min = value;
            }
        }
        return min;
    }

    public static void printArray(int[] array) 
    {
        for (int i : array) 
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}