package nl.dennisg.wink;


import org.apache.wink.server.internal.servlet.RestServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Start the WinkServlet in a jetty container.
 * 
 * @author dennisg
 *
 */
public class MainServlet {
	
	private static Logger logger = LoggerFactory.getLogger(MainServlet.class);
	
	public static String getEnvironment() {
		return System.getProperty("JAVA_ENV", "development");
	}

	public static int getPort() {
		String port = System.getenv("PORT");
		if (port == null) {
			return 8080;
		}
		return Integer.valueOf(port);
	}

	/**
	 * Start the Jetty server
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		logger.info("Application START");
		
        Server server = new Server(MainServlet.getPort());
        ServletHolder holder = new ServletHolder(new RestServlet());
        holder.setInitParameter("applicationConfigLocation", "providers;resources");
        
        final WebAppContext app = new WebAppContext("public", "/");
        app.addServlet(holder, "/rest/*");
        
        server.setHandler(new HandlerList() {{
        	addHandler(app);
        }});
        
        server.start();
        server.join();
        
	}	
}
