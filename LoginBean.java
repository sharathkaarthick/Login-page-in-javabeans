package logbean;
public class LoginBean {
  String userName="";
  String password="";
  public String getUserName() {
  return userName;
  }
  public void setUserName(String userName) {
  this.userName = userName;
  System.out.println(this.userName);
  }
  public String getPassword() {
  return password;
  }
  public void setPassword(String password) {
 this.password = password;
 System.out.println(this.password);
  }
  }