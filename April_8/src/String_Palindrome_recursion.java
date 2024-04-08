import java.util.Scanner;

public class String_Palindrome_recursion {


    public static boolean palindromeString(String word){

        if (word.length() <= 1) {
            return true;
        } else {

            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                return palindromeString(word.substring(1, word.length() - 1));
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String word=scanner.nextLine();

        System.out.println(palindromeString(word));
    }
}
