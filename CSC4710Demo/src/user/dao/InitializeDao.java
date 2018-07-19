package user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;




public class InitializeDao {
	
	
	public void initDB() {
		Statement statement;
		PreparedStatement preparedStatement;
		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/sampledb?"
				              + "user=Adam&password=starwars6");
			
			// Statements allow to issue SQL queries to the database
		      statement = connect.createStatement();
		      statement.executeUpdate("DROP TABLE IF EXISTS papers");

		      String sqlstmt = "CREATE TABLE IF NOT EXISTS papers " +
		                   "(paperID INTEGER not NULL AUTO_INCREMENT, " +
		                   " authorName VARCHAR(30), " + 
		                   " authorAffiliations VARCHAR(30), " + 
		                   " authorEmail VARCHAR(30), " + 
		                   " title VARCHAR(30), " +
		                   " abstract VARCHAR(500), " +
		                   " PDFname VARCHAR(20), " +
		                   " PRIMARY KEY ( paperID ))"; 
		      statement.executeUpdate(sqlstmt);
		      
		      statement.executeUpdate("DROP TABLE IF EXISTS reviews");
		      String sqlstmt2 = "CREATE TABLE IF NOT EXISTS reviews " +
		    		  		"(reportID INTEGER not NULL AUTO_INCREMENT, " +
		    		  		" description VARCHAR(500), " +
		    		  		" finalRecommendation VARCHAR(6), " +
		    		  		" subDate VARCHAR(10), " +
		    		  		" memberID INTEGER, " + 
		    		  		" paperID INTEGER, " +
		    		  		" PRIMARY KEY ( reportID ))";
		      statement.executeUpdate(sqlstmt2);
		      
		      statement.executeUpdate("DROP TABLE IF EXISTS members");
		      String sqlstmt3 = "CREATE TABLE IF NOT EXISTS members " +
		    		  		"(memberID INTEGER not NULL AUTO_INCREMENT, " +
		    		  		" memberName VARCHAR(50), " +
		    		  		" PRIMARY KEY ( memberID ))";
		      statement.executeUpdate(sqlstmt3);
		      
		     //start initialize 10 tuples for paper
		      	  preparedStatement = connect.prepareStatement("insert into  papers(authorName, authorAffiliations, authorEmail, title, abstract, PDFname) values (?, ?, ?, ?, ?, ?)");
		          preparedStatement.setString(1,  "J.K. Rowling");
		          preparedStatement.setString(2, "Scholastic");
		          preparedStatement.setString(3, "jkrowling@books.com");
		          preparedStatement.setString(4,  "Harry Potter 1");
		          preparedStatement.setString(5,  "Book about Harry Potter in the world of wizards");
		          preparedStatement.setString(6,  "harrypotter1.pdf");
		          preparedStatement.executeUpdate();
		          
		          preparedStatement = connect.prepareStatement("insert into  papers(authorName, authorAffiliations, authorEmail, title, abstract, PDFname) values (?, ?, ?, ?, ?, ?)");		         
		          preparedStatement.setString(1,  "Stephen King");
		          preparedStatement.setString(2, "Doubleday");
		          preparedStatement.setString(3, "stephenking@gmail.com");
		          preparedStatement.setString(4,  "The Shining");
		          preparedStatement.setString(5,  "The story of one family’s stay at a haunted hotel");
		          preparedStatement.setString(6,  "theshining.pdf");
		          preparedStatement.executeUpdate();

		          preparedStatement = connect.prepareStatement("insert into  papers(authorName, authorAffiliations, authorEmail, title, abstract, PDFname) values (?, ?, ?, ?, ?, ?)");		  
		          preparedStatement.setString(1,  "Andrzej Sapkowski");
		          preparedStatement.setString(2, "Orbit Books");
		          preparedStatement.setString(3, "andrzejwitcher@poland.com");
		          preparedStatement.setString(4,  "The Witcher");
		          preparedStatement.setString(5,  "The story of a Witcher who was genetically enhanced to fight monsters");
		          preparedStatement.setString(6,  "thewitcher.pdf");
		          preparedStatement.executeUpdate();
		          
