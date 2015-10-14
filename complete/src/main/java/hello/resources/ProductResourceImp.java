package hello.resources;

import hello.models.*;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.QueryParam;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by janne.gershman on 10/14/15.
 */
@RestController
public class ProductResourceImp
{
    private List<Product> products = new ArrayList<Product>() {{
        add(new Product("1", "nfaf", "Sdfsdf", Status.empty, "Sdfsdf"));
    }};

    @RequestMapping("/getProducts")
    public ProductsDto getProducts(@QueryParam(value = "page") String page,
                               @QueryParam(value = "name") String name,
                               @QueryParam(value = "category") String category)
    {
        return new ProductsDto().setProducts(products);
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
}
