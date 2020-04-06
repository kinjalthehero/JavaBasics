package vendingMachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendingMachineImpl implements VendingMachine {

    private Inventory<Coin> cashInventory = new Inventory<>();
    private Inventory<Item> itemInventory = new Inventory<>();
    private long revenue;
    private Item currentItem;
    private long addedMoney;

    public VendingMachineImpl(){
        initialize();
    }

    // initialize vending machine with 5 coins of each denomination and 5 cans of each Item
    private void initialize(){

        for(Coin c : Coin.values()){
            cashInventory.put(c, 5);
        }

        for(Item i : Item.values()){
            itemInventory.put(i, 5);
        }
    }

    // Get price of the item
    @Override
    public long getPrice (Item item) {

        if(itemInventory.hasItem(item)){
            currentItem = item;
            return currentItem.getPrice();
        }

        throw new SoldOutException("Sold Out, Please buy another item");
    }

    // Add money in vending machine
    @Override
    public void insertCoin (Coin coin) {
        addedMoney = addedMoney + coin.getValue();
        cashInventory.add(coin);
    }

    // Sends item and change
    @Override
    public Bucket<Item, List<Coin>> dispenseItemAndChange() {

        Item item = collectItem();
        revenue += currentItem.getPrice();

        List<Coin> change = collectChange();

        return new Bucket<>(item, change);
    }

    // Return selected item if paid in full and change is available
    private Item collectItem() throws NotSufficientChangeException, NotFullPaidException {

        if(isFullPaid()) {
            // does vending machine have change to give
            if(hasSufficientChange()) {
                itemInventory.deduct(currentItem);
                return currentItem;
            }
            throw new NotSufficientChangeException("Not Sufficient change in Inventory");
        }

        long remainingBalance = currentItem.getPrice() - addedMoney;
        throw new NotFullPaidException("Price not full paid, remaining : ", remainingBalance);
    }

    // return list of coins  to return
    private List<Coin> collectChange() {

        long changeAmount = addedMoney - currentItem.getPrice();
        List<Coin> change = getChange(changeAmount);
        deductFromCashInventory(change);
        addedMoney = 0;
        currentItem = null;
        return change;
    }

    // refund money
    @Override
    public List<Coin> refund(){
        List<Coin> refund = getChange(addedMoney);
        deductFromCashInventory(refund);
        addedMoney = 0;
        currentItem = null;
        return refund;
    }

    private boolean isFullPaid() {
        if(addedMoney >= currentItem.getPrice()){
            return true;
        }
        return false;
    }

    private List<Coin> getChange (long amount) throws NotSufficientChangeException {

        List<Coin> changes = Collections.EMPTY_LIST;

        if(amount > 0) {

            changes = new ArrayList<>();

            long balance = amount;

            while(balance > 0) {
                if (balance >= Coin.QUARTER.getValue() && cashInventory.hasItem(Coin.QUARTER)){
                    changes.add(Coin.QUARTER);
                    balance -= Coin.QUARTER.getValue();
                    continue;
                } else if(balance >= Coin.DIME.getValue() && cashInventory.hasItem(Coin.DIME)) {
                    changes.add(Coin.DIME);
                    balance = balance - Coin.DIME.getValue();
                    continue;
                } else if(balance >= Coin.NICKLE.getValue() && cashInventory.hasItem(Coin.NICKLE)) {
                    changes.add(Coin.NICKLE);
                    balance = balance - Coin.NICKLE.getValue();
                    continue;
                } else if(balance >= Coin.PENNY.getValue() && cashInventory.hasItem(Coin.PENNY)) {
                    changes.add(Coin.PENNY);
                    balance = balance - Coin.PENNY.getValue();
                    continue;
                }else {
                    throw new NotSufficientChangeException("NotSufficientChange, Please try another product");
                }
            }
        }

        return changes;
    }

    @Override
    public void reset(){
        cashInventory.clear();
        itemInventory.clear();
        revenue = 0;
        currentItem = null;
        addedMoney = 0;
    }

    private boolean hasSufficientChange(){
        return hasSufficientChangeForAmount(addedMoney - currentItem.getPrice());
    }

    private boolean hasSufficientChangeForAmount(long amount) {

        boolean hasChange = true;

        try{
            getChange(amount);
        } catch(NotSufficientChangeException nsce){
            return hasChange = false;
        }

        return hasChange;
    }

    private void deductFromCashInventory(List<Coin> change) {

        for(Coin c : change){
            cashInventory.deduct(c);
        }
    }

    public long getRevenue(){
        return revenue;
    }

    public void printStats(){
        System.out.println("Total Sales : " + revenue);
        System.out.println("Current Item Inventory : " + itemInventory);
        System.out.println("Current Cash Inventory : " + cashInventory);
    }

}