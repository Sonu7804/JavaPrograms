
//15. How to complete 2 string in Java program
import java.util.Scanner;

class CompareStrings 
{
    public static void main(String[] args) 
    {
    
    String s1, s2;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the first siring:");
    s1 = in.nextLine();

    System.out.println("Enter the second string:");
    s2 = in.nextLine();

    if( s1.compareTo(s2) > 0)
       System.out.println("First string is greater than second.");

       else if( s1.compareTo(s2) < 0)
        System.out.println("First string is smaller than second.");

        else
            System.out.println("Both string are equal.");
    }
}