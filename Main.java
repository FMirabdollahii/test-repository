import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public  static void main(String[] args) {
        ArrayList <Flight> flightsArray = new ArrayList<>();
        Flights flights = new Flights(flightsArray);
        Admin admin = new Admin(flights);
        Users users = new Users(flightsArray);
        UserMenu userMenu = new UserMenu();
        while (true) {
            System.out.println("1 <SIGN IN>");
            System.out.println("2 <SIGN UP>");
            Scanner scanner = new Scanner(System.in);
            int menuNumber = scanner.nextInt();
            switch (menuNumber) {
                case 1 :
                    singInMethod ( admin, userMenu, users, flights);
                    break;
                case 2 :
                    users.add();
                    break;
            }
        }
    }
    public  static void singInMethod (Admin admin,UserMenu userMenu,Users users,Flights flights) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username");
        String username = scanner.nextLine();
        System.out.println("Please enter your password");
        String password= scanner.nextLine();
        if (username == "Admin" && password == "Admin"){
            admin.main(flights);
        }
        else {
            User user = new User();
            user = users.findUser(username);
            userMenu.userWork(user);
        }
    }
}