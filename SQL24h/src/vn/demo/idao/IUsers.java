package vn.demo.idao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vn.demo.bo.Users;

public interface IUsers {
	public void addUser(Users user, Statement statement) throws SQLException;
	public void deleteUserById(int  idUser, Statement statement) throws SQLException;
	public void updateUserById(int  idUser,String UserName, String password, boolean isAdmin, Statement statement) throws SQLException;
	public void findUserById(int idUsers, Statement statement) throws SQLException;
	public void addAllUserInArrayList( List<Users> listUsers, Statement statement) throws SQLException;
	public void printAllUserInfor(List<Users> list);
}
