package models;

/**
 * Created by janne.gershman on 10/13/15.
 */
public class User
{
    private String id;
    private String firstName;
    private String lastName;
    private String avatar;

    public String getId()
    {
        return id;
    }

    public User setId(String id)
    {
        this.id = id;
        return this;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public User setFirstName(String firstName)
    {
        this.firstName = firstName;
        return this;
    }

    public String getLastName()
    {
        return lastName;
    }

    public User setLastName(String lastName)
    {
        this.lastName = lastName;
        return this;
    }

    public String getAvatar()
    {
        return avatar;
    }

    public User setAvatar(String avatar)
    {
        this.avatar = avatar;
        return this;
    }
}
