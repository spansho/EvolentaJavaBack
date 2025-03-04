
package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Calculator calculatorMultiplie=new Calculator(new Operations.Multiplie());
        Calculator calculatorDivided=new Calculator(new Operations.Divided());
        System.out.println("Введите число a");
        double a=scanner.nextDouble();
        System.out.println("Введите число b");
        double b =scanner.nextDouble();
        System.out.println("Результат операции умножения a на b = ");
        calculatorMultiplie.calc(a,b);

        System.out.println("Результат операции деления a на b = ");
        calculatorDivided.calc(a,b);
    }
}


