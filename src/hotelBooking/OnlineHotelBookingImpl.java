package hotelBooking;

import java.util.Date;
import java.util.List;

public class OnlineHotelBookingImpl implements OnlineHotelBooking {

    @Override
    public List<Hotel> searchHotel(City city) {

        List<Hotel> availableHospitals = getAvailableHospitals();
        return availableHospitals;
    }

    private List<Hotel> getAvailableHospitals() {
        // return list of available hospitals
        return null;
    }

    @Override
    public boolean bookRoom(Hotel hotel, Room room, Date date, Guest guest, Card card) {

        // HotelNotAvailableException
        boolean isAvailable = checkAvailability(hotel);

        // InvalidCardException
        boolean cardValidity = verifyCardDetails(card);

        //

        return false;
    }

    private boolean verifyCardDetails(Card card) {
        // verify card details
        return true;
    }

    private boolean checkAvailability(Hotel hotel) throws HotelNotAvailableException{
        // verify availability of hotel
        return true;
    }
}
