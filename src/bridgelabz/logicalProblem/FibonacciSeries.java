package bridgelabz.logicalProblem;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 1;
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n :");
        n = s.nextInt();
        System.out.print("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");
        }

    }}
