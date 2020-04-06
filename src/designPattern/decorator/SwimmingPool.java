package designPattern.decorator;

// concrete Decorator
public class SwimmingPool extends HouseDecorator {

    public House house;

    public SwimmingPool(House house) {
        this.house = house;
    }

    @Override
    public String getHouseDescription() {
        return house.getHouseDescription() + " and with swimmming pool";
    }

    @Override
    public Double getPrice() {
        Double modifiedPrice = house.getPrice() + house.getPrice() * .25;
        return modifiedPrice;
    }
}
