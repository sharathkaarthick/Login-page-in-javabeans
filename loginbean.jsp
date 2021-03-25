<%@ page language="Java" import="java.sql.*" %>  
<HTML> 
<HEAD><TITLE>DataBase Search</TITLE></HEAD>  
<BODY>
<jsp:useBean id="db" scope="request" class="logbean.LoginBean" >
  <jsp:setProperty name="db" property="userName" value='<%=request.getParameter("userName")%>'/>
  <jsp:setProperty name="db" property="password" value='<%=request.getParameter("password")%>'/>
 </jsp:useBean>
<jsp:forward page="login">
  <jsp:param name="username" value='<%=request.getParameter("userName")%>' />
  <jsp:param name="password" value='<%=request.getParameter("password")%>' />
</jsp:forward> 
</body>
</html>