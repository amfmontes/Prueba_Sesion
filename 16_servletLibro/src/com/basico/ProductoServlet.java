package com.basico;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class ProductoServlet
 */
@WebServlet("/ProductoServlet")
public class ProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String p= request.getParameter("producto");
		System.out.println(p);
		String camisa = new String();
		float precio1=25.0f;
		float precio2=13.0f;
		
		
		
		if(p.equals("camisa")) {System.out.println("El precio es de " + precio1);
		request.getSession().setAttribute("precio", precio1);
		request.getSession().setAttribute("productocomprado", p);
	
		
		}else {
			System.out.println("El precio es de " + precio2);
			request.getSession().setAttribute("precio", precio2);
			request.getSession().setAttribute("productocomprado", p);
			
			
		}
		response.sendRedirect("Preciop.jsp");

		

	}

}
