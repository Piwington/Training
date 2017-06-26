import java.sql.*;
class DBF{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ONS","root","");
			Statement stm=con.createStatement();
			ResultSet RS=stm.executeQuery("select * from QA");
			while(RS.next()){
				System.out.println(RS.getInt(0));
				System.out.println(RS.getString(1));
				}
			}
		catch(Exception A){
			System.out.println("Bad");
		}
	}
}