package models;

/**
 * Created by janne.gershman on 10/13/15.
 */
public class Product
{
    private String id;
    private String name;
    private String category;
    private String manufacturer;
    private Status status;
    private int voting;

    public int getVoting()
    {
        return voting;
    }

    public Product setVoting(int voting)
    {
        this.voting = voting;
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

    public String getCategory()
    {
        return category;
    }

    public Product setCategory(String category)
    {
        this.category = category;
        return this;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public Product setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
        return this;
    }
}
