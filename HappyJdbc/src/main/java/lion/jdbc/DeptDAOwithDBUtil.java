package lion.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeptDAOwithDBUtil {

    public void insert(DeptDTO deptDTO) {
        String sql = "insert into dept (deptno, dname, loc) values (?, ?, ?)";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

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
        String sql = "update dept set dname = ? where deptno = ?";

        // 1. DB 접속
        try (Connection conn = DBUtil.getConnection();
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
        String sql = "delete from dept where deptno = ?";

        // 1. DB 접속
        try (Connection conn = DBUtil.getConnection();
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

    // 1건만 조회
    public DeptDTO getDept(int deptno) {
        String sql = "SELECT deptno, dname, loc FROM dept WHERE deptno=?";
        DeptDTO deptDTO = null;
        ResultSet rs = null;

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, deptno);
            rs = ps.executeQuery();

            if (rs.next()) {
                deptDTO = new DeptDTO(); // 해당 데이터가 존재할 때만 가방을 생성
                deptDTO.setDeptno(rs.getInt(1));
                deptDTO.setDname(rs.getString("dname"));
                deptDTO.setLoc(rs.getString("loc"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            DBUtil.close(rs);
        }

        return deptDTO;
    }

    // 조회
    public List<DeptDTO> getDeptList() {

        List<DeptDTO> deptList = new ArrayList<>();

        String sql = "SELECT deptno, dname, loc FROM dept";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
//                System.out.print(rs.getInt("deptno") + "\t");
//                System.out.print(rs.getString("dname") + "\t");
//                System.out.print(rs.getString("loc") + "\n");

                DeptDTO deptDTO = new DeptDTO();
                deptDTO.setDeptno(rs.getInt(1));
                deptDTO.setDname(rs.getString(2));
                deptDTO.setLoc(rs.getString(3));

                deptList.add(deptDTO);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return deptList;
    }
}
