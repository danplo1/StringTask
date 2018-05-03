import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 30.04.2018.
 */
public class StringTask1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie:" );
        String firstName = scanner.next();

        System.out.println("Podaj swoje nazwisko");
        String lastName = scanner.next();

        System.out.println("Twoje imię: " +firstName+ " ,Twoje nazwisko: "+lastName);
    }
}
