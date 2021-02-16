package it.objectmethod.testweb.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.objectmethod.testweb.servlets.constants.Constants;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String username = req.getParameter("username");

		session.setAttribute("logged_user", username);

		List<String> frasiList = new ArrayList<String>();
		session.setAttribute(Constants.LISTA_FRASI, frasiList);

		req.getRequestDispatcher("pages/session-view.jsp").forward(req, resp);
	}

}
