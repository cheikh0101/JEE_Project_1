package com.groupeisi.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;

import com.groupeisi.dao.ComptesImpl;
import com.groupeisi.dao.IComptes;
import com.groupeisi.entities.Comptes;

/**
 * Servlet implementation class CompteServlet
 */
public class CompteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IComptes comptesdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
	public void init(jakarta.servlet.ServletConfig config) throws ServletException {
		
	 comptesdao = new ComptesImpl();
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getSession().getAttribute("usersession") == null) {
			response.sendRedirect("LoginServlet");
		} else {
		
			java.util.List<Comptes> comptes = comptesdao.getAll();
			request.setAttribute("list_comptes", comptes);
			
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
