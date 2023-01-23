package com.groupeisi.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.groupeisi.dao.ComptesImpl;
import com.groupeisi.dao.DroitsImpl;
import com.groupeisi.dao.IComptes;
import com.groupeisi.dao.IDroits;
import com.groupeisi.entities.Comptes;
import com.groupeisi.entities.Droits;

/**
 * Servlet implementation class DroitServlet
 */
public class DroitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IDroits droitsdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DroitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
   	public void init(jakarta.servlet.ServletConfig config) throws ServletException {
   		
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
			request.setAttribute("list_comptes", droits);
			
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
