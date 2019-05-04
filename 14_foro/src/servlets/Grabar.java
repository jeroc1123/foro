package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Mensaje;

/**
 * Servlet implementation class Grabar
 */
@WebServlet("/Grabar")
public class Grabar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext sc=config.getServletContext();
		sc.setAttribute("mensajes", new ArrayList<Mensaje>());
		super.init(config);
	}



	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc=request.getServletContext();
		Mensaje m=new Mensaje(request.getRemoteAddr(),request.getParameter("texto"));
		List<Mensaje> mensajes=(List<Mensaje>)sc.getAttribute("mensajes");
		mensajes.add(m);
		request.getRequestDispatcher("principal.jsp").forward(request, response);
	}

}
