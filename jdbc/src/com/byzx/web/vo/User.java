package com.byzx.web.vo;
public class User {

   private int uid;
   private String username;
   private String password;
   private String sex;
   private int age;
   private String address;
  
  public int getUid() {
    return uid;
  }
  
  public void setUid(int uid) {
    this.uid = uid;
  }
  
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
  
  public String getSex() {
    return sex;
  }
  
  public void setSex(String sex) {
    this.sex = sex;
  }

  public int getAge() {
    return age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
 
  public String getAddress() {
    return address;
  }
  void setAddress(String address) {
    this.address = address;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", sex=" + sex + ", age=" + age
        + ", address=" + address + "]";
  }
}
