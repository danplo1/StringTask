import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 30.04.2018.
 */
public class StringTask2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj słowo: ");

        String word = sc.nextLine();
        int length = word.length();

        System.out.println("Długość podanego słowa wynosi: " + length);

    }
}
