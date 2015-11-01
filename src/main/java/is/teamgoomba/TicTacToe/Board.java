package is.teamgoomba.TicTacToe;


public class Board {
    private final int dim = 3;
    int[][] Grid;

    Board(){
    	Grid = new int[][]{
        {0,0,0},
        {0,0,0},
        {0,0,0}};
 
    }

    public String GetBoard(){
        StringBuilder build = new StringBuilder();
        for(int y = 0; y < dim; y++){
            for(int x = 0; x < dim; x++){
            	build.append(Grid[y][x]);
            }
        }
    	return build.toString();
    }

    private boolean ValidPlace(int x, int y){
        if((x >= dim )||(y >=dim)||(x < 0)||(y < 0)){
             return false;
        }
        if(Grid[y][x] != 0){
             return false;
        }
        return true;
    }
 
    public boolean Place(int x, int y, int symbol){
        if(ValidPlace(x,y)){
            Grid[y][x] = symbol; 
            return true;
        } 
        return false;
    }

    public int GetWinner(){
        for(int y = 0; y < dim; y++){
            if( (Grid[y][0] != 0) && (Grid[y][0] == Grid[y][1]) &&  (Grid[y][1] == Grid[y][2])){
               return Grid[y][0];
            }    
        }	
        for(int x = 0; x < dim; x++){
            if( (Grid[0][x] != 0) && (Grid[0][x] == Grid[1][x]) &&  (Grid[1][x] == Grid[2][x])){
                return Grid[0][x];
            }    
        }
        if(Grid[1][1] != 0){
            if(Grid[1][1] == Grid[0][0] &&  Grid[1][1] == Grid[2][2] ){
                return Grid[0][0];
	    }
            if(Grid[1][1] == Grid[0][2] &&  Grid[1][1] == Grid[2][0] ){
                return Grid[0][0];
	    }
        }
        return 0;
    }
}