		          preparedStatement = connect.prepareStatement("insert into  papers(authorName, authorAffiliations, authorEmail, title, abstract, PDFname) values (?, ?, ?, ?, ?, ?)");		      
		          preparedStatement.setString(1,  "Akira Toriyama");
		          preparedStatement.setString(2, "Weekly Shonen Jump");
		          preparedStatement.setString(3, "akiratoribot@japan.com");
		          preparedStatement.setString(4,  "Dragon Ball");
		          preparedStatement.setString(5,  "A boy with a tail sets off on a journey to find 7 dragon balls that can grant any wish");
		          preparedStatement.setString(6,  "dragonball.pdf");
		          preparedStatement.executeUpdate();
		          
		          preparedStatement = connect.prepareStatement("insert into  papers(authorName, authorAffiliations, authorEmail, title, abstract, PDFname) values (?, ?, ?, ?, ?, ?)");	
		          preparedStatement.setString(1, "Robert Kirkman");
		          preparedStatement.setString(2, "Image Comics");
		          preparedStatement.setString(3, "robertkirkman@gmail.com");
		          preparedStatement.setString(4, "The Walking Dead");
		          preparedStatement.setString(5, "A man wakes up from a coma to find the world he once lived in is now overrun by zombies");
		          preparedStatement.setString(6, "twd.pdf");
		          preparedStatement.executeUpdate();
		          
		          preparedStatement = connect.prepareStatement("insert into  papers(authorName, authorAffiliations, authorEmail, title, abstract, PDFname) values (?, ?, ?, ?, ?, ?)");	
		          preparedStatement.setString(1, "Tom Clancy");
		          preparedStatement.setString(2, "Putnam");
		          preparedStatement.setString(3, "tomclancy@rainbowsix.com");
		          preparedStatement.setString(4, "Patriot Games");
		          preparedStatement.setString(5, "A retired CIA analyst is on vacation with his family is attacked by a group of men and he tries to figure out who it was");
		          preparedStatement.setString(6, "patriotgames.pdf");
		          preparedStatement.executeUpdate();
		          
		          preparedStatement = connect.prepareStatement("insert into  papers(authorName, authorAffiliations, authorEmail, title, abstract, PDFname) values (?, ?, ?, ?, ?, ?)");	
		          preparedStatement.setString(1, "Suzanne Collins");
		          preparedStatement.setString(2, "Scholastic");
		          preparedStatement.setString(3, "suzannec@hotmail.com");
		          preparedStatement.setString(4, "The Hunger Games");
		          preparedStatement.setString(5, "In a dystopian world where one girl volunteers to take her sisters place after she was selected to take part in a fight for survival called the Hunger Games");
		          preparedStatement.setString(6, "thehungergames.pdf");
		          preparedStatement.executeUpdate();
		          
		          preparedStatement = connect.prepareStatement("insert into  papers(authorName, authorAffiliations, authorEmail, title, abstract, PDFname) values (?, ?, ?, ?, ?, ?)");	
		          preparedStatement.setString(1, "George R.R. Martin");
		          preparedStatement.setString(2, "Spectra");
		          preparedStatement.setString(3, "georgerrmartin@westoros.com");
		          preparedStatement.setString(4, "A Game of Thrones");
		          preparedStatement.setString(5, "A brutal fantasy world where the story follows the lives of several members of noble families in their struggle to rule over all else");
		          preparedStatement.setString(6, "got.pdf");
		          preparedStatement.executeUpdate();
		          
		          preparedStatement = connect.prepareStatement("insert into  papers(authorName, authorAffiliations, authorEmail, title, abstract, PDFname) values (?, ?, ?, ?, ?, ?)");	
		          preparedStatement.setString(1, "Bruce Campbell");
		          preparedStatement.setString(2, "St. Martin's Press");
		          preparedStatement.setString(3, "groovybruce@evildead.com");
		          preparedStatement.setString(4, "If Chins Could Kill");
		          preparedStatement.setString(5, "A satire of celebrity memoirs told as a story of a famous actor trying to do research for his role in the movie called ‘Let’s Make Love’");
		          preparedStatement.setString(6, "ifchinscouldkill.pdf");
		          preparedStatement.executeUpdate();
		          
