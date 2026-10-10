package eventpass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Event>events = new ArrayList<>();
        ArrayList<User>users = new ArrayList<>();
        ArrayList<Booking>bookings = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) 
        {
            System.out.println();
            System.out.println("===== EventPass =====");
            System.out.println("1. Register User");
            System.out.println("2. View Users");
            System.out.println("3. Add Event");
            System.out.println("4. View Events");
            System.out.println("5. Search Event");
            System.out.println("6. Delete Event");
            System.out.println("7. Update Event");
            System.out.println("8. Book Ticket");
            System.out.println("9. View Booking");
            System.out.println("10. Exit");

            System.out.println();
            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            
            if(choice==1)
            {
                System.out.print("Name : ");
                String name=sc.nextLine();

                System.out.print("Email: ");
                String email=sc.nextLine();

                boolean found = false;

                for(User us : users)
                {
                    if(us.getEmail().equals(email))
                    {
                        found=true;
                        break;
                    }
                }
                if(found)
                {
                    System.out.println("Email already registered!");
                }
                else
                {
                    int id = users.size()+1;
                    User u1 = new User(id, name, email);
                    users.add(u1);

                    System.out.println("User Registered Successfully!");
                    System.out.println();
                    u1.display();
                }
            }
            else if (choice==2) 
            {
                if(users.size()==0)    
                {
                    System.out.println("No anyone registered...");
                }
                else
                {
                    for(User u : users)
                    {
                        u.display();
                    }
                }
            }
            else if (choice==3) 
            {
                System.out.print("Event Name : ");
                String ename = sc.nextLine();

                System.out.print("Date : ");
                String date = sc.nextLine();

                System.out.print("Venue : ");
                String venue = sc.nextLine();

                System.out.print("Price : ");
                double price = sc.nextDouble();

                System.out.print("Total Seats : ");
                int total = sc.nextInt();
                sc.nextLine();

                int id = 100+events.size()+1;

                Event e1 = new Event(id, ename, date, venue, price, total);
                events.add(e1);
                System.out.println();
                System.out.println("Event Add Successfully!");
                System.out.println();

                e1.display();

                
                
            }
            else if (choice==4) 
            {
            
                if(events.size()==0)
                {
                    System.out.println("No events available...");
                }
                else
                {
                    for(Event e : events)
                    {
                        e.display();
                    }
                }
            }
            else if(choice==5)
            {
            
                if(events.size() == 0)
                {
                    System.out.println("Currently no events available...");
                }
                else
                {
                    System.out.print("Enter Event ID : ");
                    int searchId = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;

                    for(Event e : events)
                    {
                        if(e.getEventId() == searchId)
                        {
                            e.display();
                            found = true;
                            break;
                        }
                    }

                    if(found == false)
                    {
                        System.out.println("Event not found...");
                    }
                }
            }
            else if(choice==6)
            {
                if(events.size()==0)
                {
                    System.out.println("No Events Available...");
                }
                else
                {
                    
                System.out.print("Enter Event ID :");
                int deleteId = sc.nextInt();
                sc.nextLine();

                Event removeEvent = null;

                for(Event e : events)
                {
                    if(e.getEventId()==deleteId)
                    {
                        removeEvent=e;
                        break;
                    }
                }
                if(removeEvent==null)
                {
                    System.out.println("Event Not Found...");
                }
                else
                {
                    events.remove(removeEvent);
                    System.out.println("Event deleted successfully!");
                }
                }

            }
            else if(choice==7)
            {
                if(events.size()==0)
                {
                    System.out.println("No Events Available...");
                }
                else
                {
                    System.out.print("Event ID : ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    Event updaEvent = null;

                    for(Event e : events)
                    {
                        if(e.getEventId()==updateId)
                        {
                            updaEvent=e;
                            break;
                        }
                    }
                    if(updaEvent==null)
                    {
                        System.out.println("Event Not Found...");
                    }
                    else
                    {
                        System.out.print("Enter New Event Name : ");
                        String name = sc.nextLine();

                        System.out.print("Enter New Date : ");
                        String date = sc.nextLine();

                        System.out.print("Enter New Venue : ");
                        String venue = sc.nextLine();

                        System.out.print("Enter New Price : ");
                        double price = sc.nextDouble();

                        sc.nextLine();

                        updaEvent.setName(name);
                        updaEvent.setDate(date);
                        updaEvent.setVenue(venue);
                        updaEvent.setPrice(price);

                        System.out.println("Event Updated Successfully!");
                        System.out.println();

                        updaEvent.display();
                    }
                }

            }
            else if(choice==8)
            {
                if(users.size()==0)
                {
                    System.out.println("No User Registered...");
                }
                else if(events.size()==0)
                {
                    System.out.println("No Events Available...");
                }
                else
                {
                    System.out.print("Enter UserId : ");
                    int userId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter EventId : ");
                    int eventId = sc.nextInt();
                    sc.nextLine();

                    User bookuser = null;

                    for(User u : users)
                    {
                        if(u.getId()==userId)
                        {
                            bookuser = u;
                            break;
                        }
                    }
                    if(bookuser==null)
                    {
                        System.out.println("User Not Found...");
                    }
                    else
                    {
                        Event bookEvent = null;

                        for(Event e : events)
                        {
                            bookEvent =e;
                            break;
                        }
                        if(bookEvent==null)
                        {
                            System.out.println("Event Not Found...");
                        }
                        else
                        {
                            System.out.println("User and Event Found!");
                            bookEvent.display();
                            bookuser.display();

                            System.out.print("Enter Number of Tickets : ");
                            int tickets=sc.nextInt();
                            sc.nextLine();

                            if(tickets<=0)
                            {
                                System.out.println("Invalid number of tickets...");
                            }
                            else if(tickets> bookEvent.getAvasit())
                            {
                                System.out.println("Not enough seats available...");
                            }
                            else
                            {
                                System.out.println("Tickets available...");

                                double totalprice = bookEvent.getPrice()*tickets;
                                int avasit = bookEvent.getAvasit()-tickets;
                                bookEvent.setAvasit(avasit);

                                int bookingID = 5000+bookings.size()+1;

                                Booking b1 = new Booking(bookingID, userId, eventId, tickets, totalprice);

                                bookings.add(b1);
                                System.out.println("Ticket Booketd....");
                                System.out.println();

                                b1.display();
                                System.out.println("Remaining Seats : " + bookEvent.getAvasit());
                                
                            }
                        }

                    }
                }
            }
            else if(choice==9)
            {
                if(bookings.size()==0)
                {
                    System.out.println("No Booking...");
                }
                else
                {
                    for(Booking b : bookings)
                    {
                        b.display();
                    }
                }
            }
            else if(choice==10)
            {
                System.out.println("Thank you for using EventPass!");
                break;
            }
            else
            {
                System.out.println("Invalid Choice...");
            }
            
        }



    }
}
