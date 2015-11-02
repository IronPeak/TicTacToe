package is.teamgoomba.TicTacToe;

public class Game {
    Board board;
    int first;
    int player;
    private final int dim = 3;

    Game() {
        board = new Board();
        player = 1;
        first = 1;
    }

    public int getPlayer() {
        return player;
    }

    public String GetBoard(){
        return board.GetBoard();
    } 
    
    public int GetWinner(){
        return board.GetWinner(); 
    }
    
    public boolean GameOver(){
        return board.GetWinner() != 0; 
    }
    
    public void restart(){
        board = new Board();
        if(first == 1){
            player = 2;
        }else{
            player = 1;
        }
        first = player;
    }
 
    public boolean Move(int inp){
        if(inp < 0 || inp > 8) {
	    return false;
	} 
        int x = inp % dim;
        int y = inp / dim;
        boolean success = board.Place(x,y,player);
        if(success){
            if(player == 1){
                this.player = 2;
                return true;
            }
            this.player = 1;
            return true;
        }
        return false;
    }
}

