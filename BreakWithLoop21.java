//21. While loop using break Program in java

import java.util.Scanner;

class BreakWithLoop {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        

        while (true) {
            System.out.println("Input an intrger:");
            n = input.nextInt();

            if (n == 0) {
                break;
            }
            System.out.println("You entered: " + n);
        }

    }

}