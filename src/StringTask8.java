import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 03.05.2018.
 */
public class StringTask8 {
    public static void main(String[] args) {

        System.out.println("Podaj wyraz: ");
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int length = word.length();

        System.out.println("Ostatnia litera wyrazu, to: " + word.charAt(length-1) + " a przedostatnia litera" +
                " wyrazu, to " + word.charAt(length-2));
    }
}
