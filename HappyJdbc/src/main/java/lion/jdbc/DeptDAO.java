package lion.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptDAO {

    /*public void insert(int deptno, String dname, String loc) {
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
    }*/

    public void insert(DeptDTO deptDTO) {
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
            ps.setInt(1, deptDTO.getDeptno());
            ps.setString(2, deptDTO.getDname());
            ps.setString(3, deptDTO.getLoc());

            // 3. 실행
            int resultCount = ps.executeUpdate();

            if (resultCount == 1) {
                System.out.println("입력 성공");
            }
        } catch (SQLException e) {
            throw new RuntimeException("INSERT 오류 발생!");
        }
    }

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
