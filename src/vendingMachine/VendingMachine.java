package vendingMachine;

import java.util.List;

// Declare public API for Vending Machine
public interface VendingMachine {
    long getPrice(Item item);
    void insertCoin(Coin coin);
    List<Coin> refund();
    Bucket<Item, List<Coin>> dispenseItemAndChange();
    void reset();
}