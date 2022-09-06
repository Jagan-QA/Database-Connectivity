package databaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDatabaseConnectivity {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

				/* Mention the DB Which is going to be used
				 * Establish the connectivity with DB by providing the necassary details
				 * Create a SQL Statement
				 * Execute the Query
				 * Store the Response in the Result Set
				 * Fetch the Response from Result Set
				 */
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc::mysql://root@localhost/infomic");
				Statement statement= connection.createStatement();
			ResultSet resultset=statement.executeQuery("SELECT * FROM emp_data");
			while(resultset.next()) {
				System.out.println("Employee Name: "+resultset.getString(1));
			}
			}
}

		

	


