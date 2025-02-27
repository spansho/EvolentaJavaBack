import java.util.*;

public class Main
{
    public static void main(String[] args) {
        int[] randomArray = new int[20];
        Map<Integer, Integer> mapOfOccurrences = new HashMap<Integer, Integer>();
        Random rnd = new Random();
        for (int i = 0; i < 20; ++i) {
            randomArray[i] = rnd.nextInt(15) + 1;
            if (mapOfOccurrences.containsKey(randomArray[i]))
                mapOfOccurrences.put(randomArray[i], mapOfOccurrences.get(randomArray[i]) + 1);
            else {
                mapOfOccurrences.put(randomArray[i], 1);
            }
            System.out.print(randomArray[i]+" ");
        }
        System.out.println();
        mapOfOccurrences.forEach((key,value) ->{
            System.out.println(String.format("Число %d встречает %d раз",key,value));
        });
    }
}
