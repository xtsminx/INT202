package TicketMachine;

public class TicketMachine {
    private double ticketPrice;
    private int numberOfTickets;
    private int numberOfCoins;
    private int customerCoins;

    public TicketMachine(int numberOfTickets) {
        this.ticketPrice = 0;
        this.numberOfTickets = numberOfTickets;
        this.numberOfCoins = 0;
        this.customerCoins = 0;
    }
    public TicketMachine(double ticketPrice) {
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = 0;
        this.numberOfCoins = 0;
        this.customerCoins = 0;
    }

    public TicketMachine(double ticketPrice, int numberOfTickets) {
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
        this.numberOfCoins = 0;
        this.customerCoins = 0;
    }

    public double getTicketPrice() {return ticketPrice;}
    public void setTicketPrice(double ticketPrice) {this.ticketPrice = ticketPrice;}
    public int getNumberOfTickets() {return numberOfTickets;}
    public int getNumberOfCoins() {return numberOfCoins;}
    public int getCustomerCoins() {return customerCoins;}

    @Override
    public String toString() {
        return String.format("TicketMachine{ticket price=%.2f, %d tickets, %d coins, customer %d coins}",
                ticketPrice, numberOfTickets, numberOfCoins, customerCoins);
    }

    // Methods
    public void receiveTicketsFromAdmin(int tickets) {
        numberOfTickets += tickets;
    }

    public int giveAllCoinsToAdmin() {
        int coinsToAdmin = numberOfCoins;
        numberOfCoins = 0;
        return coinsToAdmin;
    }

    public void receiveCoinsFromCustomer(int coins) {
        customerCoins += coins;
    }

    public int sellTicketsToCustomer(int tickets) {
        double totalCost = Math.ceil(tickets * ticketPrice);
        if (tickets > numberOfTickets) {
            return -1; // Not enough tickets
        } else if (customerCoins < totalCost) {
            return -2; // Not enough coins
        } else {
            numberOfTickets -= tickets;
            numberOfCoins += totalCost;
            int change = customerCoins - (int) totalCost;
            customerCoins = 0; // Reset customer coins after transaction
            return change; // Return the change
        }
    }

    public int returnCoinsToCustomer() {
        int coinsToReturn = customerCoins;
        customerCoins = 0;
        return coinsToReturn;
    }

    // Main method to test the class
    public static void main(String[] args) {
        TicketMachine tm = new TicketMachine(5.5, 2);
        tm.receiveTicketsFromAdmin(3);
        tm.receiveTicketsFromAdmin(4);
        System.out.println(tm);

        tm.receiveCoinsFromCustomer(25);
        tm.receiveCoinsFromCustomer(12);
        System.out.println(tm);

        System.out.println(tm.sellTicketsToCustomer(5));
        System.out.println(tm);

        System.out.println(tm.giveAllCoinsToAdmin());
        System.out.println(tm);
    }
}
