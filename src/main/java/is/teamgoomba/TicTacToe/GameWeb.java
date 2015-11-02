package is.teamgoomba.TicTacToe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;


public class GameWeb implements SparkApplication {

	    public static void main(String[] args) {
	        staticFileLocation("/public");
	        SparkApplication gameweb = new GameWeb();

	        String port = System.getenv("PORT");
	        if (port != null) {
	            port(Integer.valueOf(port));
	        }
	        gameweb.init();
    }

    @Override
    public void init() {
    	final Game game = new Game();
    	post("/setBox", (req, res) -> {
    		game.Move(
    			Integer.valueOf(req.queryParams("position")),
    			Integer.valueOf(req.queryParams("player"))
    		);
    		res.status(200);
    		return game.GetBoard();
   		});
    }
}