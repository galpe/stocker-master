package hello.resources;

import hello.models.*;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.QueryParam;
import java.util.*;

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

    private List<Comment> comments = new ArrayList<Comment>() {{
        add(new Comment().setId("1").setDate(new Date()).setAuthor(new User().setId("1").setName("Bill").setImgUrl("https://pbs.twimg.com/profile_images/451207149478096896/HoMUOmyu.jpeg")).setText("This is sooo cool"));
    }};

    private List<User> proUsers = new ArrayList<User>() {{
        add(new User().setName("pinocchio").setImgUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqB6GS7vt0FGYehegBGwDNvXha_5mnM2uNa5HY91NT4JOvalgl").setId("77"));
        add(new User().setName("Johnny").setImgUrl("http://vignette3.wikia.nocookie.net/hanna-barbera/images/2/24/Johnny_Bravo.jpg/revision/latest?cb=20120423033926").setId("94"));
    }};

    private List<User> conUsers = new ArrayList<User>() {{
        add(new User().setName("Alf").setImgUrl("http://vignette1.wikia.nocookie.net/alf/images/6/62/ALF.jpg/revision/latest?cb=20080801232533").setId("32"));
    }};

    private List<PendingProduct> pros = new ArrayList<PendingProduct>() {{
        add(new PendingProduct().setId("16").setImgUrl("http://33.media.tumblr.com/tumblr_li9nu2kLuH1qdgmhm.jpg").setName("Bazooka bubble gum").setUsers(proUsers));
    }};

    private List<PendingProduct> cons = new ArrayList<PendingProduct>() {{
        add(new PendingProduct().setId("12").setImgUrl("http://www.yashir4u.co.il/pictures/6919901_7290000066318_s.jpg").setName("Bamba - Osem").setUsers(conUsers));
    }};

    @RequestMapping("/getProducts")
    public ProductsDto getProducts(@QueryParam(value = "page") String page,
                               @QueryParam(value = "name") String name,
                               @QueryParam(value = "category") String category)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, 12);
        Date endDate = calendar.getTime();
        calendar.add(Calendar.DATE, -20);
        Date startDate = calendar.getTime();
        calendar.add(Calendar.DATE, 14);
        Date delivDate = calendar.getTime();

        return new ProductsDto().setProducts(products).setDateEnd(endDate).setDateStart(startDate).setNextDeliveryDate(delivDate).setNumPages(2).setPage(1);
    }

    @RequestMapping("/getSidebar")
    public SidebarDto greeting(@QueryParam(value = "page") String page,
                             @QueryParam(value = "name") String name,
                             @QueryParam(value = "category") String category)
    {
        return new SidebarDto().setComments(comments).setUser(new User().setId("2").setName("Mike").setImgUrl("MikesUrl")).setCons(cons).setPros(pros);
    }

    @RequestMapping(value = "/changeProductStatus/{productId}/{status}", method = RequestMethod.POST)
    public Status changeProductStatus(@PathVariable String productId, @PathVariable Status status)
    {
        Product product = products.get(Integer.parseInt(productId) - 1);
        product.setStatus(status);
        return status;
    }

    @RequestMapping(value = "/likeProduct/{productId}/{liked}", method = RequestMethod.POST)
    public boolean likeProduct(@PathVariable String productId, @PathVariable boolean liked)
    {
        Product product = products.get(Integer.parseInt(productId) - 1);
        product.setLiked(liked);
        return liked;
    }

    @RequestMapping(value = "/comments", method = RequestMethod.POST)
    public Comment likeProduct(@RequestBody String body)
    {
        return new Comment().setText(body);
    }
}
