package lion.product;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    private static final String URL = "jdbc:mysql://localhost:3307/liondb";
    private static final String USER = "jaehun";
    private static final String PASSWORD = "lion1234";

    // 삽입
    public boolean insert(ProductDTO productDTO) {
        String sql = "INSERT INTO product (id, name, price) VALUES (?, ?, ?)";
        boolean inserted = false;

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, productDTO.getId());
            ps.setString(2, productDTO.getName());
            ps.setInt(3, productDTO.getPrice());

            int resultCount = ps.executeUpdate();
            if (resultCount == 1) {
                inserted = true;
                System.out.println("insert success");
            }
        } catch (SQLException e) {
            throw new RuntimeException("INSERT 오류 발생!", e);
        }
        return inserted;
    }

    // 삭제
    public boolean delete(int id) {
        String sql = "DELETE FROM product WHERE id = ?";
        boolean deleted = false;

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            int resultCount = ps.executeUpdate();

            if (resultCount > 0) {
                deleted = true;
                System.out.println("delete success");
            }
        } catch (SQLException e) {
            throw new RuntimeException("DELETE 오류 발생!", e);
        }
        return deleted;
    }

    // 수정
    public boolean updatePrice(int id, int price) {
        String sql = "UPDATE product SET price = ? WHERE id = ?";
        boolean updated = false;

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, price);
            ps.setInt(2, id);

            int resultCount = ps.executeUpdate();

            if (resultCount > 0) {
                updated = true;
                System.out.println("update success");
            }
        } catch (SQLException e) {
            throw new RuntimeException("UPDATE 오류 발생!", e);
        }
        return updated;
    }

    // 조회
    public List<ProductDTO> getProductList() {
        String sql = "SELECT id, name, price, reg_date FROM product";
        List<ProductDTO> productList = null;

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            productList = new ArrayList<>();

            while (rs.next()) {
                ProductDTO productDTO = new ProductDTO();
                productDTO.setId(rs.getInt("id"));
                productDTO.setName(rs.getString("name"));
                productDTO.setPrice(rs.getInt("price"));
                productDTO.setRegDate(LocalDateTime.now());

                productList.add(productDTO);
            }
        } catch (SQLException e) {
            throw new RuntimeException("SELECT 오류 발생!", e);
        }
        return productList;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
