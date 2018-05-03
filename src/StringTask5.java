import com.sun.javafx.binding.StringFormatter;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 01.05.2018.
 */
public class StringTask5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");

        String word = sc.nextLine();

        int length = word.length();

        System.out.println("Przedostatnia litera podanego słowa: " + (word.charAt(length-2)));

    }


}
