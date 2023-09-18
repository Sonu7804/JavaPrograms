//Check no is Armstrong or not in javaProgram

import java.util.Scanner;

public class ArmstrongNum27 {
    public static void main(String[] args) {

        int n, sum = 0, temp, remainder, digits = 0;

        Scanner in = new  Scanner(System.in);
        System.out.println("Input a Number to break if ot is an Armstrong number");
        n = in.nextInt();

        temp = n;

        // count no. of digits
        while ( temp != 0){
            digits++;
            temp = temp/10;

        }
        temp = n;
        while (temp != 0){
            remainder = temp%10;
            sum = sum + power(remainder,digits);
            temp = temp/10;
        }

        if(n == sum)
        System.out.println(n + ": is Armstrong number.");
        else
        System.out.println(n + ": is not an Armstrong number.");

    }

    static int power( int n, int r){
        int c,p = 1;

        for ( c = 1; c<=r; c++)
            p = p*n;
            return p;
    }
}
