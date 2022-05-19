import java.util.Scanner;

public class removeVowel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input =sc.nextLine();

        String word;

//        replacing the keywords with an empty string

        word= input.replaceAll("[aeiouAEIOU]", "");

        System.out.println("replaced word is"+ " " +word);

    }
}
