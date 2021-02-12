package it.objectmethod.testweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nome = req.getParameter("boh");

		nome = nome + " è un bel nome.";

		PrintWriter writer = resp.getWriter();

		writer.write("<html><body><h5 style=\"color: blue;\">" + nome + "</h5></body></html>");
	}

}