		          preparedStatement = connect.prepareStatement("insert into  papers(authorName, authorAffiliations, authorEmail, title, abstract, PDFname) values (?, ?, ?, ?, ?, ?)");	
		          preparedStatement.setString(1, "RZA");
		          preparedStatement.setString(2, "Riverhead");
		          preparedStatement.setString(3, "rza@wutang.com");
		          preparedStatement.setString(4, "The Wu-Tang Manual");
		          preparedStatement.setString(5, "A guide to the Wu-Tang clan written by none other than RZA himself it contains biographies of each member and details certain things in many of their songs");
		          preparedStatement.setString(6, "thewutangmanual.pdf");
		          preparedStatement.executeUpdate();
		          
		          preparedStatement = connect.prepareStatement("insert into  papers(authorName, authorAffiliations, authorEmail, title, abstract, PDFname) values (?, ?, ?, ?, ?, ?)");
		          preparedStatement.setString(1, "Lu");
		          preparedStatement.setString(2, "Scholastic");
		          preparedStatement.setString(3, "lu@lutang.com");
		          preparedStatement.setString(4, "The Life of Lu");
		          preparedStatement.setString(5, "Biography of Lu, written by Lu, for those who like Lu.");
		          preparedStatement.setString(6, "lifeoflu.pdf");
		          preparedStatement.executeUpdate();
		          
		          preparedStatement = connect.prepareStatement("insert into  papers(authorName, authorAffiliations, authorEmail, title, abstract, PDFname) values (?, ?, ?, ?, ?, ?)");
		          preparedStatement.setString(1, "Zhang, Lu");
		          preparedStatement.setString(2, "Riverhead");
		          preparedStatement.setString(3, "zhang@zhang.com");
		          preparedStatement.setString(4, "Zhang and Lu");
		          preparedStatement.setString(5, "A book detailing the magical adventures between two friends");
		          preparedStatement.setString(6, "zhangandlu.pdf");
		          preparedStatement.executeUpdate();
		          		       
		          		  		         		          
		    //end paper initialization
		          
		          //start review initialization
		          preparedStatement = connect.prepareStatement("insert into  reviews(reportID, description, finalRecommendation, subDate, memberID, paperID) values (?, ?, ?, ?, ?, ?)");
		          preparedStatement.setString(1, "1");
		          preparedStatement.setString(2, "Very thrilling story, movie with Harrison Ford not too bad either");
		          preparedStatement.setString(3, "accept");
		          preparedStatement.setString(4, "2018-07-01");
		          preparedStatement.setString(5,  "6");
		          preparedStatement.setString(6,  "6");
		          preparedStatement.executeUpdate();	//1
		          
		          preparedStatement = connect.prepareStatement("insert into  reviews(reportID, description, finalRecommendation, subDate, memberID, paperID) values (?, ?, ?, ?, ?, ?)");		         
		          preparedStatement.setString(1, "2");
		          preparedStatement.setString(2, "Very grusome and heartbreaking, just when things look to be going good you find out everything is wrong");
		          preparedStatement.setString(3, "accept");
		          preparedStatement.setString(4, "2018-06-14");
		          preparedStatement.setString(5,  "8");
		          preparedStatement.setString(6,  "8");
		          preparedStatement.executeUpdate();	//2
		          
		          preparedStatement = connect.prepareStatement("insert into  reviews(reportID, description, finalRecommendation, subDate, memberID, paperID) values (?, ?, ?, ?, ?, ?)");	    
		          preparedStatement.setString(1, "3");
		          preparedStatement.setString(2, "Very good artstyle, very fun story, very loveable characters");
		          preparedStatement.setString(3, "accept");
		          preparedStatement.setString(4, "2018-02-24");
		          preparedStatement.setString(5,  "4");
		          preparedStatement.setString(6,  "4");
		          preparedStatement.executeUpdate();	//3
		          
		          preparedStatement = connect.prepareStatement("insert into  reviews(reportID, description, finalRecommendation, subDate, memberID, paperID) values (?, ?, ?, ?, ?, ?)");		        
		          preparedStatement.setString(1, "4");
		          preparedStatement.setString(2, "Has nothing to appeal to anyone who isn't a fan of the Wu Tang");
		          preparedStatement.setString(3, "reject");
		          preparedStatement.setString(4, "2018-01-06");
		          preparedStatement.setString(5,  "10");
		          preparedStatement.setString(6,  "10");
		          preparedStatement.executeUpdate();	//4
		          
