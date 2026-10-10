package eventpass;

public class Event {

    private int eventId;
    private String name;
    private String date;
    private String venue;
    private double price;
    private int totalsit;
    private int avasit;

    public Event(int eventId , String name , String date , String venue,
        double price , int totalsit
    )
    {
        this.eventId=eventId;
        this.name=name;
        this.date=date;
        this.venue = venue;
        this.price=price;
        this.totalsit=totalsit;
        this.avasit=totalsit;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalsit() {
        return totalsit;
    }

    public void setTotalsit(int totalsit) {
        this.totalsit = totalsit;
    }

    public int getAvasit() {
        return avasit;
    }

    public void setAvasit(int avasit) {
        this.avasit = avasit;
    }

    public void display()
    {
        System.out.println("Event ID       : " + eventId);
        System.out.println("Event Name     : " + name);
        System.out.println("Date           : " + date);
        System.out.println("Venue          : " + venue);
        System.out.println("Price          : " + price);
        System.out.println("Total Seats    : " + totalsit);
        System.out.println("Available Seats: " + avasit);
        System.out.println("-----------------------------");
    }

}
