package is.teamgoomba.TicTacToe;

public class TicTacToeDB {
	
	public TicTacToeDB() {
		URI dbUri = new URI(System.getenv("DATABASE_URL"));
		
        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
		
		String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();
	}
	
}
