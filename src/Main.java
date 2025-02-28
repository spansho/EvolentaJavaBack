import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате 'дд.мм.гггг':");
        String string = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        try {
            Date date = sdf.parse(string);
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            calendar.add(GregorianCalendar.DAY_OF_MONTH, 45);
            System.out.println("Дата после добавления 45 дней:");
            System.out.println(sdf.format(calendar.getTime()));


            calendar.set(GregorianCalendar.MONTH, GregorianCalendar.JANUARY); //
            calendar.set(GregorianCalendar.DAY_OF_MONTH, 1);
            System.out.println("Дата после сдвига на начало года");
            System.out.println(sdf.format(calendar.getTime()));
            System.out.println("Дата после прибавления 10 рабочих дней ");
            calendar.setTime(date);
            addWorkingDays(calendar,10);
            System.out.println(sdf.format(calendar.getTime()));//сюда изначальную дату надо бахнуть
            System.out.println("Введите дату в формате 'дд.мм.гггг':");
            String secondDate = scanner.nextLine();
            Date secondzDate = sdf.parse(secondDate);
            int diffrenece=differenceDay(calendar,date,secondzDate);
            System.out.println(String.format("Разница между введенными датами составляет %d дней",diffrenece));


        } catch (ParseException e) {
            System.out.println("Ошибка: введённая дата не соответствует формату 'дд.мм.гггг'.");
        }
    }

    public static void addWorkingDays(GregorianCalendar calendar, int workingDays) {
        int addedDays = 0;

        while (addedDays < workingDays) {
            calendar.add(GregorianCalendar.DAY_OF_MONTH, 1); // Увеличиваем на один день

            if (calendar.get(GregorianCalendar.DAY_OF_WEEK) != GregorianCalendar.SATURDAY && calendar.get(GregorianCalendar.DAY_OF_WEEK) != GregorianCalendar.SUNDAY) {
                addedDays++;
            }
        }
    }

    public static int differenceDay(GregorianCalendar calendar, Date firstDate,Date secondDate) {
        int dayDifference = 0;
        int compare=firstDate.compareTo(secondDate);
        if(compare>0)
        {
            Date swapping=firstDate;
            firstDate=secondDate;
            secondDate=swapping;
        }
        calendar.setTime(firstDate);
        while (firstDate.compareTo(secondDate)!=0) {
            calendar.add(GregorianCalendar.DAY_OF_MONTH, 1); // Увеличиваем на один день
            firstDate=calendar.getTime();
            // Проверяем, не является ли день выходным
            if (calendar.get(GregorianCalendar.DAY_OF_WEEK) != GregorianCalendar.SATURDAY && calendar.get(GregorianCalendar.DAY_OF_WEEK) != GregorianCalendar.SUNDAY) {
                dayDifference++;
            }
        }
        return dayDifference;
    }

}