package firstspringio.northwind.DataAccess.Abstract;

import firstspringio.northwind.Entities.Concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {

}
