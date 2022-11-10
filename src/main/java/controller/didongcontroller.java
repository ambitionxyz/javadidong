package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.didongbean_luan;
import bo.didongbo_luan;

/**
 * Servlet implementation class didongcontroller
 */
@WebServlet("/didongcontroller")
public class didongcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public didongcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			
			RequestDispatcher rd;
			didongbo_luan ddbo = new didongbo_luan();
			ArrayList<didongbean_luan> ds = ddbo.getList();
			String key = request.getParameter("key");
			String trang = request.getParameter("t");
			System.out.println("trang: "+ trang);
			if(trang !=null) {
				
			}
			if(key != null) {
				ds = ddbo.timkiem(key);
				
			}
			request.setAttribute("dsdidong", ds);
			rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
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
