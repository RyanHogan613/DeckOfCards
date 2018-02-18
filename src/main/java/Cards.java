/**
 * The Cards class holds the suit-value pair to hold
 * the values of the cards
 */
public class Cards {

    private String suite;
    private String value;

    public Cards(String cardValue, String cardSuite) {
        this.suite = cardSuite;
        this.value = cardValue;
    }

    public void setSuite(String cardSuite) {
        this.suite = cardSuite;
    }

    public String getSuite() {
        return suite;
    }

    public void setValue(String cardValue) {
        this.value = cardValue;
    }

    public String getValue() {
        return value;
    }


    public String getCard() {
        return getSuite() + " " + getValue();
    }

}
