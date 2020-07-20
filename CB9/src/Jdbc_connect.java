import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc_connect {

	public static void main(String[] args) 
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vikesh8080");
		Statement s=con.createStatement();
		String qry="create table EMP(eid number(15),ename char(20),sal number(5))";
		s.executeUpdate(qry);
		System.out.println("table created");
		s.close();
		con.close();
		}
		catch(Exception e)
		{
		}
	}

}
