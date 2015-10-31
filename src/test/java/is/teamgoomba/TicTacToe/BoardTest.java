package is.teamgoomba.TicTacToe;

import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {

  @Test	
  public void testEmptyBoard() {
      Board board = new Board();
      assertEquals(board.GetBoard(),"000000000");
  }
}
