package hello.resources;


import hello.models.Comment;
import hello.models.ProductsDto;
import hello.models.SidebarDto;
import hello.models.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import respositories.ProductRepository;

import javax.ws.rs.QueryParam;

/**
 * Created by janne.gershman on 10/14/15.
 */
@RestController
public class ProductResourceImp
{
    @Autowired
    private ProductRepository productRepositoryImp;

    @RequestMapping("/getProducts")
    public ProductsDto getProducts(@QueryParam(value = "page") String page,
                               @QueryParam(value = "name") String name,
                               @QueryParam(value = "category") String category)
    {
        productRepositoryImp.check();
        return new ProductsDto();
    }

    @RequestMapping("/getSidebar")
    public SidebarDto greeting(@QueryParam(value = "page") String page,
                             @QueryParam(value = "name") String name,
                             @QueryParam(value = "category") String category)
    {
        return new SidebarDto();
    }

    @RequestMapping(value = "/changeProductStatus/{productId}/{status}", method = RequestMethod.POST)
    public Status changeGroup(@PathVariable String productId, @PathVariable Status status)
    {
        return status;
    }

    @RequestMapping(value = "/likeProduct/{productId}/{liked}", method = RequestMethod.POST)
    public boolean likeProduct(@PathVariable String productId, @PathVariable boolean liked)
    {
        return liked;
    }

    @RequestMapping(value = "/comments", method = RequestMethod.POST)
    public Comment likeProduct(@RequestBody String body)
    {
        return new Comment().setText(body);
    }

//    @Required
//    public void setProductRepositoryImp(ProductRepositoryImp productRepositoryImp)
//    {
//        this.productRepositoryImp = productRepositoryImp;
//    }
}
