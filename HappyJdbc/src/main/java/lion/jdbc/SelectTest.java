package lion.jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectTest {

    public static void main(String[] args) {
        // 1. 필요한 객체 먼저 선언
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT deptno, dname, loc FROM dept";

        try {
            conn = DBUtil.getConnection();
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getInt("deptno") + "\t");
                System.out.print(rs.getString("dname") + "\t");
                System.out.print(rs.getString("loc") + "\n");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // 2. 선언했으면 닫아라!
            DBUtil.close(conn, ps, rs);
        }
    }
}
