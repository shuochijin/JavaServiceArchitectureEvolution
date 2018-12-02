package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DemoDao;
import scheme.DemoScheme;

@WebServlet(name="query",urlPatterns={"/query"})
public class QueryAction extends HttpServlet{

	private static final long serialVersionUID = -6271176550635434338L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		System.out.println(path);
		DemoDao dao = new DemoDao();
		List<DemoScheme> list = dao.query();
		
		StringBuilder sb = new StringBuilder();
		
		Iterator<DemoScheme> iter = list.iterator();

		DemoScheme scheme = null;
		
		int count = 0;
		sb.append("{");
		sb.append("\"head\" : [\"id\", \"name\", \"value\"],");
		sb.append("\"value\" : [");
		while(iter.hasNext()){
			if(count != 0){
				sb.append(",");
			}
			scheme = iter.next();
			sb.append("[");
			sb.append(scheme.getId());
			sb.append(",");
			sb.append("\"" + scheme.getName() + "\"");
			sb.append(",");
			sb.append("\"" + scheme.getValue() + "\"");
			sb.append("]");
			count ++;
		}
		sb.append("]");
		sb.append("}");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter writer = resp.getWriter();
		
		writer.write(sb.toString());
		System.out.println(sb.toString());
		writer.flush();
		writer.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
