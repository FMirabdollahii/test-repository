import java.util.ArrayList;
import java.util.Scanner;

public class Flights {

    private ArrayList<Flight> flightsArrayList;

    public Flights(ArrayList<Flight> flightsArrayList) {
       this.flightsArrayList = flightsArrayList;
    }

    private void addPrivate() {
        Flight flight1 = new Flight("ww-12", "Yazd", "Mashhad", "1402-2-1", "12:30", 700_000, 123);
        flightsArrayList.add(flight1);
        Flight flight2 = new Flight("ww-12", "Yazd", "Qom", "1402-2-1", "12:30", 700_000, 123);
        flightsArrayList.add(flight2);
        Flight flight3 = new Flight("ww-13", "Yazd", "Tehran", "1402-2-1", "12:30", 700_000, 123);
        flightsArrayList.add(flight3);
        Flight flight4 = new Flight("ww-14", "Yazd", "Ahvaz", "1402-2-1", "12:30", 700_000, 123);
        flightsArrayList.add(flight4);
        Flight flight5 = new Flight("ww-15", "Yazd", "Tabriz", "1402-2-1", "12:30", 700_000, 123);
        flightsArrayList.add(flight5);
        Flight flight6 = new Flight("ww-16", "Mashhad", "Yazd", "1402-2-1", "10:30", 700_000, 123);
        flightsArrayList.add(flight6);
        Flight flight7 = new Flight("ww-17", "Qom", "Yazd", "1402-2-1", "11:30", 700_000, 123);
        flightsArrayList.add(flight7);
        Flight flight8 = new Flight("ww-18", "Tehran", "Yazd", "1402-2-1", "10:30", 700_000, 123);
        flightsArrayList.add(flight8);
        Flight flight9 = new Flight("ww-19", "Ahvaz", "Yazd", "1402-2-1", "09:30", 700_000, 123);
        flightsArrayList.add(flight9);
        Flight flight10 = new Flight("ww-20", "Tabriz", "Yazd", "1402-2-1", "09:30", 700_000, 123);
        flightsArrayList.add(flight10);
    }

    public void add() {
        Flight flight = new Flight("ww-21", "Yazd", "Shiraz", "1402-2-13", "12:30", 500 - 000, 300);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter FlightId : ");
        System.out.printf(">> ");
        String flightId = scanner.nextLine();
        flight.setFlightId(flightId);

        System.out.println("Please enter Origin : ");
        System.out.printf(">> ");
        String origin = scanner.nextLine();
        flight.setOrigin(origin);

        System.out.println("Please enter Destination : ");
        System.out.printf(">> ");
        String destination = scanner.nextLine();
        flight.setDestination(destination);

        System.out.println("Please enter Date : ");
        System.out.printf(">> ");
        String Date = scanner.nextLine();
        flight.setDate(Date);

        System.out.println("Please enter Time : ");
        System.out.printf(">> ");
        String time = scanner.nextLine();
        flight.setTime(time);

        System.out.println("Please enter Price : ");
        System.out.printf(">> ");
        long price = scanner.nextLong();
        scanner.nextLine();
        flight.setPrice(price);

        System.out.println("Please enter Seats : ");
        System.out.printf(">> ");
        int seats = scanner.nextInt();
        scanner.nextLine();
        flight.setSeats(seats);

        flightsArrayList.add(flight);
    }
    public void update() {

        Flight flightUpdate = new Flight();
        flightUpdate = findFlightId();

        int updatenumber = 1;
        while (!(updatenumber == 8)){

            printUpdateMenu (flightUpdate);

            Scanner scanner = new Scanner(System.in);
            updatenumber = scanner.nextInt();

            switch (updatenumber){
                case 1:
                    System.out.println("Please enter FlightId : ");
                    System.out.printf(">> ");
                    String flightId = scanner.nextLine();
                    flightUpdate.setFlightId(flightId);
                    break;

                case 2 :
                    System.out.println("Please enter Origin : ");
                    System.out.printf(">> ");
                    String origin = scanner.nextLine();
                    flightUpdate.setOrigin(origin);
                    break;

                case 3 :
                    System.out.println("Please enter Destination : ");
                    System.out.printf(">> ");
                    String destination = scanner.nextLine();
                    flightUpdate.setDestination(destination);
                    break;

                case 4 :
                    System.out.println("Please enter Date : ");
                    System.out.printf(">> ");
                    String Date = scanner.nextLine();
                    flightUpdate.setDate(Date);
                    break;
                case 5 :
                    System.out.println("Please enter Time : ");
                    System.out.printf(">> ");
                    String time = scanner.nextLine();
                    flightUpdate.setTime(time);
                    break;

                case 6 :
                    System.out.println("Please enter Price : ");
                    System.out.printf(">> ");
                    long price = scanner.nextLong();
                    scanner.nextLine();
                    flightUpdate.setPrice(price);
                    break;

                case 7 :
                    System.out.println("Please enter Seats : ");
                    System.out.printf(">> ");
                    int seats = scanner.nextInt();
                    scanner.nextLine();
                    flightUpdate.setSeats(seats);
                    break;

                case 8 :
                    break;

                default:
                    System.out.println("Please carefull!");
            }
            }
    }
    public void remove() {
        Flight flightRemove = new Flight();
        flightRemove = findFlightId();

        if (flightRemove.isBooking() == false) {
            flightsArrayList.remove(flightRemove);
        } else {
            System.err.println("You can't remove this flight because this was booking!");
        }
    }
    public void flightSchedules (){
        System.out.printf("FLIGHT_ID   | ORIGIN   | DESTINATION  | DATE  | TIME   | PRICE   | SEATES   ");
        for (int i = 0; i < flightsArrayList.size(); i++) {
            System.out.println("----------------------------------------------------------------------------");
            System.out.printf("%8s | %8s | %8s | %8s | %8s | %8l |%8d %n"+flightsArrayList.get(i));
        }
    }

    private Flight findFlightId() {
        System.out.println("Please enter FlightId ");
        System.out.printf(">> ");
        Scanner sccaner = new Scanner(System.in);
        String flightId = sccaner.nextLine();
        for (int i = 0; i < flightsArrayList.size(); i++) {
             if (flightsArrayList.get(i).getFlightId() == flightId){
                 return flightsArrayList.get(i);
             }
        }
        return  null;
    }
    private void printUpdateMenu (Flight flightUpdate)
    {
        System.out.println("Which one do you want to update ?  ");
        if (flightUpdate.isBooking() == true){
            System.out.println(" 6 < Price > ");
            System.out.println(" 7 < Seats > ");
            System.out.println(" 8 < sing out > ");
        } else {
            System.out.println(" 1 < FlightId >");
            System.out.println(" 2 < Origin > ");
            System.out.println(" 3 < Destination > ");
            System.out.println(" 4 < Date >");
            System.out.println(" 5 < Time >");
            System.out.println(" 6 <Price >");
            System.out.println(" 7 < Seats >");
            System.out.println(" 8 < sing out > ");
        }
    }
}

