package hello.models;

import java.util.Date;

/**
 * Created by janne.gershman on 10/13/15.
 */
public class Product
{
    private String id;
    private String name;
    private String imgUrl;
    private Status status;
    private boolean liked;
    private String category;
    private Date lastEdited;
    private User lastEditor;

    @Override
    public String toString()
    {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", status=" + status +
                ", liked=" + liked +
                ", category='" + category + '\'' +
                ", lastEdited=" + lastEdited +
                ", lastEditor=" + lastEditor +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (liked != product.liked) return false;
        if (category != null ? !category.equals(product.category) : product.category != null) return false;
        if (!id.equals(product.id)) return false;
        if (imgUrl != null ? !imgUrl.equals(product.imgUrl) : product.imgUrl != null) return false;
        if (lastEdited != null ? !lastEdited.equals(product.lastEdited) : product.lastEdited != null) return false;
        if (lastEditor != null ? !lastEditor.equals(product.lastEditor) : product.lastEditor != null) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (status != product.status) return false;

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

    public Product setId(String id)
    {
        this.id = id;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public Product setName(String name)
    {
        this.name = name;
        return this;
    }

    public String getImgUrl()
    {
        return imgUrl;
    }

    public Product setImgUrl(String imgUrl)
    {
        this.imgUrl = imgUrl;
        return this;
    }

    public Status getStatus()
    {
        return status;
    }

    public Product setStatus(Status status)
    {
        this.status = status;
        return this;
    }

    public boolean isLiked()
    {
        return liked;
    }

    public Product setLiked(boolean liked)
    {
        this.liked = liked;
        return this;
    }

    public String getCategory()
    {
        return category;
    }

    public Product setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public Date getLastEdited()
    {
        return lastEdited;
    }

    public Product setLastEdited(Date lastEdited)
    {
        this.lastEdited = lastEdited;
        return this;
    }

    public User getLastEditor()
    {
        return lastEditor;
    }

    public Product setLastEditor(User lastEditor)
    {
        this.lastEditor = lastEditor;
        return this;
    }
}
