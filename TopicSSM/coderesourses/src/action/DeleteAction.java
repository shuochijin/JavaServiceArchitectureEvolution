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

@WebServlet(name="delete",urlPatterns="/delete")
public class DeleteAction extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1921262151624314287L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		DemoDao dao = new DemoDao();
		DemoScheme scheme = new DemoScheme();
		
		synchronized(dao){
			scheme.setId(id);
			dao.delete(scheme);
		}
		
		resp.setCharacterEncoding("UTF-8");
		PrintWriter writer = resp.getWriter();
		
		writer.write("³É¹¦");
		writer.flush();
		writer.close();
	}

}
