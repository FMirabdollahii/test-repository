public class TicketId {
    private Flight flight;
    private User user;
    private int ticketId ;

    public TicketId(Flight flight, User user, int ticketId) {
        this.flight = flight;
        this.user = user;
        this.ticketId = ticketId;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

}
