import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
public class StringPlay {

public static String capitalizeLetter(String letter){
    return letter.toUpperCase();
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string ");
        String letter = scanner.nextLine();
        System.out.println(capitalizeLetter(letter));
        if(StringUtils.isNumeric(letter)){
            System.out.println("\"" + letter + "\" is a number.");
        }else{
            System.out.println("\"" + letter + "\" is not a number.");
        }
        System.out.println("Flipped Case = " + StringUtils.swapCase(letter));
        System.out.println("Reversed = " + StringUtils.reverse(letter));
    }
}
