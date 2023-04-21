import java.util.Scanner;

public class Admin<flights> {
    private Flights flights ;

    public Admin(Flights flights) {
    }

    private void adminMenu (){
        System.out.println("   Admin Menu   ");
        System.out.println(" 1  <  Add > ");
        System.out.println(" 2  <  Update >");
        System.out.println(" 3  < Remove > ");
        System.out.println(" 4  < Flight Schedules >");
        System.out.println(" 5  < Sing Out >");
    }
    public void main (Flights flights){
        int adminNumber=1;
        while (!(adminNumber==5))
        adminMenu();
        Scanner scanner1 = new Scanner(System.in);
        adminNumber = scanner1.nextInt();
        scanner1.nextLine();
        switch (adminNumber) {
            case 1 :
                flights.add();
                break;
            case 2 :
                flights.update();
                break;
            case 3 :
                flights.remove();
                break;
            case 4 :
                flights.flightSchedules();
            case 5 :
                break;
            default:
                System.err.println("Please careful!");
        }
    }
}
