//public class Application {
//    public static void main(String[] args) {
//        String[] options = {"Input Student Scores", "Display Student Record", "Exit"};
//        Menu menu = new Menu(options);
//        StudentRecord studentRecord = new StudentRecord();
//        boolean running = true;
//
//        while (running) {
//            int choice = menu.displayMenu();
//            switch (choice) {
//                case 1:
//                    studentRecord.inputScores();
//                    break;
//                case 2:
//                    studentRecord.displayRecord();
//                    break;
//                case 3:
//                    running = false;
//                    System.out.println("Exiting the application.");
//                    break;
//                default:
//                    break;
//            }
//        }
//    }
//}
