package user;

 public class Users {
	 private String UserName;
	 private String email;
	 private String password;
	 private boolean Admin=false;
	 
	 static int amountOfUsers;
	 static int amountOfAdmins;
	 static int amountOfRegUsers;
	 
	 public Users (String u, String e, String p, boolean admin) {
		 	this.setUserName(u);
	 		this.setEmail(e);
	 		this.setPassword(p);
	 		this.setAdmin(admin);
	 		if(admin) {
	 			amountOfAdmins +=1;
	 		}else {
	 			amountOfRegUsers +=1;
	 		}
	 		
	 		amountOfRegUsers = amountOfAdmins + amountOfRegUsers;
	 		
	 			
	 		
		 
	 }
	 	public Users (String u, String e, String p) {
	 		this.setUserName(u);
		 	this.setEmail(e);
			this.setPassword(p);
	 		
	 		amountOfRegUsers +=1;
	 		
	 		
	 		amountOfRegUsers = amountOfAdmins + amountOfRegUsers;
	 }

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return Admin;
	}

	public void setAdmin(boolean admin) {
		Admin = admin;
	}
}
