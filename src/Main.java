import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String inputString=scanner.nextLine();
        System.out.println(String.format("Здраствуй, %s.",inputString));
    }
}