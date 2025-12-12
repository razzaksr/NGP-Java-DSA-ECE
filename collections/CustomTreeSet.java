package collections;

import java.util.Set;
import java.util.TreeSet;

public class CustomTreeSet {
    public static void main(String[] args) {
        Set<CreditCard> icici = new TreeSet<>();
        CreditCard card1 = new CreditCard(
            "Nishant", 90000, 7654567654563L);
        CreditCard card2 = new CreditCard(
            "Vinayak", 20000, 9876787678767L);
        CreditCard card3 = new CreditCard(
            "Richard", 150000, 8765656565553L);
        icici.add(card1);icici.add(card2);icici.add(card3);
        System.out.println(icici);
    }
}
