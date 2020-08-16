package toby.user.dao;

import toby.user.domain.User;

import java.sql.*;

public abstract class UserDao {
    abstract Connection getConnection() throws ClassNotFoundException, SQLException;

    public static void main(String[] args) throws Exception {
        UserDao dao = new UserDao();

        User user = new User();
        user.setId("dhlee");
        user.setName("이동현");
        user.setPassword("천재");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getId() + " 조회 성공");
    }

    public void add(User user) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO USERS(ID, NAME, PASSWORD) VALUES (?, ?, ?)";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();
        ps.close();
        c.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM USERS WHERE ID = ?";
        Connection c = getConnection();
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));

        rs.close();
        ps.close();
        c.close();

        return user;
    }
}
