import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
       int age;
        ArrayList<User> listOfUsers=new ArrayList<User>();
       for(int i =0;i<5;i++) {
           System.out.println("Введите имя");
           name = scanner.nextLine();
           System.out.println("Введите возраст");
           age = scanner.nextInt();
           listOfUsers.add(new User(name,age));
           scanner.nextLine();
       }


        Collections.sort(listOfUsers, new Comparator<User>() {
            public int compare(User a, User b) {
                return a.getAge().compareTo(b.getAge());
            }
        });
        for(int i =0;i<5;i++) {
            System.out.println(listOfUsers.get(i).toString());
            System.out.println();

        }

    }
}


