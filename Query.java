import java.sql.*;

public class Query {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/movies";
		String user ="root";
		String pass = "KNagaraj0408@";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,user,pass);
		
		String query = "select*from movies";
		
		Statement stm = con.createStatement();
		ResultSet set  = stm.executeQuery(query);
		
		while(set.next()) {
			int Id = set.getInt(1);
			String Name = set.getString(2);
			String Actor = set.getString(3);
			String Actress = set.getString(4);
			String Director = set.getString(5);
			int Year = set.getInt(6);
			
			System.out.println("Id: "+Id+"\n"+"Name: "+Name+"\n"+"Actor: "+Actor+"\n"+"Actress: "+Actress+"\n"+"Director: "+Director+"\n"+"Year of Release"+Year+"\n");
		}
		con.close();
		
	}

}