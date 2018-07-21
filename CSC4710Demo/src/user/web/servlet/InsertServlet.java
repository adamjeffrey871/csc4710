package user.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.dao.InsertDao;
import user.domain.User;


public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String authorName, authorAffiliation, authorEmail, title, paperAbstract, PDFfile, authorID;
		
		
		
		//Map<String, String> form = new HashMap<String,String>();
		Map<String,String[]> paramMap = request.getParameterMap();
		User form = new User();
		List<String> info = new ArrayList<String>();
		
		for(String name : paramMap.keySet()) {
			
			String[] values = paramMap.get(name);
			info.add(values[0]);
			System.out.println(name + ": " + Arrays.toString(values));
		}
		form.setAuthorName(info.get(1));
		form.setAuthorAffiliation(info.get(2));
		form.setAuthorEmail(info.get(3));
		form.setTitle(info.get(4));
		form.setAbstract(info.get(5));
		form.setPDF(info.get(6));
		form.setAuthorID(info.get(7));
		
		authorName = form.getAuthorName();
		authorAffiliation = form.getAuthorAffiliation();
		authorEmail = form.getAuthorEmail();
		title = form.getTitle();
		paperAbstract = form.getAbstract();
		PDFfile = form.getPDF();
		authorID = form.getAuthorID();
		
		//insert code here
		InsertDao newObj = new InsertDao();
		newObj.insert(authorName, authorAffiliation, authorEmail, title, paperAbstract, PDFfile, authorID);
		response.sendRedirect( request.getContextPath() + "/jsps/papersAfterBody.jsp"); 
		
	}

}
