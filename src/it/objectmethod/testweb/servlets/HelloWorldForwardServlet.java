package it.objectmethod.testweb.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldForwardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nome = req.getParameter("boh");

		nome = nome + " è un bel nome.";

		req.setAttribute("tostapane", nome);

		req.setAttribute("ditapiedi", 10);
		req.getRequestDispatcher("nonhoidee").forward(req, resp);
	}

}
