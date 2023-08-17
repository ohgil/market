package com.project.market.product.service;

import com.project.market.product.entity.Product;
import com.project.market.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;
    @Value("${custom.genFileDirPath}")
    private String genFileDirPath;

    public void create(String name, String description, int price, MultipartFile thumbnail) {
        String thumbnailRelPath = genFileDirPath;

        try {
            thumbnail.transferTo(new File(genFileDirPath + "/1.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Product product = Product.builder()
                .name(name)
                .description(description)
                .price(price)
                .build();
        this.productRepository.save(product);
    }

    public Page<Product> getList(int page, String kw) {
        List<Sort.Order> sorts = new ArrayList<>();
        sorts.add(Sort.Order.desc("createDate"));
        Pageable pageable = PageRequest.of(page, 8, Sort.by(sorts));
        return this.productRepository.findAllByKeyword(kw, pageable);
    }

    public Product getProduct(Long id) {
        Optional<Product> product = this.productRepository.findById(id);
        if (product.isPresent()) {
            return product.get();
        } else {
            throw new RuntimeException("product not found");
        }
    }
}