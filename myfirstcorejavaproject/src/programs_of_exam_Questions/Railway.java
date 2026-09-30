package programs_of_exam_Questions;

public class Railway {

    String passengerName;
    int age;
    String source;
    String destination;

    // Default constructor
    Railway() {
    }

    // Constructor chaining using this()
    Railway(String passengerName) {
        this();
        this.passengerName = passengerName;
    }

    Railway(String passengerName, int age) {
        this(passengerName);
        this.age = age;
    }

    Railway(String passengerName, int age, String source) {
        this(passengerName, age);
        this.source = source;
    }

    Railway(String passengerName, int age, String source, String destination) {
        this(passengerName, age, source);
        this.destination = destination;
    }

    public static void main(String[] args) {

        // Creating child class object
        Ticket t = new Ticket("Swaroop",23,"LB Nagar","JNTU",10);

        t.bookTicket();
        t.displayBookingDetails();
    }
}


// Child class
class Ticket extends Railway {

    int numberOfTickets;
    int price = 500;
    int ticketAmount;

    // Default constructor
    Ticket() {
        super();
    }

    // Constructor using super()
    Ticket(String passengerName, int age, String source,
           String destination, int numberOfTickets) {

        super(passengerName, age, source, destination);

        this.numberOfTickets = numberOfTickets;
    }

    // Calculate ticket amount
    void bookTicket() {

        ticketAmount = numberOfTickets * price;

        System.out.println("Ticket booked successfully!");
        System.out.println("Total Ticket Amount : " + ticketAmount);
    }

    // Display all booking details
    void displayBookingDetails() {

        System.out.println();
        System.out.println("----- Railway Ticket Booking Details -----");

        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Age : " + age);
        System.out.println("Source : " + source);
        System.out.println("Destination : " + destination);

        System.out.println("Number of Tickets : " + numberOfTickets);
        System.out.println("Price per Ticket : " + price);
        System.out.println("Total Ticket Amount : " + ticketAmount);
    }
}
