package inheritance.webshop;

/**
 * The Ticket class represents a concert or sports event ticket in a webshop.
 * Like the Vehicle class, the Ticket class should inherit the Product class.
 *
 * In real life a ticket would likely have additional properties, such as the
 * event date and time (LocalDateTime). In this exercise, you can decide
 * yourself which properties you want to add. You can also decide yourself how
 * the toString() method should look like.
 *
 * This class will not be autograded, so it is up to you to test it. You can
 * also skip this class and continue with the next part of the exercise if you
 * feel that you have understood the concept of inheritance.
 */
public class Ticket extends Product {

    private String artist;
    private String date;
    private String location;

    public Ticket(String title, String description, double price, String artist, String date, String location) {
        super(title, location, price);
        this.artist = artist;
        this.date = date;
        this.location = location;
    }
    public String getArtist() {
        return artist;
    }
    public String getDate() {
        return date;
    }
    public String getLocation() {
        return location;
    }

    public String toString() {
        return "Ticket to " + getTitle() + ", description " + getDescription() + ", price " + getPrice() + ", artist " + artist + ", date " + date + " and place " + location + ".";
    }


}
