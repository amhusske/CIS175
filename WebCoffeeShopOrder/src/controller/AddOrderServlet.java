package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import model.Order;

/**
 * Servlet implementation class AddOrderServlet
 */
@WebServlet("/addOrderServlet")
public class AddOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String drink = request.getParameter("drink");
		String size = request.getParameter("size");
		String customerName = request.getParameter("customerName");
		
		Customer a = new Customer(customerName);
		Order newOrder = new Order(drink, size, a);
		OrderHelper oh = new OrderHelper();
		oh.insertOrder(newOrder);
		
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
