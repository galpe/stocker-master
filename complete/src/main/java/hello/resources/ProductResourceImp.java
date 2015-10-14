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
        add(new Product("1", "Milk 3% - Tnuva", "http://www.office-exp.co.il/ProductsImages/L357934.jpg", Status.full, "Dairy milk"));
        add(new Product("2", "Yogurt 1.5% - Yoplait", "http://www.rami-levy.co.il/files/products/big/4131456.jpg", Status.empty, "Dairy milk"));
        add(new Product("3", "White cheese 5% - Terra", "http://www.tara.co.il/filestock/img/img_1394127111-12.png", Status.empty, "Dairy milk"));
        add(new Product("4", "Bulgarian cheese 5% - Tnuva", "http://www.rami-levy.co.il/files/products/big/6492616.jpg", Status.empty, "Dairy milk"));
        add(new Product("5", "Yellow cheese 9% - Tnuva", "http://www.office-exp.co.il/ProductsImages/O844124.jpg", Status.empty, "Dairy milk"));
        add(new Product("6", "Soy milk - Tnuva", "http://www.boker.co.il/UserFiles/web_pages/picture_68.jpg", Status.empty, "Dairy milk"));
        add(new Product("7", "Milk 3% - Tara", "http://www.alash.co.il/image/users/157444/detail/big/2242512.jpg", Status.empty, "Dairy milk"));
        add(new Product("8", "White cottage 5% - Tara", "http://www.tara.co.il/filestock/img/img_1394522848-08.png", Status.empty, "Dairy milk"));
        add(new Product("9", "Choco drink - Yotveta", "http://struss.realcommerce.co.il/wp-content/blogs.dir/1/files/yotvata-products/choco.jpg", Status.empty, "Dairy milk"));
        add(new Product("10", "Orange juice - Primor", "http://www.edenteva.co.il/Data/ImportedProductsNew/1045220.jpg", Status.empty, "Soft drinks"));
        add(new Product("11", "Doritos - Elit", "http://images.mysupermarket.co.il/Products_1000/55/004655.jpg", Status.empty, "Snacks & Sweets"));
        add(new Product("12", "Bamba - Osem", "http://www.yashir4u.co.il/pictures/6919901_7290000066318_s.jpg", Status.empty, "Snacks & Sweets"));
        add(new Product("13", "Coca Cola zero - Coca Cola", "http://www.yashir4u.co.il/pictures/%D7%96%D7%99%D7%A8%D7%95(1).jpg", Status.empty, "Soft drinks"));
        add(new Product("14", "Loacker chocolate - Loaker", "http://www.sendik.co.il/pics/1258374577.JPG", Status.empty, "Snacks & Sweets"));
        add(new Product("15", "Loacker napolitaner - Loaker", "http://www.rami-levy.co.il/files/products/big/380004911.jpg", Status.empty, "Snacks & Sweets"));
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
    public Status changeProductStatus(@PathVariable String productId, @PathVariable Status status)
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
