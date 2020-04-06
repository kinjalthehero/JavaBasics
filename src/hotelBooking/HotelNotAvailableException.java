package hotelBooking;

public class HotelNotAvailableException extends RuntimeException {

    String message;

    HotelNotAvailableException (String msg) {
        message = msg;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
