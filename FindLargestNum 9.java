//9. Find Largest no in java Program

import java.util.Scanner;

class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int x, y, z;
        System.out.print("Enter three integers:");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z)
            System.out.println("First no.is Largest");

        else if (y > x && y > z)
            System.out.println("Second no.is Largest");
        else if (z > x && y > y)
            System.out.println("Third no. kis Largest");
        else
            System.out.println("Entered no. are not disrtinct");
    }
}