import java.util.*;

public class Palindrom31 {
    public static void main(String[] args) {
        String original , reverse ="";
        Scanner in = new Scanner (System.in);


        System.out.println("Enter a string to check if it is a palindrome :");
        original = in.nextLine();


        int length = original.length();

        for ( int i = length - 1; i>= 0; i--)
        reverse = reverse + original.charAt(i);

        if ( original.equals(reverse))
        System.out.println("Entered string is a palindrome.");
        else
        System.out.println("Entered string is not a palindrome.");
    }
}

///Another method 

// import java.util.*;
// class Palindrome
// {
// public static void main(String args[])
// {
// String inputString;
// Scanner in = new Scanner(System.in);
// System.out.println("Input a string");
// inputString = in.nextLine();
// int length = inputString.length();
// int i, begin, end, middle;
// begin = 0;
// end = length - 1;
// middle = (begin + end)/2;
// for (i = begin; i <= middle; i++) {
// if (inputString.charAt(begin) == inputString.charAt(end)) {
// begin++;
// end--;
// }
// else {
// break;
// }
// }


