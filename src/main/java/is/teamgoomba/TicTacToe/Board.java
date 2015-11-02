package is.teamgoomba.TicTacToe;

public class Board {
    private final int dim = 3;
    private int spacesleft;
    int[][] grid;

    Board(){
        spacesleft = 3*3;
    	grid = new int[][]{
        {0,0,0},
        {0,0,0},
        {0,0,0}};
    }
    int getDim(){
        return dim;
    }
    //returns the board as a string read from top left to bottom right
    // where 0 is empty, 1 is player 1 and 2 is player 2.
    public String getBoard(){
        StringBuilder build = new StringBuilder();
        for(int y = 0; y < dim; y++){
            for(int x = 0; x < dim; x++){
            	build.append(grid[y][x]);
            }
        }
    	return build.toString();
    }

    private boolean validPlace(int x, int y){
        if((x >= dim )||(y >=dim)||(x < 0)||(y < 0)){
             return false;
        }
        if(grid[y][x] != 0){
             return false;
        }
        return true;
    }
    //places the given symbol into the grid if it is a valid position
    public boolean place(int x, int y, int symbol){
        if(validPlace(x,y)){
            spacesleft--;
            grid[y][x] = symbol; 
            return true;
        } 
        return false;
    }
    // returns 0 if there is no winner, 1 if player 1 wins 2 if player 2 wins and 3 if it is a tie 
    public int getWinner(){
        for(int y = 0; y < dim; y++){
            if( (grid[y][0] != 0) && (grid[y][0] == grid[y][1]) &&  (grid[y][1] == grid[y][2])){
               return grid[y][0];
            }    
        }	
        for(int x = 0; x < dim; x++){
            if( (grid[0][x] != 0) && (grid[0][x] == grid[1][x]) &&  (grid[1][x] == grid[2][x])){
                return grid[0][x];
            }    
        }
        if(grid[1][1] != 0){
            if(grid[1][1] == grid[0][0] &&  grid[1][1] == grid[2][2] ){
                return grid[1][1];
	    }
            if(grid[1][1] == grid[0][2] &&  grid[1][1] == grid[2][0] ){
                return grid[1][1];
	    }
        }
        if(spacesleft == 0){
            return 3;
        }
        return 0;
    }
}

