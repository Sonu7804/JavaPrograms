//25. Print Multiplication table Program in java

// import java.util.Scanner;

// class Table25
// {
//     public static void main(String[] args) 
//     {
//         int n,c;
//         System.out.println("Enter an integer to print it's Multiplication table :");

//         Scanner in = new Scanner(System.in);
//         n = in.nextInt();

//         System.out.println("Multiplicatio table of "+n+" is :-");

//         for ( c = 1; c <= 10; c++);
//            System.out.println(n+"*"+c+" = "+(n*c));
//     }
// }

// For any number

import java.util.Scanner;

class Tables {
    public static void main(String args[]) {
        int a, b, c, d;
        System.out.println("Enter range of numbers to print their multiplication table");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        for (c = a; c <= b; c++) {
            System.out.println("Multiplication table of " + c);
            for (d = 1; d <= 10; d++) {
                System.out.println(c + "*" + d + " = " + (c * d));
            }
        }
    }
}