package hello.models;

/**
 * Created by janne.gershman on 10/13/15.
 */
public class User
{
    private String id;
    private String name;
    private String imgUrl;
    private UserType type;

    public String getId()
    {
        return id;
    }

    public User setId(String id)
    {
        this.id = id;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public User setName(String name)
    {
        this.name = name;
        return this;
    }

    public String getImgUrl()
    {
        return imgUrl;
    }

    public User setImgUrl(String imgUrl)
    {
        this.imgUrl = imgUrl;
        return this;
    }
}
