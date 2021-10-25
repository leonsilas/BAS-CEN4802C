package fibonacci;
import java.io.IOException;
import java.util.logging.*;

class LogTest {  

    // Create the logger
    private final static Logger logr = Logger.getLogger( Logger.GLOBAL_LOGGER_NAME );     
    
    private static void setupLogger() {

        // Clears previous settings
        LogManager.getLogManager().reset();
        logr.setLevel(Level.ALL);
        
        // Write to Console
        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.SEVERE);
        logr.addHandler(ch);

        // Write to File
        try {
            FileHandler fh = new FileHandler("testlog.txt", true); // True allows an append to the file
            fh.setLevel(Level.ALL);
            fh.setFormatter(new SimpleFormatter());
            logr.addHandler(fh);
        } catch (IOException e) {            
            logr.log(Level.SEVERE, "File not able to be read properly", e);
        }
    }
    public static void main(String[] args) {
        // Setup the logger
        setupLogger();               

        // Log the messages
        log100();      

        // Log messages to JSON
        try {
            FileHandler jh = new FileHandler("testlog.json");
            jh.setLevel(Level.ALL);
            logr.addHandler(jh);
        } catch (IOException e) {
            logr.log(Level.SEVERE, "File not able to be read properly", e);
        }
        log100();
       
    }

    public static void log100() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                logr.log(Level.FINE, "This is working as intended.");
            } else if (i % 3 == 0) {
                logr.log(Level.WARNING, i + " is divisible by 3.");
            } else {
                logr.log(Level.SEVERE, i + " can't do EITHER.");
            }
        }
    }

}// End of LogTest
