package com.imooc.ajax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

@WebServlet("/news_list")
public class NewsListHttpServlet extends HttpServlet  {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<News> list = new ArrayList<>();
		String type = req.getParameter("t");
		System.out.println(type);
		if(type== null || type.equals("tiobe")) {
			list.add(new News("TIOBE:2020年5月份全球变成语言排行榜","2020-5-1","TIOBE","......"));
			list.add(new News("TIOBE:2020年6月份全球变成语言排行榜","2020-6-1","TIOBE","......"));
			list.add(new News("TIOBE:2020年7月份全球变成语言排行榜","2020-7-1","TIOBE","......"));
			list.add(new News("TIOBE:2020年8月份全球变成语言排行榜","2020-8-1","TIOBE","......"));
			list.add(new News("TIOBE:2020年9月份全球变成语言排行榜","2020-9-1","TIOBE","......"));
		}else if(type!= null || type.equals("pypl")){
			list.add(new News("PYPL:2020年5月份全球变成语言排行榜","2020-5-1","PYPL","......"));
			list.add(new News("PYPL:2020年6月份全球变成语言排行榜","2020-6-1","PYPL","......"));
			list.add(new News("PYPL:2020年7月份全球变成语言排行榜","2020-7-1","PYPL","......"));
			list.add(new News("PYPL:2020年8月份全球变成语言排行榜","2020-8-1","PYPL","......"));
			list.add(new News("PYPL:2020年9月份全球变成语言排行榜","2020-9-1","PYPL","......"));
		}
		
		String json = JSON.toJSONString(list);
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().print(json);
	}
}
