Everything in this project was done all by me with no assistence from anyone.

I'm gonna run through some basic instructions that should be done upon first setup as well as some things to know.

When starting the program you will run the server on main.jsp

Once you are on the welcome page the FIRST thing you should do is go to Database Options and hit initialize database.
Doing this will create every table and one view and populates with these tables with just enough rows to make the project work.

From there you must register and/or log in

Once you do that you are welcome to do anything you want from that point, just a few things worth mentioning:
1. When inserting something into a table you need to fill every entry on the form. I initialized everything to null so I'm not sure if it will give you an error if you don't
but just to be safe make sure you fill every entry.

2. When updating something you do NOT need to populate every form with the exeption of each tables respective ID's (paperID, reportID, memberID).
Failure to do this will not update anything for obvious reasons.

Other than those two things there shouldn't be anything wrong with it. Although, while I was testing and returned to the home page it would log me out.