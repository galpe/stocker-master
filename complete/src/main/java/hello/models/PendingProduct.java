package hello.models;

import java.util.List;

/**
 * Created by janne.gershman on 10/14/15.
 */
public class PendingProduct
{
    private String id;
    private String name;
    private String imgUrl;
    private List<User> users;

    @Override
    public String toString()
    {
        return "PendingProduct{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", users=" + users +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof PendingProduct)) return false;

        PendingProduct that = (PendingProduct) o;

        if (!id.equals(that.id)) return false;
        if (imgUrl != null ? !imgUrl.equals(that.imgUrl) : that.imgUrl != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (users != null ? !users.equals(that.users) : that.users != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        return id.hashCode();
    }

    public String getId()
    {
        return id;
    }

    public PendingProduct setId(String id)
    {
        this.id = id;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public PendingProduct setName(String name)
    {
        this.name = name;
        return this;
    }

    public String getImgUrl()
    {
        return imgUrl;
    }

    public PendingProduct setImgUrl(String imgUrl)
    {
        this.imgUrl = imgUrl;
        return this;
    }

    public List<User> getUsers()
    {
        return users;
    }

    public PendingProduct setUsers(List<User> users)
    {
        this.users = users;
        return this;
    }
}
