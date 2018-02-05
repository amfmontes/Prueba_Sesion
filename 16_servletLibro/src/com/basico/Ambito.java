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
		System.out.println("Datos de aplicaci�n " + getServletContext().getAttribute("ciudadaplicacion"));//guardo el m�todo en el servlet y solo se ver� en el jps si el servlet est� abierto.
		
		request.getSession().setAttribute("ciudadsesion", "Zamora");
		System.out.println("Datos de aplicaci�n " + request.getSession().getAttribute("ciudadsesion"));//guardo el m�todo en la sesi�n y se quedar� hasta que apagues la sesi�n
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
	}

}
