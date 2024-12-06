//WIlliam Alvey

public class Concert {
    // attributes
    private String bandName;
    private int capacity;
    private int numTicketsSoldByPhone;
    private int numTicketsSoldAtVenue;
    private double priceByPhone;
    private double priceAtVenue;

   
    public Concert() {
        this.bandName = "No name yet";
        this.capacity = 0;
        this.numTicketsSoldByPhone = 0;
        this.numTicketsSoldAtVenue = 0;
        this.priceByPhone = 0.0;
        this.priceAtVenue = 0.0;
    }

    // band name, capacity, price by phone, and price at venue
    public Concert(String bandName, int capacity, double priceByPhone, double priceAtVenue) {
        this.bandName = bandName;
        this.capacity = capacity;
        this.numTicketsSoldByPhone = 0;
        this.numTicketsSoldAtVenue = 0;
        this.priceByPhone = priceByPhone;
        this.priceAtVenue = priceAtVenue;
    }

    //all attributes
    public Concert(String bandName, int capacity, int numTicketsSoldByPhone, int numTicketsSoldAtVenue, double priceByPhone, double priceAtVenue) {
        this.bandName = bandName;
        this.capacity = capacity;
        this.numTicketsSoldByPhone = numTicketsSoldByPhone;
        this.numTicketsSoldAtVenue = numTicketsSoldAtVenue;
        this.priceByPhone = priceByPhone;
        this.priceAtVenue = priceAtVenue;
    }

    // Accessors and mutators
    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
        }
    }

    public int getNumTicketsSoldByPhone() {
        return numTicketsSoldByPhone;
    }

    public void setNumTicketsSoldByPhone(int numTicketsSoldByPhone) {
        if (numTicketsSoldByPhone >= 0) {
            this.numTicketsSoldByPhone = numTicketsSoldByPhone;
        }
    }

    public int getNumTicketsSoldAtVenue() {
        return numTicketsSoldAtVenue;
    }

    public void setNumTicketsSoldAtVenue(int numTicketsSoldAtVenue) {
        if (numTicketsSoldAtVenue >= 0) {
            this.numTicketsSoldAtVenue = numTicketsSoldAtVenue;
        }
    }

    public double getPriceByPhone() {
        return priceByPhone;
    }

    public void setPriceByPhone(double priceByPhone) {
        if (priceByPhone >= 0) {
            this.priceByPhone = priceByPhone;
        }
    }

    public double getPriceAtVenue() {
        return priceAtVenue;
    }

    public void setPriceAtVenue(double priceAtVenue) {
        if (priceAtVenue >= 0) {
            this.priceAtVenue = priceAtVenue;
        }
    }

    // methods
    public int totalNumberOfTicketsSold() {
        return numTicketsSoldByPhone + numTicketsSoldAtVenue;
    }

    public int ticketsRemaining() {
        return capacity - totalNumberOfTicketsSold();
    }

    public void buyTicketsAtVenue(int numTickets) {
        if (numTickets >= 0 && totalNumberOfTicketsSold() + numTickets <= capacity) {
            this.numTicketsSoldAtVenue += numTickets;
        } else {
            System.out.println("The concert is sold out!");
        }
    }

    public void buyTicketsByPhone(int numTickets) {
        if (numTickets >= 0 && totalNumberOfTicketsSold() + numTickets <= capacity) {
            this.numTicketsSoldByPhone += numTickets;
        } else {
            System.out.println("The concert is sold out!");
        }
    }

    public double totalSales() {
        return (numTicketsSoldByPhone * priceByPhone) + (numTicketsSoldAtVenue * priceAtVenue);
    }
}
