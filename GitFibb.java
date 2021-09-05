import java.util.Scanner;

/** Represents a Fibonacci sequence.
 * @author Leon Silas
 * @author www.github.com/leonsilas
 * @version 1.0
*/

public class GitFibb {

	/** Main function.
	 * @param args Command line arguments.
	*/
    public static void main(String args[]) {
        // Setup
        System.out.println("Please input the number of the term you'd like to find.");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Output
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibb(n));

    }// End of main

    /** Returns the nth term of the Fibonacci sequence.
	 * @param n The term of the Fibonacci sequence to find.
     * @return The nth term of the Fibonacci sequence.
	*/
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