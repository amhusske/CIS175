package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculateBehind
 */
@WebServlet("/calculateBehind")
public class calculateBehind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculateBehind() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstName");
		double initialAmount = Double.parseDouble(request.getParameter("initialAmount"));
		double interest = Double.parseDouble(request.getParameter("interest"));
		int years = Integer.parseInt(request.getParameter("years"));
		
		investment newInv = new investment(firstName, initialAmount, interest,years);
		
		request.setAttribute("investment", newInv);

		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
