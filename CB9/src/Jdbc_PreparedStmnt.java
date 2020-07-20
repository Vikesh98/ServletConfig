import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Jdbc_PreparedStmnt {

	public static void main(String[] args) 
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vikesh8080");
		PreparedStatement st=c.prepareStatement("insert into students_data values(?,?,?)");
		   st.setInt(1,3);
		   st.setString(2, "Hari");
		   st.setInt(3, 45000);
		  
		   st.executeUpdate();
		   
		}
		catch(Exception e) {

		}
		System.out.println("success");
	}

}
