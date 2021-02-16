package it.objectmethod.testweb.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.objectmethod.testweb.servlets.constants.Constants;

@WebServlet("/add-frase")
public class ListaFrasiServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		String frase = req.getParameter("frase");

		List<String> frasiList = (List<String>) session.getAttribute(Constants.LISTA_FRASI);
		frasiList.add(frase);
		session.setAttribute(Constants.LISTA_FRASI, frasiList);
		session.setAttribute("numero_frasi", frasiList.size());

		req.getRequestDispatcher("pages/session-view.jsp").forward(req, resp);

	}

}