		          preparedStatement = connect.prepareStatement("insert into  reviews(reportID, description, finalRecommendation, subDate, memberID, paperID) values (?, ?, ?, ?, ?, ?)");		
		          preparedStatement.setString(1, "5");
		          preparedStatement.setString(2, "Very scary pshychological thriller");
		          preparedStatement.setString(3, "accept");
		          preparedStatement.setString(4, "2018-04-22");
		          preparedStatement.setString(5,  "2");
		          preparedStatement.setString(6,  "2");
		          preparedStatement.executeUpdate();	//5
		          
		          preparedStatement = connect.prepareStatement("insert into  reviews(reportID, description, finalRecommendation, subDate, memberID, paperID) values (?, ?, ?, ?, ?, ?)");	
		          preparedStatement.setString(1, "6");
		          preparedStatement.setString(2, "The story stops trying to do anything new after a while");
		          preparedStatement.setString(3, "reject");
		          preparedStatement.setString(4, "2018-03-11");
		          preparedStatement.setString(5,  "5");
		          preparedStatement.setString(6,  "5");
		          preparedStatement.executeUpdate();	//6
		          
		          preparedStatement = connect.prepareStatement("insert into  reviews(reportID, description, finalRecommendation, subDate, memberID, paperID) values (?, ?, ?, ?, ?, ?)");		
		          preparedStatement.setString(1, "7");
		          preparedStatement.setString(2, "Could be a tad more brutal with its concept but good nonetheless");
		          preparedStatement.setString(3, "accept");
		          preparedStatement.setString(4, "2018-01-16");
		          preparedStatement.setString(5,  "7");
		          preparedStatement.setString(6,  "7");
		          preparedStatement.executeUpdate();  //7
		          
		          preparedStatement = connect.prepareStatement("insert into  reviews(reportID, description, finalRecommendation, subDate, memberID, paperID) values (?, ?, ?, ?, ?, ?)");	
		          preparedStatement.setString(1, "8");
		          preparedStatement.setString(2, "Excellent fantasy world that has its own system of doing things");
		          preparedStatement.setString(3, "accept");
		          preparedStatement.setString(4, "2018-06-07");
		          preparedStatement.setString(5,  "3");
		          preparedStatement.setString(6,  "3");
		          preparedStatement.executeUpdate(); //8
		          
		          preparedStatement = connect.prepareStatement("insert into  reviews(reportID, description, finalRecommendation, subDate, memberID, paperID) values (?, ?, ?, ?, ?, ?)");	
		          preparedStatement.setString(1, "9");
		          preparedStatement.setString(2, "Bruce should stick to movies and tv");
		          preparedStatement.setString(3, "reject");
		          preparedStatement.setString(4, "2018-05-28");
		          preparedStatement.setString(5,  "9");
		          preparedStatement.setString(6,  "9");
		          preparedStatement.executeUpdate(); //9
		          
		          preparedStatement = connect.prepareStatement("insert into  reviews(reportID, description, finalRecommendation, subDate, memberID, paperID) values (?, ?, ?, ?, ?, ?)");
		          preparedStatement.setString(1, "10");
		          preparedStatement.setString(2, "Builds a beautiful world of magic and wizardry");
		          preparedStatement.setString(3, "accept");
		          preparedStatement.setString(4, "2018-03-09");
		          preparedStatement.setString(5,  "1");
		          preparedStatement.setString(6,  "1");
		          preparedStatement.executeUpdate(); //10
		          
		          preparedStatement = connect.prepareStatement("insert into  reviews(reportID, description, finalRecommendation, subDate, memberID, paperID) values (?, ?, ?, ?, ?, ?)");	
		          preparedStatement.setString(1, "11");
		          preparedStatement.setString(2, "If you love Lu then this is a must for you as I am not a fan.");
		          preparedStatement.setString(3, "reject");
		          preparedStatement.setString(4, "2018-03-12");
		          preparedStatement.setString(5,  "11");
		          preparedStatement.setString(6,  "11");
		          preparedStatement.executeUpdate(); //11
		          
