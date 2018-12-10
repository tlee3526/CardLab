public class CardsClass
{
    private String rank;
    private String suit;
    private int pointValue;

    public CardsClass(String rank, String suit, int pointValue)
    {
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }

    public String getrank()
    {
        return rank;
    }

    public String getSuit()
    {
        return suit;
    }

    public int pointValue()
    {
        return pointValue;
    }

    public boolean equals(CardsClass otherCard)
    {
        if (this.pointValue == otherCard.pointValue)
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return ("rank:" + rank+ "suit:" + suit + "pointValue:" + pointValue);
    }
}
