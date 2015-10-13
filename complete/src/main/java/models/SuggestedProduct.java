package models;

/**
 * Created by janne.gershman on 10/13/15.
 */
public class SuggestedProduct
{
    private Product product;
    private int voting;

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof SuggestedProduct)) return false;

        SuggestedProduct that = (SuggestedProduct) o;

        if (voting != that.voting) return false;
        if (!product.equals(that.product)) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        return product.hashCode();
    }

    public Product getProduct()
    {
        return product;
    }

    public SuggestedProduct setProduct(Product product)
    {
        this.product = product;
        return this;
    }

    public int getVoting()
    {
        return voting;
    }

    public SuggestedProduct setVoting(int voting)
    {
        this.voting = voting;
        return this;
    }
}
