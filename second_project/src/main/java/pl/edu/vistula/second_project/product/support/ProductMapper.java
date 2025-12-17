package pl.edu.vistula.second_project.product.support;

import org.springframework.stereotype.Component;
import pl.edu.vistula.second_project.product.api.request.ProductRequest;
import pl.edu.vistula.second_project.product.api.response.ProductResponse;
import pl.edu.vistula.second_project.product.domain.Product;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {
        return new Product(productRequest.getName());
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName());
    }
}