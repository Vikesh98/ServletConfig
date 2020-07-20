import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc_insert {

	public static void main(String[] args) 
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vikesh8080");
		con.setAutoCommit(false);
		Statement s=con.createStatement();
		s.addBatch("insert into EMP values(1,'vikki',20000)");
		s.addBatch("insert into EMP values(2,'Murali',40000)");
		
		s.executeBatch();
		System.out.println("values inserted");
		con.commit();
		con.close();
		}
		catch(Exception e)
		{
		}
	}

}
