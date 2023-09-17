//13. How to check Odd and Even Number in java

import java.util.Scanner;

class oddOrEven
{
    public static void main(String[] args) {
        int x;
        System.out.println("Enter an integer to check if it is Odd or Even :");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        in.close();

        if (x % 2 ==0)
             System.out.println("You entered an Even Number.");
        else
            System.out.println("You entered an Odd Number.");  
    }
}