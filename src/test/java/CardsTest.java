import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CardsTest {
    Cards card;

    @Before
    public void runBefore(){
        card = new Cards("Diamonds", "Ace");
    }

    @Test
    public void getSuitReturnsSuitName(){
        String expected = "Diamonds";
        String actual = card.getSuit();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getRankReturnsRankName(){
        String expected = "Ace";
        String actual = card.getRank();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getValueReturnsValueName(){
        int expected = 14;
        int actual = card.getValue();
        Assert.assertEquals(expected, actual);
    }

}
