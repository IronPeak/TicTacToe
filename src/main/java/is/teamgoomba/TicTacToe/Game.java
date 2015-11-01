package is.teamgoomba.TicTacToe;


public class Game {
    Board board;
    int player;
    private final int dim = 3;
    Game(){
        board = new Board();
        player = 1;
    }

    public String GetBoard(){
        return board.GetBoard();
    }

    public boolean Move(int inp){
        if(inp < 0 || inp > 8){
	    return false;
	} 
        int x = inp % dim;
        int y = inp / dim;
        boolean success = board.Place(x,y,player);
        if(success){
            if(player == 1){
                player = 2;
                return true;
            }
            player = 1;
            return true;
        }
        return false;
    }    
}

