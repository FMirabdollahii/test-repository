import java.util.ArrayList;

public class Ticket {
    private ArrayList<TicketId> ticketIds;
    private static Ticket instance;
    private Ticket () {}
    public static Ticket getInstance(){
        if (instance ==null){
            instance = new Ticket();
        }
        return instance;
    }
    public void addTicket (TicketId ticketId) {
         ArrayList<TicketId> ticketIds = new ArrayList<>();
         ticketIds.add(ticketId);
    }
    public void findTicket (User user) {
        System.out.println("Flight                               | Username    | Ticketid ");
        for (int i = 0; i < ticketIds.size(); i++) {
            if (ticketIds.get(i).getUser() == user)
                System.out.printf("%8s | %8s | %8s | %8s | %8s | %8l |%8d |  %8s |  %8d %n"
                        ,ticketIds.get(i).getFlight()
                        ,ticketIds.get(i).getUser().getUsername()
                        ,ticketIds.get(i).getTicketId());
        }
    }
}
