package hello.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import java.util.List;

/**
 * Created by janne.gershman on 10/14/15.
 */
public class ProductsDto
{
    private int page;
    private int numPages;
    private List<Product> products;
    @JsonInclude(value= JsonInclude.Include.NON_EMPTY)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss'.000Z'")
    private Date dateStart;
    @JsonInclude(value= JsonInclude.Include.NON_EMPTY)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss'.000Z'")
    private Date dateEnd;
    @JsonInclude(value= JsonInclude.Include.NON_EMPTY)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss'.000Z'")
    private Date nextDeliveryDate;

    @Override
    public String toString()
    {
        return "ProductsDto{" +
                "page=" + page +
                ", numPages=" + numPages +
                ", products=" + products +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", nextDeliveryDate=" + nextDeliveryDate +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof ProductsDto)) return false;

        ProductsDto that = (ProductsDto) o;

        if (numPages != that.numPages) return false;
        if (page != that.page) return false;
        if (!dateEnd.equals(that.dateEnd)) return false;
        if (!dateStart.equals(that.dateStart)) return false;
        if (!nextDeliveryDate.equals(that.nextDeliveryDate)) return false;
        if (!products.equals(that.products)) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = page;
        result = 31 * result + products.hashCode();
        return result;
    }

    public int getPage()
    {
        return page;
    }

    public ProductsDto setPage(int page)
    {
        this.page = page;
        return this;
    }

    public int getNumPages()
    {
        return numPages;
    }

    public ProductsDto setNumPages(int numPages)
    {
        this.numPages = numPages;
        return this;
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public ProductsDto setProducts(List<Product> products)
    {
        this.products = products;
        return this;
    }

    public Date getDateStart()
    {
        return dateStart;
    }

    public ProductsDto setDateStart(Date dateStart)
    {
        this.dateStart = dateStart;
        return this;
    }

    public Date getDateEnd()
    {
        return dateEnd;
    }

    public ProductsDto setDateEnd(Date dateEnd)
    {
        this.dateEnd = dateEnd;
        return this;
    }

    public Date getNextDeliveryDate()
    {
        return nextDeliveryDate;
    }

    public ProductsDto setNextDeliveryDate(Date nextDeliveryDate)
    {
        this.nextDeliveryDate = nextDeliveryDate;
        return this;
    }
}
