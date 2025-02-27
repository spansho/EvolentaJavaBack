import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите строку");
        String string=scanner.nextLine();
        System.out.println("Введите подстроку");
        String subString=scanner.nextLine();
        int countOfEntryOfSubstring=(string.length() - string.replace(subString, "").length()) / subString.length();
        System.out.println(String.format("Подстрока %s входит в строку %d раз",subString,countOfEntryOfSubstring));
    }
}