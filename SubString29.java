//29. Find All substring of string in java Program

import java.util.Scanner;
public class SubString29 {
    public static void main(String[] args) {
        
        String string, sub;
        int i,c,length;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string to print it's substring:");
        string = in.nextLine();

        length = string.length();

        System.out.println("substring of \""+string+"\"are :-");

        for(c = 0;c< length; c++)
        {
            for(i = 1; i<=length; i++)
            {
                sub =  string.substring(c, c+i);
                System.out.println(sub);
            }
        }
    }
}
