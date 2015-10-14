package hello.models;

import java.util.List;

/**
 * Created by janne.gershman on 10/14/15.
 */
public class SidebarDto
{
    private User user;
    private List<PendingProduct> pros;
    private List<PendingProduct> cons;
    private List<Comment> comments;

    @Override
    public String toString()
    {
        return "SidebarDto{" +
                "user=" + user +
                ", pros=" + pros +
                ", cons=" + cons +
                ", comments=" + comments +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof SidebarDto)) return false;

        SidebarDto that = (SidebarDto) o;

        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (cons != null ? !cons.equals(that.cons) : that.cons != null) return false;
        if (pros != null ? !pros.equals(that.pros) : that.pros != null) return false;
        if (!user.equals(that.user)) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        return user.hashCode();
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public List<PendingProduct> getPros()
    {
        return pros;
    }

    public void setPros(List<PendingProduct> pros)
    {
        this.pros = pros;
    }

    public List<PendingProduct> getCons()
    {
        return cons;
    }

    public void setCons(List<PendingProduct> cons)
    {
        this.cons = cons;
    }

    public List<Comment> getComments()
    {
        return comments;
    }

    public void setComments(List<Comment> comments)
    {
        this.comments = comments;
    }
}
