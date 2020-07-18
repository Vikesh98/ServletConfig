import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent implements Serializable
{
	String name;
	int id;
	public Parent(String name,int id) 
	{
		this.id=id;
		this.name=name;
	}
	
}
class child extends Parent
{
	transient int roll;
	public child(String name, int id,int roll) 
	{
		super(name, id);
		this.roll=roll;
	}
	
}



public class serialization {

	public static void main(String[] args) 
	{
		try 
		{
		child obj=new child("vikesh",1,123);
		FileOutputStream fs=new FileOutputStream("vik.txt");
		ObjectOutputStream out=new ObjectOutputStream(fs);
		out.writeObject(obj);
		out.flush();
		out.close();
		System.out.println("serialized into byte stream");
		}
		catch(Exception e)
		{
			
			System.out.println(e);
		}
		File f=new File(".");
		System.out.println(f.getAbsolutePath());
	}
}
