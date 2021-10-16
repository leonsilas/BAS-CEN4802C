import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FibbTests {
    
    // Basic principles of testing
    @Test
    void testFail() {
        assertEquals("We would feel sorry for you, but you should have seen this coming.",1, 1);
    }

    @Test
    void testPass() {
        assertEquals("How did you cause this?",1, 1);
    }

    // Applicable tests to classes
    @Test
    void testGitFibbBases() {
        assertEquals("Fibb(0) should be 0", 0, GitFibb.fibb(0));
        assertEquals("Fibb(1) should be 1", 1, GitFibb.fibb(1));
    }

    @Test
    void testGitFibbSmall() {
        assertEquals("Fibb(2) should be 1", 1, GitFibb.fibb(2));
    }

    @Test
    void testGitFibbLarge() {
        assertEquals("Fibb(25) should be 75025", 75025, GitFibb.fibb(25));
    }

    // Let's get more in depth on some useful tools
    @BeforeAll
    static void testSetUp() {
        System.out.println("Setting up...");
    }

    @AfterAll
    static void testTearDown() {
        System.out.println("Tearing down...");
    }

    @Test
    @Disabled
    void testDisabled() {
        System.out.println(GitFibb.fibb(1000000));
    }
}