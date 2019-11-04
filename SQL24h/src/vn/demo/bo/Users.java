package vn.demo.bo;

public class Users {
	private int idUsers;
	private String UserName;
	private String Password;
	private boolean isAdmin;

	public Users() {
	}
	
	public Users(int idUsers, String userName, String password, boolean isAdmin) {
		this.idUsers = idUsers;
		UserName = userName;
		Password = password;
		this.isAdmin = isAdmin;
	}

	public Users(String userName, String password, boolean isAdmin) {
		UserName = userName;
		Password = password;
		this.isAdmin = isAdmin;
	}
	public int getIdUsers() {
		return idUsers;
	}
	public void setIdUsers(int idUsers) {
		this.idUsers = idUsers;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}
