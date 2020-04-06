package designPattern.decorator;

// Concrete Decorator class:
public class CarSpace extends HouseDecorator {

    public House house;

    public CarSpace(House house) {
        this.house=house;
    }

    @Override
    public String getHouseDescription() {
        return house.getHouseDescription()+" with one car space";
    }

    @Override
    public Double getPrice() {
        Double modifiedPrice = house.getPrice() + house.getPrice() * .10;
        return modifiedPrice;
    }

}

