import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList8 
{
    public static String bug = "bug";

    public static void main(String[] args) 
    {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) 
    {
        for (int i = 0; i < list.size(); i++) 
        {
            String str = list.get(i);
            if (bug.equalsIgnoreCase(str)) 
            {
                list.remove(str);
                i--;
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) 
    {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) 
        {
            String str = it.next();
            if (bug.equalsIgnoreCase(str)) 
            {
                it.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) 
    {
        ArrayList<String> listCopy = new ArrayList<>(list);
        for (String str : listCopy) 
        {
            if (bug.equalsIgnoreCase(str)) 
            {
                list.remove(str);
            }
        }
    }
}

/* 
removeBugWithFor(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug, используя цикл for и счетчик.
removeBugWithWhile(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug, используя цикл while и метод iterator().
removeBugWithCopy(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug, используя цикл for-each и копию списка.
В слове bug может быть разный регистр букв (BUg, BuG, и т.д.).
*/
