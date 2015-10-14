package hello.resources;


import hello.models.Comment;
import hello.models.ProductsDto;
import hello.models.SidebarDto;
import hello.models.Status;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.QueryParam;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by janne.gershman on 10/14/15.
 */
@RestController
public class ProductResourceImp
{
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/getProducts")
    public ProductsDto getProducts(@QueryParam(value = "page") String page,
                               @QueryParam(value = "name") String name,
                               @QueryParam(value = "category") String category)
    {
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
}
