package hello.defaults;

import org.springframework.beans.factory.annotation.Required;
import respositories.ProductRepositoryImp;

import java.util.HashSet;

/**
 * Created by janne.gershman on 10/14/15.
 */
public class DefaultService
{
    private ProductRepositoryImp productRepositoryImp;

    public void CreateDefaults()
    {
    }

    @Required
    public void setProductRepositoryImp(ProductRepositoryImp productRepositoryImp)
    {
        this.productRepositoryImp = productRepositoryImp;
    }
}
