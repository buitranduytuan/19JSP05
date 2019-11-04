package vn.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import vn.demo.bo.Users;
import vn.demo.idao.IUsers;
import vn.demo.test.MainConnectionUtils;
import vn.demo.utils.ConnectionUtils;

public class UsersDAOImpl implements IUsers {

	@Override
	public void addUser(Users user, Statement statement) throws SQLException {
		String sql = "INSERT INTO Users(UserName,Password, isAdmin)"
				+"VALUES('"+user.getUserName()+"','"+user.getPassword()+"',"+user.isAdmin()+")";
		statement.executeUpdate(sql);
		System.out.println("Insert successfully");
	}

	@Override
	public void deleteUserById(int  idUser, Statement statement) throws SQLException {
		String sql = "DELETE FROM Users WHERE idUsers = "+idUser;
		statement.executeUpdate(sql);
		System.out.println("Delete successfully");
	}

	@Override
	public void updateUserById(int  idUsers,String UserName, String password, boolean isAdmin, Statement statement) throws SQLException {
		String sql="UPDATE Users"
				+" SET UserName ='"+UserName+"', Password = '"+password+"', isAdmin = "+isAdmin
				+" WHERE idUsers = "+idUsers;
		statement.executeUpdate(sql);
		System.out.println("Update User successfully");
	}

	@Override
	public void findUserById(int idUsers, Statement statement) throws SQLException {
		ResultSet rs = statement.executeQuery("select * from Users WHERE idUsers = "+idUsers);
		while(rs.next()) {
			Users user = new Users( rs.getString(2), rs.getString(3),rs.getBoolean(4));
			System.out.println(idUsers+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getBoolean(4));
		}
	}

	@Override
	public void addAllUserInArrayList( List<Users> list, Statement statement) throws SQLException {
		ResultSet rs = statement.executeQuery("select * from Users");
		while(rs.next()) {
			Users user = new Users(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getBoolean(4));
			list.add(user);
		}
	}

	@Override
	public void printAllUserInfor(List<Users> list) {
		for(Users i: list) {
			System.out.println(i.getIdUsers()+"\t"+i.getUserName()
			+"\t"+i.getPassword()+"\t\t"+i.isAdmin()); }		
	}
}
