package lion.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

    public void insert(int deptno, String dname, String loc) {
        // 0. 드라이버 로딩 (MySQL 드라이버를 메모리에 올린다.)
        // 최근에는 자동으로 해준다.

        String url = "jdbc:mysql://localhost:3307/liondb";
        String user = "jaehun";
        String password = "lion1234";

        String sql = "insert into dept (deptno, dname, loc) values (?, ?, ?)";

        // 1. 접속 -- Connection

        // 2. 쿼리 작성 -- Statement (완벽한 쿼리), PreparedStatement
        // 쿼리문이 실행될 때 DBMS가 알아들을 수 있게 번역(파싱) 된다.
        // 같은 쿼리가 또 들어오면 이미 번역한 것을 사용한다.
        // insert into students(name) values ('kang');
        // insert into students(name) values ('hong');
        // insert into students(name) values ('kim');
        // 위의 쿼리는 각자 다른 쿼리로 인식한다. statement는 값까지 들어간 완벽한 쿼리로 실행된다.

        // PreparedStatement
        // insert into students(name) values(?); -- 여기까지를 번역한다.

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            // 반드시 '?' 값을 채워주어야 한다!! -- 쿼리를 완성해야 한다.
            ps.setInt(1, deptno);
            ps.setString(2, dname);
            ps.setString(3, loc);

            // 3. 실행
            int resultCount = ps.executeUpdate();

            if (resultCount == 1) {
                System.out.println("입력 성공");
            }
        } catch (SQLException e) {
            throw new RuntimeException("INSERT 오류 발생!");
        }
    }
}
