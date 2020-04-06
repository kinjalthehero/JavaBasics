package Enum;

public enum Products {

    CANDY(1),
    SNACKS(3),
    NUTS(4),
    COKE(1),
    PEPSI(1),
    SODA(1);

    int price;

    Products(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
