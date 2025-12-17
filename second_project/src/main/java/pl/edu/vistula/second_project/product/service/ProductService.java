package pl.edu.vistula.second_project.product.service;

import org.springframework.stereotype.Service;
import pl.edu.vistula.second_project.product.api.request.ProductRequest;
import pl.edu.vistula.second_project.product.api.response.ProductResponse;
import pl.edu.vistula.second_project.product.domain.Product;
import pl.edu.vistula.second_project.product.repository.ProductRepository;
import pl.edu.vistula.second_project.product.support.exception.ProductExceptionSupplier;
import pl.edu.vistula.second_project.product.support.ProductMapper;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final ProductExceptionSupplier productExceptionSupplier;

    public ProductService(ProductRepository productRepository,
                          ProductMapper productMapper,
                          ProductExceptionSupplier productExceptionSupplier) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
        this.productExceptionSupplier = productExceptionSupplier;
    }

    public ProductResponse create(ProductRequest productRequest) {
        Product product = productRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponse(product);
    }

    public ProductResponse find(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(productExceptionSupplier.productNotFound(id));
        return productMapper.toProductResponse(product);
    }

    public List<ProductResponse> findAll() {
        return productRepository.findAll().stream()
                .map(productMapper::toProductResponse)
                .toList();
    }
}