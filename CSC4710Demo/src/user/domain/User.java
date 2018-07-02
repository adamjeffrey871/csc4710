package user.domain;

/**
 * User object
 * 
 * @author changxin bai
 * 
 */
public class User {
	/*
	 * Correspond to the user table
	 */
	
	private String username;
	private String password; 
	private String email;
	String authorName;
	String authorAffiliation;
	String authorEmail;
	String title;
	String paperAbstract;
	String PDFfile;
	String reviewerName;
	String reviewerID;
	String deletePaperID;
	String paperID;
	

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAuthorName(String name)
	{
		this.authorName = name;
	}
	
	public void setAuthorAffiliation(String affiliation)
	{
		this.authorAffiliation = affiliation;
	}
	
	public void setAuthorEmail(String email)
	{
		this.authorEmail = email;
	}
	
	public void setTitle(String paperTitle)
	{
		this.title = paperTitle;
	}
	
	public void setAbstract(String theAbstract) {
		this.paperAbstract = theAbstract;
	}
	
	public void setPDF(String pdf) {
		this.PDFfile = pdf;
	}
	
	public void setReviewerName(String name) {
		this.reviewerName = name;
	}
	
	public void setReviewerID(String ID) {
		this.reviewerID = ID;
	}
	
	public void setDeletePaperID(String ID) {
		this.deletePaperID = ID;
	}
	
	public void setPaperID(String ID) {
		this.paperID = ID;
	}

	
	@Override
	public String toString() {
		return "User [ username=" + username + ", password="
				+ password + ", email=" + email +"]";
	}
}
