import java.util.Scanner;
public class StringPlay {

public static String capitalizeLetter(String letter){
    return letter.toUpperCase();
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(capitalizeLetter("q"));
        String letter = scanner.nextLine();
        System.out.println(capitalizeLetter(letter));
    }
}
