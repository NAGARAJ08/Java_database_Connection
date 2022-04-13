import java.sql.*;

public class specific_query {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/movies";
		String user ="root";
		String pass = "KNagaraj0408@";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		String query1 = "SELECT name FROM movies WHERE Actor='RDJ'";
		String query2 = "SELECT name FROM movies WHERE release_year>2015";
		 
		Statement stmt  = con.createStatement();
         ResultSet rs1    = stmt.executeQuery(query1);
         
         while (rs1.next()) {
             System.out.println(rs1.getString("name"));
         }
         
         System.out.println("\n");
         ResultSet rs2    = stmt.executeQuery(query2);
         while (rs2.next()) {
             System.out.println(rs2.getString("name"));
         }
		con.close();
		
	}

}