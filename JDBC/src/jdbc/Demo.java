package jdbc;
import java.sql.*;

public class Demo {

	public static void main(String[] args) 
	{	
		String url="jdbc:mysql://localhost/estore";
		String uname="root";
		String pass="        ";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection(url,uname,pass);
			Statement st=con.createStatement();
			st.executeUpdate("insert into Customer values(0, 'John', '+91 99999 11111', 'john@example.com', 100, '2022-02-02');");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
