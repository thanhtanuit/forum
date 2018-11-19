package lession03.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index.html")
public class IndexServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("title", "Nhận tham số dạng GET");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		req.setAttribute("name", name);
		req.setAttribute("email", email);
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
}
