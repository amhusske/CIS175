package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Order;

/**
 * Servlet implementation class editOrderServlet
 */
@WebServlet("/editOrderServlet")
public class EditOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		OrderHelper oh = new OrderHelper();
		
		String drink = request.getParameter("drink");
		String size = request.getParameter("size");
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		
		Order orderToUpdate = oh.searchForOrderById(tempId);
		orderToUpdate.setDrink(drink);
		orderToUpdate.setSize(size);
		
		oh.updateItem(orderToUpdate);
		
		getServletContext().getRequestDispatcher("/viewAllOrdersServlet").forward(request, response);
	}

}
