package pl.edu.vistula.second_project.product.support.exception;

import org.springframework.stereotype.Component;
import pl.edu.vistula.second_project.product.support.exception.ProductNotFoundException;

import java.util.function.Supplier;

@Component
public class ProductExceptionSupplier {

    public Supplier<ProductNotFoundException> productNotFound(Long id) {
        return () -> new ProductNotFoundException(id);
    }
}