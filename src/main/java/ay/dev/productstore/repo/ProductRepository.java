package ay.dev.productstore.repo;

import ay.dev.productstore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
