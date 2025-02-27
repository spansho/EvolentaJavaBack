import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите строку");
        String string=scanner.nextLine();
        String[] toReplace = {"кака", "бяка"};
        for(int i=0;i<toReplace.length;i++)
        {
            string=string.replace(toReplace[i],"вырезанно цензурой");
        }
        System.out.println(string);
    }
}