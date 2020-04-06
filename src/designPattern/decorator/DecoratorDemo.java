package designPattern.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {

        House oneBHKhouse = new OneBedRoomHouse();
        Double price = oneBHKhouse.getPrice();
        System.out.println(oneBHKhouse.getHouseDescription()+", Price: "+ price);

        House decoratedHouse1 = new CarSpace(new OneBedRoomHouse());
        price = decoratedHouse1.getPrice();
        System.out.println(decoratedHouse1.getHouseDescription()+", Price :"+ price);

        House decoratedHouse2 = new SwimmingPool(new CarSpace(new OneBedRoomHouse()));
        price = decoratedHouse2.getPrice();
        System.out.println(decoratedHouse2.getHouseDescription()+", Price :"+ price);
    }
}



