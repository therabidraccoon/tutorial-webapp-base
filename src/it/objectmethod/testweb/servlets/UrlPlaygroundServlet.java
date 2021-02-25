package it.objectmethod.testweb.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pagina")
public class UrlPlaygroundServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String numPaginaReq = req.getParameter("num_pagina");

		Integer numPagina = Integer.parseInt(numPaginaReq);

		req.setAttribute("cur_page", numPagina);
		req.setAttribute("next", numPagina + 1);
		req.getRequestDispatcher("pages/url-playground.jsp").forward(req, resp);

	}

}
