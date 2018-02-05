package com.basico;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ambito
 */
@WebServlet("/Ambito")
public class Ambito extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ambito() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		getServletContext().setAttribute("ciudadaplicacion", "Barcelona");
		System.out.println("Datos de aplicación " + getServletContext().getAttribute("ciudadaplicacion"));//guardo el método en el servlet y solo se verá en el jps si el servlet está abierto.
		
		request.getSession().setAttribute("ciudadsesion", "Zamora");
		System.out.println("Datos de aplicación " + request.getSession().getAttribute("ciudadsesion"));//guardo el método en la sesión y se quedará hasta que apagues la sesión
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
	}

}
