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
		setupRow();
	}
	
	private void setupRow() throws SQLException {
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM generalinfo;");
		if (!rs.next()){
			stmt.executeQuery("INSERT INTO generalinfo VALUES (0, 0, 0, 0);");
		}
	}
	
	private static Connection getConnection() throws URISyntaxException, SQLException {
		URI dbUri = new URI(System.getenv("DATABASE_URL"));

		String username = dbUri.getUserInfo().split(":")[0];
		String password = dbUri.getUserInfo().split(":")[1];
		String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

		return DriverManager.getConnection(dbUrl, username, password);
	}
	
	public int getVisits() throws SQLException {
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT NumberOfVisits FROM generalinfo LIMIT 1;");
		return rs.getInt("NumberOfVisits");
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
	
	public int getTies() throws SQLException {
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT NumberOfTies FROM generalinfo LIMIT 1;");
		return rs.getInt("NumberOfTies");
	}
	
	public void incVisits() throws SQLException {
		Statement stmt = connection.createStatement();
		stmt.executeQuery("UPDATE generalinfo SET NumberOfVisists = NumberOfVisits + 1;");
	}
	
	public void incXWins() throws SQLException {
		Statement stmt = connection.createStatement();
		stmt.executeQuery("UPDATE generalinfo SET NumberOfXWins = NumberOfXWins + 1;");
	}
	
	public void incOWins() throws SQLException {
		Statement stmt = connection.createStatement();
		stmt.executeQuery("UPDATE generalinfo SET NumberOfOWins = NumberOfOWins + 1;");
	}
	
	public void incTies() throws SQLException {
		Statement stmt = connection.createStatement();
		stmt.executeQuery("UPDATE generalinfo SET NumberOfTies = NumberOfTies + 1;");
	}
}