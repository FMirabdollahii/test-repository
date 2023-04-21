public class UserMenu {
    private Users users;
    public void userWork(User user) {

        int userNumber = 1;
        while (!(userNumber == 6)) {
            printUserMenu();
            switch (userNumber) {
                case 1:
                    users.changePassword(user);
                    break;

                case 2:
                    users.flightSearch(user);
                    break;

                case 3:
                    users.bookingTicket(user);
                    break;

                case 4:
                    users.bookedTicket(user);
                    break;

                case 5:
                    users.charge(user);
                    break;
                case 6 :
                    break;

                default:
                    System.err.println("Please carfull to chose the number of menu!");
            }
        }
    }

    private void printUserMenu() {
        System.out.println("    User Menu    ");
        System.out.println("1 < Change Password > ");
        System.out.println("2 < Search Flight >");
        System.out.println("3 < booking Ticket >");
        System.out.println("4 < booked Ticket >");
        System.out.println("5 < Add Charge >");
        System.out.println("6 < Singh Out >");
    }
}
