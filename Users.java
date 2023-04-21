import java.util.ArrayList;
import java.util.Scanner;

public class Users {
    private ArrayList<User> usersArrayList = new ArrayList<>();
    private ArrayList<Flight> flightArrayList;
    private Ticket ticket;
    private static int  ticketId = 0 ;
    private Scanner scanner = new Scanner(System.in);
    private static Users instance;
    private Users () {}
    public static Users getInstance() {
        if (instance== null){
            instance = new Users();
        }
        return instance;
    }

    public Users(ArrayList<Flight> flightArrayList) {
        this.flightArrayList = flightArrayList;

    }

    public  void add (){
        User user = new User();
        System.out.println("Please enter arbitrary username");
        System.out.printf(">>");
        user.setUsername(scanner.nextLine());

        changePassword (user);

        System.out.println("Would you pay charge or [Y or N]");
         String payCharge = scanner.nextLine();
        if (payCharge == "Y" || payCharge == "y"){
            charge ( user);
        }
        usersArrayList.add(user);
    }
    public User findUser (String username){
        for (int i = 0; i < usersArrayList.size() ; i++) {
            if (usersArrayList.get(i).getUsername() == username){
                return usersArrayList.get(i);
            }
        }
        return null;
    }
    public void charge (User user) {
        System.out.println("Please pay your charge");
        System.out.printf(">>");
        user.setCharge(scanner.nextInt());
    }
    public void changePassword (User user){
        System.out.println("Please enter arbitrary password");
        System.out.printf(">>");
        user.setPassword(scanner.nextLine());
    }
    public void bookingTicket (User user){
        System.out.println("Please enter arbitrary Flight");
        System.out.printf(">>");
        String flightId = scanner.nextLine();
        var flightCopy = new Flight();
        for (int i = 0; i < flightArrayList.size(); i++) {
            if(flightArrayList.get(i).getFlightId() == flightId)
                flightCopy = flightArrayList.get(i);
            else {flightCopy = null;}
        }
        flightCopy.setBooking (true) ;
        ticketId++;
        var objectTicketId= new TicketId(flightCopy,user,ticketId);
        ticket.addTicket(objectTicketId);
    }
    public void flightSearch (User user) {
         ArrayList <Flight> flightArrayListCopy = new ArrayList<>();
        for (int i = 0; i < flightArrayList.size(); i++)
            flightArrayListCopy.add(flightArrayList.get(i));

        int findFlightNumber = 1;
        while(!(findFlightNumber == 8)){
            printSearchFlight ();
            switch (findFlightNumber) {
                case 1 :
                System.out.println("Please enter FlightId : ");
                System.out.printf(">> ");
                String flightId = scanner.nextLine();
                    for (int i = 0; i <flightArrayListCopy .size(); i++) {
                        if (!(flightArrayListCopy.get(i).getFlightId() == flightId))
                            flightArrayListCopy.remove(i);
                    }
                    printResultSearch(flightArrayListCopy);
                break;
                case 2 :
                System.out.println("Please enter Origin : ");
                System.out.printf(">> ");
                String origin = scanner.nextLine();
                    for (int i = 0; i <flightArrayListCopy .size(); i++) {
                        if (!(flightArrayListCopy.get(i).getOrigin() == origin))
                            flightArrayListCopy.remove(i);
                    }
                    printResultSearch(flightArrayListCopy);
                break;
                case 3 :
                System.out.println("Please enter Destination : ");
                System.out.printf(">> ");
                String destination = scanner.nextLine();
                    for (int i = 0; i <flightArrayListCopy .size(); i++) {
                        if (!(flightArrayListCopy.get(i).getDestination() == destination))
                            flightArrayListCopy.remove(i);
                    }
                    printResultSearch(flightArrayListCopy);
                break;
                case 4 :
                System.out.println("Please enter Date : ");
                System.out.printf(">> ");
                String date = scanner.nextLine();
                    for (int i = 0; i <flightArrayListCopy .size(); i++) {
                        if (!(flightArrayListCopy.get(i).getDate()== date))
                            flightArrayListCopy.remove(i);
                    }
                    printResultSearch(flightArrayListCopy);
                break;
                case 5 :
                System.out.println("Please enter Time : ");
                System.out.printf(">> ");
                String time = scanner.nextLine();
                    for (int i = 0; i <flightArrayListCopy .size(); i++) {
                        if (!(flightArrayListCopy.get(i).getTime() == time))
                            flightArrayListCopy.remove(i);
                    }
                    printResultSearch(flightArrayListCopy);
                break;
                case 6:
                System.out.println("Please enter Price : ");
                System.out.printf(">> ");
                long price = scanner.nextLong();
                scanner.nextLine();
                    for (int i = 0; i <flightArrayListCopy .size(); i++) {
                        if (!(flightArrayListCopy.get(i).getPrice()== price ))
                            flightArrayListCopy.remove(i);
                    }
                    printResultSearch(flightArrayListCopy);
                break;
                case 7 :
                System.out.println("Please enter Seats : ");
                System.out.printf(">> ");
                int seats = scanner.nextInt();
                scanner.nextLine();
                    for (int i = 0; i <flightArrayListCopy .size(); i++) {
                        if (!(flightArrayListCopy.get(i).getSeats() == seats))
                            flightArrayListCopy.remove(i);
                    }
                    printResultSearch(flightArrayListCopy);
                break;
                case 8 :
                    break;
                default:
                    System.err.println("Please enter cerrect number!");
            }
        }



    }
    public void bookedTicket (User user){

    }

    private void printSearchFlight (){
        System.out.println("WHICH ONE DO YOU WANT SEARCH ?");
        System.out.println(" 1 < FlightId >");
        System.out.println(" 2 < Origin > ");
        System.out.println(" 3 < Destination > ");
        System.out.println(" 4 < Date >");
        System.out.println(" 5 < Time >");
        System.out.println(" 6 <Price >");
        System.out.println(" 7 < Seats >");
        System.out.println("IF YOU WANT SINGH OUT PLEASE ENTER NUMBER <8>");
    }
    private void printResultSearch (ArrayList<Flight> flightArrayList){
        System.out.printf("FLIGHT_ID   :ORIGIN   :DESTINATION  :DATE  :TIME   :PRICE   :SEATES   ");
        for (int i = 0; i < flightArrayList.size(); i++) {
            System.out.println("----------------------------------------------------------------------------");
            System.out.printf("%3d:%3d:%3d:%3d:%3d:%3s:%s%b"+flightArrayList.get(i));
        }
    }
}
