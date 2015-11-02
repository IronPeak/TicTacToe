package is.teamgoomba.TicTacToe;

public class Game {
    Board board;
    private int first;
    private int player;
    private final int dim;

    Game() {
        board = new Board();
        player = 1;
        first = 1;
        dim = board.getDim();
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int p) {
        player = p;
    }

    public String getBoard(){
        return board.getBoard();
    } 
    
    public int getWinner(){
        return board.getWinner(); 
    }
    
    public boolean gameOver(){
        return board.getWinner() != 0; 
    }
    //resets the Board and swaps who goes first 
    public void restart(){
        board = new Board();
        if(first == 1){
            player = 2;
        }else{
            player = 1;
        }
        first = player;
    }
 
    public boolean move(int inp){
        if(inp < 0 || inp > (dim*dim-1)) {
	    return false;
	} 
        int x = inp % dim;
        int y = inp / dim;
        boolean success = board.place(x,y,player);
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

