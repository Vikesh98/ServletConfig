
	import java.util.Enumeration;
	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletConfig;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	public class DemoConfig extends HttpServlet 
	{

		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
		{
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			
			ServletConfig config=getServletConfig();
//			String driver=config.getInitParameter("driver");
//			out.print(driver);
			
			Enumeration <String> e=config.getInitParameterNames();
			String str="";
			while(e.hasMoreElements())
			{
				str=e.nextElement();
				out.println("<br>"+str);
				out.println(config.getInitParameter(str));
			}
			
			
			
		}
	}
			