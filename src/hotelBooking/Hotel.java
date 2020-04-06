package hotelBooking;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private int hotelId;
    private String hotelName;
    private String city;
    private Rating rating;
    private List<Room> availableRooms;
    private List<Room> bookedRooms;

    Hotel() {
        availableRooms = new ArrayList<>();
        bookedRooms = new ArrayList<>();
    }

    public List<Room> getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(List<Room> availableRooms) {
        this.availableRooms = availableRooms;
    }

    public List<Room> getBookedRooms() {
        return bookedRooms;
    }

    public void setBookedRooms(List<Room> bookedRooms) {
        this.bookedRooms = bookedRooms;
    }

    public int getNumberOfAvailableRooms() {
        return numberOfAvailableRooms;
    }

    public void setNumberOfAvailableRooms(int numberOfAvailableRooms) {
        this.numberOfAvailableRooms = numberOfAvailableRooms;
    }

    private int numberOfAvailableRooms;

    public Rating getRating() { return rating; }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
