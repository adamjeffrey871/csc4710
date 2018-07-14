package user.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.dao.InsertDao;
import user.dao.UserDao;
import user.domain.User;
import user.service.UserException;
import user.service.UserService;


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
		
		String authorName, authorAffiliation, authorEmail, title, paperAbstract, PDFfile, reviewerName, reportID;
		
		
		
		//Map<String, String> form = new HashMap<String,String>();
		UserService userservice = new UserService();
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
		form.setReviewerName(info.get(7));
		form.setReportID(info.get(8));
		
		authorName = form.getAuthorName();
		authorAffiliation = form.getAuthorAffiliation();
		authorEmail = form.getAuthorEmail();
		title = form.getTitle();
		paperAbstract = form.getAbstract();
		PDFfile = form.getPDF();
		reviewerName = form.getReviewerName();
		reportID = form.getReportID();
		
		//insert code here
		InsertDao newObj = new InsertDao();
		newObj.insert(authorName, authorAffiliation, authorEmail, title, paperAbstract, PDFfile, reviewerName, reportID);
		response.sendRedirect( request.getContextPath() + "/jsps/papersAfterBody.jsp"); 
		
	}

}
