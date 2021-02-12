package it.objectmethod.testweb.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldSecondaServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int ditaPiedi = (int) req.getAttribute("ditapiedi");
		ditaPiedi--;
		req.setAttribute("ditapiedi", ditaPiedi);
		req.getRequestDispatcher("pages/landing.jsp").forward(req, resp);
	}

}
