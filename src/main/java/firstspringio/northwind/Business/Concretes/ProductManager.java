package firstspringio.northwind.Business.Concretes;

import firstspringio.northwind.Business.Abstract.ProductService;
import firstspringio.northwind.DataAccess.Abstract.ProductDao;
import firstspringio.northwind.Entities.Concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductManager implements ProductService {
    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
