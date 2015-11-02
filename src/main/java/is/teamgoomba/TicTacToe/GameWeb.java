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
        post("/restart", (req, res) -> {
            game.restart();
            res.status(200);
            return game.GetBoard();
        });
    	post("/setBox", (req, res) -> {
    		game.Move(
    			Integer.valueOf(req.queryParams("position"))
    		);
    		res.status(200);
    		return game.GetBoard();
   		});
        post("/setPlayer", (req, res) -> {
            res.status(200);
            return game.getPlayer();
        });
        post("/isWinner", (req, res) -> {
            res.status(200);
            return game.GetWinner();
        });
    }
}
