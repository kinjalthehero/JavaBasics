package hotelBooking;

import java.util.Date;
import java.util.List;

public interface OnlineHotelBooking {

    List<Hotel> searchHotel(City city);
    boolean bookRoom(Hotel hotel, Room room, Date date, Guest guest, Card card);
}
