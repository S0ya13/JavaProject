package pl.edu.vistula.second_project.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.vistula.second_project.product.domain.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}