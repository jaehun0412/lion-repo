package lion.jdbc;

import java.util.List;

public class DeptDAOTest {

    public static void main(String[] args) {
        DeptDAO deptDAO = new DeptDAO();
        DeptDTO deptDTO = new DeptDTO();

        deptDTO.setDeptno(70);
        deptDTO.setDname("Hello");
        deptDTO.setLoc("LA");

//        deptDAO.insert(deptDTO);

//        deptDAO.insert(60, "Like", "Ilsan");
//        deptDAO.delete(60);

        DeptDAOwithDBUtil deptDAOwithDBUtil = new DeptDAOwithDBUtil();
        List<DeptDTO> deptList = deptDAOwithDBUtil.getDeptList();

//        for (DeptDTO dto : deptList) {
//            System.out.println(dto);
//        }

        DeptDTO resultDept = deptDAOwithDBUtil.getDept(10);
        System.out.println(resultDept);
    }
}
