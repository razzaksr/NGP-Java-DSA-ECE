package collections;


public class CreditCard implements Comparable<CreditCard>{
    private String cardHolder;
    private Integer limit;
    private Long cardNumber;
    // this >> current object, o >> next object
    @Override
    public int compareTo(CreditCard o) {
        // return this.cardNumber.compareTo(o.cardNumber);
        return o.cardHolder.compareTo(this.cardHolder);
    }
    // generate setters, getter, def cons, parm cons, toString
    @Override
    public String toString() {
        return "CreditCard [cardHolder=" + cardHolder + ", limit=" + limit + ", cardNumber=" + cardNumber + "]";
    }
    public CreditCard(String cardHolder, Integer limit, Long cardNumber) {
        this.cardHolder = cardHolder;
        this.limit = limit;
        this.cardNumber = cardNumber;
    }
    public CreditCard() {
    }
    public String getCardHolder() {
        return cardHolder;
    }
    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }
    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    public Long getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }
}
