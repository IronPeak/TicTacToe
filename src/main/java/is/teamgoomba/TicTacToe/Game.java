package is.teamgoomba.TicTacToe;


public class Game {
    Board board;
    int playertomove;

    Game(){
        board = new Board();
        playertomove = 1;
    }

    String GetBoard(){
        return board.GetBoard();
    }
}

