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
	String authorName = null;
	String authorAffiliation = null;
	String authorEmail = null;
	String title = null;
	String paperAbstract = null;
	String PDFfile = null;
	String reviewerName = null;
	String reviewerID = null;
	String deletePaperID = null;
	String paperID = null;
	String reportID = null;
	

	
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
	
	public void setAuthorName(String name) {
		if (name = "")
		{
			this.authorName = name;
		}
		
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorAffiliation(String affiliation) {
		System.out.println("The value of affiliation is: " + affiliation);
		this.authorAffiliation = affiliation;
	}
	
	public String getAuthorAffiliation() {
		return authorAffiliation;
	}
	
	public void setAuthorEmail(String email) {
		this.authorEmail = email;
	}
	
	public String getAuthorEmail() {
		return authorEmail;
	}
	
	public void setTitle(String paperTitle) {
		this.title = paperTitle;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAbstract(String theAbstract) {
		this.paperAbstract = theAbstract;
	}
	
	public String getAbstract() {
		return paperAbstract;
	}
	
	public void setPDF(String pdf) {
		this.PDFfile = pdf;
	}
	
	public String getPDF() {
		return PDFfile;
	}
	
	public void setReviewerName(String name) {
		this.reviewerName = name;
	}
	
	public String getReviewerName() {
		return reviewerName;
	}
	
	public void setReviewerID(String ID) {
		this.reviewerID = ID;
	}
	
	public String getReviewerID() {
		return reviewerID;
	}
	
	public void setDeletePaperID(String ID) {
		this.deletePaperID = ID;
	}
	
	public String getDeletePaperID() {
		return deletePaperID;
	}
	
	public void setPaperID(String ID) {
		this.paperID = ID;
	}
	
	public String getPaperID() {
		return paperID;
	}
	
	public void setReportID(String ID) {
		this.reportID = ID;
	}
	
	public String getReportID() {
		return reportID;
	}
	
	

	
	@Override
	public String toString() {
		return "User [ username=" + username + ", password="
				+ password + ", email=" + email +"]";
	}
}
