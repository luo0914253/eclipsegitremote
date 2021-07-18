package com.imooc.ajax;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/content")
public class AjaxHttpServlet extends HttpServlet{
//	¾ÍÐÞ¸ÄÏÂ£¬²âÊÔgit¡£
//	once again
// 	server change
//	 conflict client
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("<b> I'm Server Content</b>");
//		req.getRequestDispatcher("/ajax.html").forward(req, resp);
	}
}
