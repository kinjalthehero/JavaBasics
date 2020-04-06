package designPattern.decorator;

// Abstract Component
//This class will act as Component
public abstract class House {

    public String description=" Unknown House ";

    public String getHouseDescription(){
        return description;
    }

    public abstract Double getPrice();
}
