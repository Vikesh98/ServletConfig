import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {


	public static void main(String[] args) 
	{
		try
		{
			ObjectInputStream os=new ObjectInputStream(new FileInputStream("vik.txt"));
			child ch=(child)os.readObject();
			System.out.println(ch.name+" "+ch.id+" "+ch.roll);
			os.close();
		}
		catch(Exception e)
		{
			
		}
		
	}

}
