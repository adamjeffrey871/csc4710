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

import user.dao.DeleteDao;
import user.dao.UserDao;
import user.domain.User;
import user.service.UserException;
import user.service.UserService;


public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
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
		
		String paperID;
		
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
		form.setDeletePaperID(info.get(1));
		paperID = form.getDeletePaperID();
		
		System.out.println("All rows containing the ID: " + paperID + " will be deleted.");
		
		DeleteDao newobj = new DeleteDao();
		newobj.deleteManager(paperID);
		response.sendRedirect( request.getContextPath() + "/jsps/papersAfterBody.jsp"); 
		
	}

}
