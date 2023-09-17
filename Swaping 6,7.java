//6. How to swap 2 no using 3rd variable Program in java

import java.util.Scanner;

class swapNumbers {
    public static void main(String[] args) {
       // int x, y, temp;      // swapping with 3rd variable

          int x,y;            //  swapping without 3rd variablr   
       

        System.out.print("Enter X and Y :");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        in.close();

        System.out.println("Before Swapping\nx = "+x+"\ny = " + y);

        // temp = x;
        // x = y;           
        // y = temp;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping\nx = " +x+"\ny = " + y);

    }
}