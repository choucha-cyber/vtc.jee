package servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ConducteurDao;
import model.ConducteurModel;

/**
 * Servlet implementation class Conducteur
 */
@WebServlet("/conducteur")
public class ConducteurPath extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConducteurPath() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ConducteurDao conducteur = new ConducteurDao();
		request.setAttribute("conducteur", conducteur.read());
		request.getRequestDispatcher("ConducteurView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		request.setAttribute("nom", nom);
		request.setAttribute("prenom", prenom);
		
		System.out.println(request.getParameter("nom"));
		System.out.println(request.getParameter("prenom"));
		
		ConducteurModel conduct = new ConducteurModel(prenom, nom);
		ConducteurDao conducteur = new ConducteurDao();
		 
		
		request.setAttribute("create", conducteur.create(conduct));
		request.setAttribute("conducteur", conducteur.read());
		
		
		request.getRequestDispatcher("ConducteurView.jsp").forward(request, response);
		 
	}

}
