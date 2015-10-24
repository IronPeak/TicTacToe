package is.teamgoomba.TicTacToe;

import static spark.Spark.*;

public class HelloWorld {
    public static String hello(){
	return "Hello, World";
    }
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        //System.out.println(hello());
        get("/hello", (req, res)->hello());
    }

}
