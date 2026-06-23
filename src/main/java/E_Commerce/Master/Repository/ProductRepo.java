package E_Commerce.Master.Repository;

import E_Commerce.Master.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer>
{
}
