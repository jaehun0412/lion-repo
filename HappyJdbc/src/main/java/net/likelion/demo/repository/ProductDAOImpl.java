package net.likelion.demo.repository;

import net.likelion.demo.common.DBUtil;
import net.likelion.demo.dto.ProductDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {

    @Override
    public boolean add(ProductDTO productDTO) {
        boolean result = false;
        String sql = "INSERT INTO products (name, price, reg_date) VALUES (?, ?, NOW())";

        try (        // 접속
                     Connection conn = DBUtil.getConnection();
                     // 쿼리작성
                     PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, productDTO.getName());
            ps.setInt(2, productDTO.getPrice());
            // 실행
            int resultCount = ps.executeUpdate();

            if (resultCount > 0) {
                result = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public int addProductAndGetId(ProductDTO productDTO) {
        String sql = "INSERT INTO products (name, price, reg_date) VALUES (?, ?, NOW())";
        int id = 0;

        try (        // 접속
                     Connection conn = DBUtil.getConnection();
                     // 쿼리작성
                     PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)
        ) {
            ps.setString(1, productDTO.getName());
            ps.setInt(2, productDTO.getPrice());
            // 실행
            int resultCount = ps.executeUpdate();

            if (resultCount > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    id = rs.getInt(1);
                }
            } else {
                System.out.println("상품 등록에 실패했습니다.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return id;
    }

    @Override
    public boolean update(ProductDTO productDTO) {
        return false;
    }

    @Override
    public boolean delete(ProductDTO productDTO) {
        return false;
    }

    @Override
    public List<ProductDTO> getProducts() {
        List<ProductDTO> products = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM products";

        try {
            conn = DBUtil.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                products.add(resultSetToProduct(rs));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            DBUtil.close(conn, ps, rs);
        }
        return products;
    }

    @Override
    public ProductDTO getProduct(int id) {
        ProductDTO product = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM products WHERE id = ?";

        try {
            conn = DBUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();
            if (rs.next()) {
                product = resultSetToProduct(rs);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            DBUtil.close(conn, ps, rs);
        }
        return product;
    }

    // select 할 때, ResultSet에서 값을 꺼내서 DTO에 넣는 작업을 한 건 조회할 때도, 여러 건 조회할 때도 중복해서 사용
    // 상품명으로 조회 등 메서드가 추가된다면? 혹은 컬럼이 더 많다면?
    // 이런 작업을 하는 메서드를 따로 꺼내서 사용
    private ProductDTO resultSetToProduct(ResultSet rs) throws SQLException {
        ProductDTO product = new ProductDTO();

        product.setId(rs.getInt("id"));
        product.setName(rs.getString("name"));
        product.setPrice(rs.getInt("price"));
//        product.setRegDate(rs.getTimestamp("reg_date").toLocalDateTime());

        Timestamp regDate = rs.getTimestamp("reg_date");
        if (regDate != null) {
            product.setRegDate(regDate.toLocalDateTime());
        }

        return product;
    }
}
