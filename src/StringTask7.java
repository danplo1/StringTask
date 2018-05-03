import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 03.05.2018.
 */
public class StringTask7 {
    public static void main(String[] args) {

        System.out.println("Podaj wyraz: ");

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        System.out.println("Hello " + word + "!");
    }
}
