package com.basico;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Vector;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.glass.ui.Application;

/**
 * Servlet implementation class Primero
 */
@WebServlet(
		description = "listado de parametros de ServletConfig", 
		urlPatterns = { 
				"/Primero", 
				"/VerConfig"
		}, 
		initParams = { 
				@WebInitParam(name = "ciudad", value = "Madrid"), 
				@WebInitParam(name = "unidades", value = "50"), 
				@WebInitParam(name = "precio", value = "12.6")
		})
public class Primero extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Vector vector=new Vector();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Primero() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see Servlet#getServletConfig()
	 */

	public ServletConfig getServletConfig() {
	// TODO Auto-generated method stub
	System.out.println("Método getServletConfig");
	return null;
	
	
}
	
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		System.out.println("Método ini");
		Enumeration lstParams= config.getInitParameterNames();
		while(lstParams.hasMoreElements()) {
			String nombreParam= (String)lstParams.nextElement();
			vector.add("{nombre= " + nombreParam + " valor= " + config.getInitParameter(nombreParam) + "}");
		}
			
		
	}





	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("Método getServletInfo");
		return null; 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("Método Get");
		
		
		response.setContentType ("text/plain");
		PrintWriter out=response.getWriter();
		out.write(vector.toString());
		out.flush();
		out.close();
		ServletContext application= request.getServletContext();
		application.setAttribute("Curso", "Java");
		application.setAttribute("IVA", 0.21f);
		System.out.println(application.getAttribute("Curso"));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		System.out.println("Método Post");
		
		String p= request.getParameter("productos");
		System.out.println(p);
		
		
		
		
	}

}
