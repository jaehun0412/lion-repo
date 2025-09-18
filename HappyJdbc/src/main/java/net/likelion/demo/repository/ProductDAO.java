package net.likelion.demo.repository;

import net.likelion.demo.dto.ProductDTO;

import java.util.List;

public interface ProductDAO {

    public boolean add(ProductDTO productDTO);

    public int addProductAndGetId(ProductDTO productDTO);

    public boolean update(ProductDTO productDTO);

    public boolean delete(ProductDTO productDTO);

    public List<ProductDTO> getProducts();

    public ProductDTO getProduct(int id);

    // 입력이 될 때 id가 자동으로 생성된다.

    // 게시글이 저장되면 자동으로 생성된 id 값을 얻어와야, 다음 사진의 정보를 저장할 때 해당 게시글 id를 저장할 수 있다.

}
