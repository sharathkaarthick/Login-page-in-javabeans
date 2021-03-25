# Login-page-in-javabeans
index.html is the html source for login page
loginbean.jsp gets the user input from the html and stores it in LoginBean.java
LoginBean.java stores the data sent from the java bean
loginbean.jsp forwards to the servlet login.java to fetch the login credentials which are stored as cookies and reverts to a new page if successful else reverts back to login page