		          preparedStatement = connect.prepareStatement("insert into  reviews(reportID, description, finalRecommendation, subDate, memberID, paperID) values (?, ?, ?, ?, ?, ?)");	
		          preparedStatement.setString(1, "12");
		          preparedStatement.setString(2, "I'm not sure about the why with the Wu");
		          preparedStatement.setString(3, "reject");
		          preparedStatement.setString(4, "2018-03-12");
		          preparedStatement.setString(5,  "11");
		          preparedStatement.setString(6,  "10");
		          preparedStatement.executeUpdate();  //12
		          
		          preparedStatement = connect.prepareStatement("insert into  reviews(reportID, description, finalRecommendation, subDate, memberID, paperID) values (?, ?, ?, ?, ?, ?)");	
		          preparedStatement.setString(1, "13");
		          preparedStatement.setString(2, "Fantastic adventure with two friends!");
		          preparedStatement.setString(3, "accept");
		          preparedStatement.setString(4, "2018-05-25");
		          preparedStatement.setString(5,  "12");
		          preparedStatement.setString(6,  "12");
		          preparedStatement.executeUpdate();	//13
		          //end review initialization
		          
		          //start PC member initialization
		          
		          preparedStatement = connect.prepareStatement("insert into  members(memberName) values (?)");
		          preparedStatement.setString(1, "Chad Johnson");
		          preparedStatement.executeUpdate(); 	//1
		          
		          preparedStatement = connect.prepareStatement("insert into  members(memberName) values (?)");
		          preparedStatement.setString(1, "Joe Starr");
		          preparedStatement.executeUpdate();	//2
		          
		          preparedStatement = connect.prepareStatement("insert into  members(memberName) values (?)");
		          preparedStatement.setString(1, "Ashley Burke");
		          preparedStatement.executeUpdate();	//3
		          
		          preparedStatement = connect.prepareStatement("insert into  members(memberName) values (?)");
		          preparedStatement.setString(1, "Kurt Steel");
		          preparedStatement.executeUpdate();	//4
		          
		          preparedStatement = connect.prepareStatement("insert into  members(memberName) values (?)");
		          preparedStatement.setString(1, "Jessica Jones");
		          preparedStatement.executeUpdate();	//5
		          
		          preparedStatement = connect.prepareStatement("insert into  members(memberName) values (?)");
		          preparedStatement.setString(1, "Carl Lucas");
		          preparedStatement.executeUpdate();	//6
		          
		          preparedStatement = connect.prepareStatement("insert into  members(memberName) values (?)");
		          preparedStatement.setString(1, "Matt Murdock");
		          preparedStatement.executeUpdate();	//7
		          
		          preparedStatement = connect.prepareStatement("insert into  members(memberName) values (?)");
		          preparedStatement.setString(1, "Danny Rand");
		          preparedStatement.executeUpdate();	//8
		          
		          preparedStatement = connect.prepareStatement("insert into  members(memberName) values (?)");
		          preparedStatement.setString(1, "Tony Starks");
		          preparedStatement.executeUpdate();	//9
		          
		          preparedStatement = connect.prepareStatement("insert into  members(memberName) values (?)");
		          preparedStatement.setString(1, "Johnny Blaze");
		          preparedStatement.executeUpdate();	//10
		          
		          preparedStatement = connect.prepareStatement("insert into  members(memberName) values (?)");
		          preparedStatement.setString(1, "Matt");
		          preparedStatement.executeUpdate();	//11
		          
		          preparedStatement = connect.prepareStatement("insert into  members(memberName) values (?)");
		          preparedStatement.setString(1, "John");
		          preparedStatement.executeUpdate();	//12
		          
		          preparedStatement = connect.prepareStatement("insert into  members(memberName) values (?)");
		          preparedStatement.setString(1, "Bill");
		         // preparedStatement.setString(2, "NULL");
		          preparedStatement.executeUpdate();	//13
		          
		          System.out.println("Database Initialized");
		          
		          
		} catch(SQLException e) {
			throw new RuntimeException(e);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
}
