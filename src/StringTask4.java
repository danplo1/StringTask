import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 01.05.2018.
 */
public class StringTask4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");

        String word = scanner.nextLine();
        int length = word.length();

        System.out.println("Wpsiany wyraz to: " + word + " , a jego długość to: " + length);

    }
}
