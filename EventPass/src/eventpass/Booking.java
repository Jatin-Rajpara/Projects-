package eventpass;

public class Booking {

    private int bookid;
    private int userid;
    private int eventid;
    private int tickets;
    private double total;

    public Booking(int bookid , int userid , int eventid , int tickets , double total)
    {
        
        this.bookid=bookid;
        this.userid=userid;
        this.eventid=eventid;
        this.tickets=tickets;
        this.total=total;

    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void display()
    {
        System.out.println("Booking ID : " + bookid);
        System.out.println("User ID    : " + userid);
        System.out.println("Event ID   : " + eventid);
        System.out.println("Tickets    : " + tickets);
        System.out.println("Total Price: " + total);
        System.out.println("-----------------------------");
    }

}
