package Enum;

public enum Coins {

    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);

    int val;

    Coins(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}

