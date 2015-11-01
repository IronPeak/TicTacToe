package is.teamgoomba.TicTacToe;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

  @Test
	public void testSomeLibraryMethod() {
    HelloWorld test = new HelloWorld();
    assertEquals(test.hello(), "Success");
  }

  @Test
  public void testMainMethod() {
    HelloWorld test = new HelloWorld();
    try {
      String[] args = new String[0];
      test.main(args);
    } catch(Exception e) {
      fail("Exception caught");
    }
  }
}
