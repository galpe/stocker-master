package hello.defaults;

import org.springframework.beans.factory.annotation.Required;
import hello.respositories.ProductRepositoryImp;

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
