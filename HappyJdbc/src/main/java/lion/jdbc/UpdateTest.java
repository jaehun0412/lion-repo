package lion.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {

    public void updateDname(String dname, int deptno) {
        String url = "jdbc:mysql://localhost:3307/liondb";
        String user = "jaehun";
        String password = "lion1234";

        String sql = "update dept set dname = ? where deptno = ?";

        // 1. DB 접속
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            // 2. 쿼리 작성
            ps.setString(1, dname);
            ps.setInt(2, deptno);

            // 3. 쿼리 실행
            int resultCount = ps.executeUpdate();

            // 4. 결과 확인
            if (resultCount > 0) {
                System.out.println("update success");
            } else {
                System.out.println("update fail");
            }
        } catch (SQLException e) {
            throw new RuntimeException("UPDATE 오류 발생!");
        }
    }
}
