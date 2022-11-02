import java.util.Arrays;

public class Array10 
{
    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) 
    {
        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        Arrays.fill(array, 0, firstPart, valueStart);
        Arrays.fill(array, firstPart, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}

/* 
Реализуй статический метод main(String[]), который заполняет массив array значениями valueStart и valueEnd.
Если длина массива четная, его первую половину нужно заполнить значениями valueStart, 
а вторую — valueEnd. Если длина массива нечётная, то первую большую часть заполнить значениями valueStart,
 вторую меньшую — valueEnd.
*/