// import java.util.Scanner;
//
//    public class Menu {
//        private String[] menuItems;
//
//        public Menu(String[] menuItems) {
//            this.menuItems = menuItems;
//        }
//
//        public int displayMenu() {
//            Scanner scanner = new Scanner(System.in);
//            int choice = -1;
//            while (choice < 1 || choice > menuItems.length) {
//                System.out.println("Please choose an option:");
//                for (int i = 0; i < menuItems.length; i++) {
//                    System.out.println((i + 1) + ". " + menuItems[i]);
//                }
//                System.out.print("Enter your choice: ");
//                if (scanner.hasNextInt()) {
//                    choice = scanner.nextInt();
//                } else {
//                    scanner.next(); // Clear invalid input
//                }
//            }
//            return choice;
//        }
//    }
//
