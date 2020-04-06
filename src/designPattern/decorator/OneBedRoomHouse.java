package designPattern.decorator;

// Concrete Component
public class OneBedRoomHouse extends House {

    public OneBedRoomHouse() {
        description="1 BHK";
    }

    @Override
    public Double getPrice() {
        return 300000.00;
    }

}
