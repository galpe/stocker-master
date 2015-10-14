package hello.respositories;

import hello.models.Product;
import org.springframework.stereotype.Controller;

import java.util.Set;

/**
 * Created by janne.gershman on 10/14/15.
 */
@Controller
public class ProductRepositoryImp
implements ProductRepository
{
    private Set<Product> products;

    public ProductRepositoryImp()
    {
    }

    public ProductRepositoryImp(Set<Product> products)
    {
        this.products = products;
    }

    public void check()
    {
        return;
    }
}
