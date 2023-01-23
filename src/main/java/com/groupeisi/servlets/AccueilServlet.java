package com.groupeisi.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import com.groupeisi.dao.DroitsImpl;
import com.groupeisi.dao.IDroits;
import com.groupeisi.entities.Droits;

/**
 * Servlet implementation class AccueilServlet
 */
public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IDroits droitsdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccueilServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) throws ServletException {
		droitsdao = new DroitsImpl();
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getSession().getAttribute("usersession") == null) {
			response.sendRedirect("LoginServlet");
		} else {
			java.util.List<Droits> droits = droitsdao.getAll();
			request.setAttribute("list_droits", droits);
			request.getRequestDispatcher("accueil.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
