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
	String description = null;
	String finalRecommendation = null;
	String submissionDate = null;
	String memberID = null;
	String reviewID = null;
	

	
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
	
	/*
	 * For a lot of these I had to add if statments for the update functionality
	 * The if statements check if the items respective form was empty or not
	 * If it is empty it does not update the items and the items remain null
	 * This was done so the user could update select items instead of every item
	 */
	public void setAuthorName(String name) {
		if (!name.isEmpty())
		{
			this.authorName = name;
		}
		else {
			System.out.println("Author Name Skipped nothing entered");
		}
		
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorAffiliation(String affiliation) {
		if (!affiliation.isEmpty())
		{
			this.authorAffiliation = affiliation;
		}
		else {
			System.out.println("Author Affiliation Skipped nothing entered");
		}
	}
	
	public String getAuthorAffiliation() {
		return authorAffiliation;
	}
	
	public void setAuthorEmail(String email) {
		if (!email.isEmpty())
		{
			this.authorEmail = email;
		}
		else {
			System.out.println("Author Email Skipped nothing entered");
		}
	}
	
	public String getAuthorEmail() {
		return authorEmail;
	}
	
	public void setTitle(String paperTitle) {
		if (!paperTitle.isEmpty())
		{
			this.title = paperTitle;
		}
		else {
			System.out.println("Title Skipped nothing entered");
		}
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAbstract(String theAbstract) {
		if (!theAbstract.isEmpty())
		{
			this.paperAbstract = theAbstract;
		}
		else {
			System.out.println("Abstract Skipped nothing entered");
		}
	}
	
	public String getAbstract() {
		return paperAbstract;
	}
	
	public void setPDF(String pdf) {
		if (!pdf.isEmpty())
		{
			this.PDFfile = pdf;
		}
		else {
			System.out.println("PDF File Skipped nothing entered");
		}
	}
	
	public String getPDF() {
		return PDFfile;
	}
	
	public void setReviewerName(String name) {
		if (!name.isEmpty())
		{
			this.reviewerName = name;
		}
		else {
			System.out.println("Reviewer Name Skipped nothing entered");
		}
	}
	
	public String getReviewerName() {
		return reviewerName;
	}
	
	public void setReviewID(String ID) {		//also report ID, if i can do refactoring i gotta make them one element
		if(!ID.isEmpty()) {
			this.reviewID = ID;
		}
		else
			System.out.println("Review ID skipped nothing entered");
	}
	
	public String getReviewID() {
		return reviewID;
	}
	
	public void setDeletePaperID(String ID) {
		this.deletePaperID = ID;
	}
	
	public String getDeletePaperID() {
		return deletePaperID;
	}
	
	public void setPaperID(String ID) {
		if (!ID.isEmpty())
		{
			this.paperID = ID;
		}
		else {
			System.out.println("Paper ID Skipped nothing entered");
		}
	}
	
	public String getPaperID() {
		return paperID;
	}
	
	public void setReportID(String ID) {
		if (!ID.isEmpty())
		{
			this.reportID = ID;
		}
		else {
			System.out.println("Report Ikipped nothing entered");
		}
	}
	
	public String getReportID() {
		return reportID;
	}

	public void setDescription(String desc) {
		if (!desc.isEmpty())
		{
			this.description = desc;
		}
		else {
			System.out.println("Skipped, nothing entered");
		}
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setFinalRecommendation(String rec) {
		if (!rec.isEmpty())
		{
			this.finalRecommendation = rec;
		}
		else
		{
			System.out.println("Skipped, nothing entered");
		}
	}
	
	public String getFinalRecommendation() {
		return finalRecommendation;
	}
	
	public void setSubmissionDate(String date) {
		if(date.isEmpty()) {
			this.submissionDate = date;
		}
		else
		{
			System.out.println("Skipped, nothing entered");
		}
	}
	
	public String getSubmissionDate() {
		return submissionDate;
	}
	
	public void setMemberID(String ID) {
		if(!ID.isEmpty()) {
			this.memberID = ID;
		}
		else
			System.out.println("Skipped, nothing entered");
	}
	
	public String getMemberID()
	{
		return memberID;
	}
	

	
	@Override
	public String toString() {
		return "User [ username=" + username + ", password="
				+ password + ", email=" + email +"]";
	}
}
