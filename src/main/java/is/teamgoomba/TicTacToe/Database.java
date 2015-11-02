package is.teamgoomba.TicTacToe;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
	private Connection connection;
	public Database() throws URISyntaxException, SQLException {
		connection = getConnection();
	}
	
	private static Connection getConnection() throws URISyntaxException, SQLException {
		URI dbUri = new URI(System.getenv("DATABASE_URL"));

		String username = dbUri.getUserInfo().split(":")[0];
		String password = dbUri.getUserInfo().split(":")[1];
		String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

		return DriverManager.getConnection(dbUrl, username, password);
	}
	
	public int getXWins() throws SQLException {
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT NumberOfXWins FROM generalinfo LIMIT 1;");
		return rs.getInt("NumberOfXWins");
	}
	
	public int getOWins() throws SQLException {
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT NumberOfOWins FROM generalinfo LIMIT 1;");
		return rs.getInt("NumberOfOWins");
	}
}