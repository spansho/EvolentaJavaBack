import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
       int age;
       System.out.println("Введите имя");
       name=scanner.nextLine();
       System.out.println("Введите возраст");
       age=scanner.nextInt();
       User user=new User(name,age);

        scanner.nextLine();
        System.out.println("Введите имя");
        name=scanner.nextLine();
        System.out.println("Введите возраст");
        age=scanner.nextInt();
        User user2=new User(name,age);
        System.out.println(" ");
        System.out.println(user.toString());
        System.out.println(user2.toString());


    }
}


