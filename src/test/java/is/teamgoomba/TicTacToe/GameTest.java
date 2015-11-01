p
package is.teamgoomba.TicTacToe;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

  @Test	
  public void testGetBoard() {
     Game game = new Game();
     assertEquals(game.GetBoard(),"000000000");
  }
 
}
