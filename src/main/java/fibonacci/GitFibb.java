package fibonacci;
import java.util.Scanner;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

/** Represents a Fibonacci sequence.
 * @author Leon Silas
 * @class CEN4802C, Software Integration, Configuration, and Testing
 * @author www.github.com/leonsilas
 * @version 1.0
*/

public class GitFibb {

	/** Main function.
	 * @param args Command line arguments.
	*/
    public static void main(String args[]) throws IOException {

        HttpServer server = HttpServer.create(new InetSocketAddress(9988), 0);
        server.createContext("/", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();

        /*// Setup
        System.out.println("Please input the number of the term you'd like to find.");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Output
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibb(n));
        in.close();*/

    }// End of main

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            String response = "<h1> This is the 20th in the fibonacci sequence! " + fibb(20) + "</h1>";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

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