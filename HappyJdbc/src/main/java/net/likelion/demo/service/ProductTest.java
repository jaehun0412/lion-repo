package net.likelion.demo.service;

import net.likelion.demo.dto.ProductDTO;
import net.likelion.demo.repository.ProductDAO;
import net.likelion.demo.repository.ProductDAOImpl;

import java.util.List;

public class ProductTest {

    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAOImpl();
//        boolean resultFlag = productDAO.add(new ProductDTO("book", 20000));
//        System.out.println(resultFlag);

//        int id = productDAO.addProductAndGetId(new ProductDTO("phone", 300000));
//        System.out.println("product  저장되면서 자동 생성한 id: " + id);
        // 게시글 저장 { 1. 게시글 테이블에 글 저장, 2. 첨부된 이미지 저장 (게시글이 저장되면서 생성된 id 필요) }

        // 하나의 서비스(기능)이 실행될 때 DAO가 여러 번 호출될 수 있음

//        ProductDTO product = productDAO.getProduct(2);
//        System.out.println(product);

        productDAO.getProducts().forEach(System.out::println);
    }
}
