package SQL_DATABASE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
1.create connection
2.create statement
3.execute statement
4.close connection
*/

public class JDBC_example1 {
	public static void main(String[] args) throws SQLException {
	//step1
		Connection con=DriverManager.getConnection("provide connection String");
		//step2
		Statement stmt=con.createStatement();
		//execute sql statement
		String s="SELECT city,phone,address FROM Suppliers";//when we need execute but not need to ghet data
		stmt.executeQuery(s);
		//Addional data
		ResultSet rs=stmt.executeQuery(s);//in case of select query we should use
		while (rs.next()) {
			String username=rs.getString("username");
			String password=rs.getString("password");
			System.out.println(username);
			System.out.println(password);
			
		}
		//step4
		con.close();
		System.out.println("program is exited");
		
		
		/*we can use selenium too also with this code we need to pass same data in application
		 and verify if this date present in DB our test pass otherwise failed
		 */
		
	}

}
