import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите числа a b и c");
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        int numberOfDivisons=0;
        a= scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        if(a%5==0) {numberOfDivisons++;System.out.println("Число a делится на 5");System.out.println(a);System.out.println();}
        if(b%5==0) {numberOfDivisons++;System.out.println("Число b делится на 5");System.out.println(b);System.out.println();}
        if(c%5==0) {numberOfDivisons++;System.out.println("Число c делится на 5");System.out.println(c);System.out.println();}
        if(numberOfDivisons==0)System.out.println("нет значений, кратных 5");
        System.out.println("Результат целочисленного деления a на b");
        System.out.println(a/b);
        System.out.println();
        System.out.println("Результат вещественного деления a на b");
        System.out.println((double)a/b);
        System.out.println();
        System.out.println("Результат округления деления a на b в большую сторону");
        System.out.println(Math.ceil((double)a/b));
        System.out.println();
        System.out.println("Результат округления деления a на b в меньшую сторону");
        System.out.println(Math.floor((double)a/b));
        System.out.println();
        System.out.println("Результат математического округления  деления a на b ");
        System.out.println(Math.round((double)a/b));
        System.out.println();
        System.out.println("Остаток от деления b на c ");
        System.out.println(b%c);
        System.out.println();
        System.out.println("Наименьшее среди a и b");
        System.out.println(Math.min(a,b));
        System.out.println();
        System.out.println("Наибольшее среди b и c");
        System.out.println(Math.max(b,c));
    }
}