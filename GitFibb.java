import java.util.Scanner;

public class GitFibb {

    public static void main(String args[]) {
        // Setup
        System.out.println("Please input the number of the term you'd like to find.");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Output
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibb(n));

    }// End of main

    // Recursive method to find the nth term of the Fibonacci sequence
    public static int fibb(int n) {
        if (n == 0)
            return 0; 
        else if (n == 1)
            return 1;
        else
            return fibb(n - 1) + fibb(n - 2);
    }// End of fibb

}// End of GitFibb