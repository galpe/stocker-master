package hello.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * Created by janne.gershman on 10/14/15.
 */
public class Comment
{
    private String id;
    @JsonInclude(value= JsonInclude.Include.NON_EMPTY)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss'.000Z'")
    private Date date;
    private User author;
    private String text;


    @Override
    public String toString()
    {
        return "Comment{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", author=" + author +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;

        Comment comment = (Comment) o;

        if (!author.equals(comment.author)) return false;
        if (!date.equals(comment.date)) return false;
        if (!id.equals(comment.id)) return false;
        if (!text.equals(comment.text)) return false;

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

    public Comment setId(String id)
    {
        this.id = id;
        return this;
    }

    public Date getDate()
    {
        return date;
    }

    public Comment setDate(Date date)
    {
        this.date = date;
        return this;
    }

    public User getAuthor()
    {
        return author;
    }

    public Comment setAuthor(User author)
    {
        this.author = author;
        return this;
    }

    public String getText()
    {
        return text;
    }

    public Comment setText(String text)
    {
        this.text = text;
        return this;
    }
}
