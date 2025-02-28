import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите дату в формате 'дд.мм.гггг");
        String stringa=scanner.nextLine();
        String newString=stringa.substring(stringa.length()-4,stringa.length())+"-"+stringa.substring(3,5)+"-"+stringa.substring(0,2);

        System.out.println("Преоразование с помощью методов строки");
        System.out.println(newString);

        SimpleDateFormat inputFormat = new SimpleDateFormat("dd.MM.yyyy");

        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Преоразование с помощью Date");
        try {
            Date date = inputFormat.parse(stringa);

            String outputDate = outputFormat.format(date);
            System.out.println(outputDate);
        } catch (ParseException e) {
            System.out.println("Ошибка при парсинге даты: " + e.getMessage());
        }
    }
}