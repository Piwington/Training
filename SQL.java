import java.sql.*;
public class SQL {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/david","root","System");
			Statement stm=con.createStatement();
			stm.executeUpdate("insert into one values(5,'Mat')");
			ResultSet RS=stm.executeQuery("select * from one");
			while(RS.next()){
				System.out.print(RS.getInt(1)+" ");
				System.out.println(RS.getString(2));
				}
			}
		catch(Exception A){
			System.out.println("Bad");
		}
	}
}