package lion.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {

    public void delete(int deptno) {
        String url = "jdbc:mysql://localhost:3307/liondb";
        String user = "jaehun";
        String password = "lion1234";

        String sql = "delete from dept where deptno = ?";

        // 1. DB 접속
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            // 2. 쿼리 작성
            ps.setInt(1, deptno);

            // 3. 쿼리 실행
            int resultCount = ps.executeUpdate();

            // 4. 결과 확인
            if (resultCount > 0) {
                System.out.println("delete success");
            } else {
                System.out.println("delete fail");
            }
        } catch (SQLException e) {
            throw new RuntimeException("DELETE 오류 발생!");
        }
    }
}
