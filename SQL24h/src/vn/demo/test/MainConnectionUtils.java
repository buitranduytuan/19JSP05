package vn.demo.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import vn.demo.bo.Users;
import vn.demo.dao.UsersDAOImpl;
import vn.demo.idao.IUsers;
import vn.demo.utils.ConnectionUtils;

public class MainConnectionUtils {
	static List<Users> listUsers = new ArrayList<Users>();

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionUtils.getMyConnection();
		Statement statement = conn.createStatement();

		IUsers usersDAO = new UsersDAOImpl();
		Users user = new Users("Cẩm Tú", "1234654", false);

		// Sử dụng PreparedStatement
		/*
		String sqlInsert ="INSERT INTO Users(UserName, Password, isAdmin ) VALUES(?, ?, ?)";
		PreparedStatement stmt = conn.prepareStatement(sqlInsert);
		stmt.setString(1,"Hồng Duy");
		stmt.setString(2, "123321"); 
		stmt.setBoolean(3, false);
		stmt.execute();
		 */

		// usersDAO.addUsers(user, statement);
		// usersDAO.deleteUserById(11, statement);
		// usersDAO.findUsersById(6, statement);
		usersDAO.updateUserById(2, "Văn Hùng", "fsdffd", false, statement);
		usersDAO.addAllUserInArrayList(listUsers, statement);
		usersDAO.printAllUserInfor(listUsers);
	}
}
