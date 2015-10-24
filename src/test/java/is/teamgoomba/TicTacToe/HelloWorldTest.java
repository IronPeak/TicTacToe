package is.teamgoomba.TicTacToe;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test 
	public void testSomeLibraryMethod() {
        HelloWorld test = new HelloWorld();
        assertEquals(test.hello(), "Helo, World");
    }
}
