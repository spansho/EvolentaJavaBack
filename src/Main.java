import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите дату в формате 'дд.мм.гггг");
        String string=scanner.nextLine();
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd.MM.yyyy");

        // Формат целевой даты
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = inputFormat.parse(string);

            // Преобразуем объект Date в строку с новым форматом
            String outputDate = outputFormat.format(date);
            System.out.println(outputDate);
        } catch (ParseException e) {
            System.out.println("Ошибка при парсинге даты: " + e.getMessage());
        }
    }
}