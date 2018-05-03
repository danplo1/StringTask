import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 01.05.2018.
 */
public class StringTask6 {
    public static void main(String[] args) {

        System.out.println("Podaj wyraz: ");

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        System.out.println("Pierwsza litera podanego wyrazu to: " + (word.charAt(0)));
    }
}
