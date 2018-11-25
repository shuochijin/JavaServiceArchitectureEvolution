package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DemoDao;
import scheme.DemoScheme;

@WebServlet(name="update",urlPatterns="/update")
public class UpdateAction extends HttpServlet{

	private static final long serialVersionUID = 8422748310704406864L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getContextPath());
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String value = req.getParameter("value");
		System.out.println("name:" + name + " value:" + value);
		DemoDao dao = new DemoDao();
		DemoScheme scheme = new DemoScheme();
		synchronized(dao) {
			scheme.setId(id);
			scheme.setName(name);
			scheme.setValue(value);
			dao.update(scheme);
		}
		resp.setCharacterEncoding("UTF-8");
		PrintWriter writer = resp.getWriter();
		
		writer.write("³É¹¦");
		writer.flush();
		writer.close();
	}
	
}
