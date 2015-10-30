package is.teamgoomba.TicTacToe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class HelloWorld implements SparkApplication {

    public static void main(String[] args) {
        staticFileLocation("/public");
        SparkApplication hello = new HelloWorld();
        hello.init();
    }
	
	@Override
    public void init() {
    	post("/hello", (req, res)->hello());
    }

    public static String hello() {
        return "Hello, World";
    }
}