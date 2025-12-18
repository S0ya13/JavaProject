package pl.edu.vistula.second_project.product.service;

import org.springframework.stereotype.Service;
import pl.edu.vistula.second_project.product.api.request.ProductRequest;
import pl.edu.vistula.second_project.product.api.response.ProductResponse;
import pl.edu.vistula.second_project.product.domain.Product;
import pl.edu.vistula.second_project.product.repository.ProductRepository;
import pl.edu.vistula.second_project.product.support.ProductMapper;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository,
                          ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest) {
        Product product = productRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponse(product);
    }
}