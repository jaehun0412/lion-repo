package net.likelion.demo.common;

import java.sql.*;

public class DBUtil {

    // 커넥션 객체를 얻어와야 한다.
    // 접속
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/liondb";
        String user = "jaehun";
        String password = "lion1234";

        return DriverManager.getConnection(url, user, password);
    }

    public Connection getConnection(String user, String password) {
        return null;
    }

    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void close(Connection conn, PreparedStatement ps) {
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        close(conn);
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        close(conn, ps);
    }

    public static void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
