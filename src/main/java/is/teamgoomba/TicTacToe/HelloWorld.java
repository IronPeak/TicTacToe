package is.teamgoomba.TicTacToe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class HelloWorld implements SparkApplication {
    
    public static String hello(){
		return "Hello, World";
    }

    public static void main(String[] args) {

        staticFileLocation("/public");
        SparkApplication hello = new HelloWorld();
        String port = System.getenv("PORT");
        port = getPort(port);
        hello.init();
    }
	
	public static String getPort(String port) {
		if(port != null) {
			return port(Integer.valueOf(port));
		}
		return null;
	}
	
	@Override
    public void init() {
    	post("/hello", (req, res)->hello());
    }
}

