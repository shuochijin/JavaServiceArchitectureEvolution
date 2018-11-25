package action;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DemoDao;
import scheme.DemoScheme;

@WebServlet(name="insert",urlPatterns={"/insert"})
public class InsertAction extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6962402506538965408L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getContextPath());
		String name = req.getParameter("name");
		String value = req.getParameter("value");
		System.out.println("name:" + name + " value:" + value);
		DemoDao dao = new DemoDao();
		DemoScheme scheme = new DemoScheme();
		synchronized(dao) {
			scheme.setId(dao.getNewId());
			scheme.setName(name);
			scheme.setValue(value);
			dao.insert(scheme);
		}
		resp.setCharacterEncoding("UTF-8");
		PrintWriter writer = resp.getWriter();
		
		writer.write("³É¹¦");
		writer.flush();
		writer.close();
	}
}
