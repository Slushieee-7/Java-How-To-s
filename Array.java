public class Array {
    public static void main(String[] args) {
        String [][] StudentArray = {
            {"Peter", "75", "77"},
            {"Clark", "78", "80"},
            {"Logan", "82", "84"}
        };

        StudentInfo(StudentArray);
    }

    public static void StudentInfo(String[][] students){

        for (String[] student : students) {
            String name = student[0];
            int grade1 = Integer.parseInt(student[1]);
            int grade2 = Integer.parseInt(student[2]);
            double average = (grade1 + grade2) / 2.0;

        System.out.println("Name: " + name);
        System.out.println("1st Grade: " + grade1);
        System.out.println("2nd Grade: " + grade2);
        System.out.println("3rd Grade: " + average);
        System.out.println(" ");
    }
    }
}




//     public static void main(String[] args) {
//         // Define the student array
//         String[][] studentarr = {
//             {"peter", "75", "77"},
//             {"clark", "78", "80"},
//             {"logan", "82", "84"}
//         };

//         // Display student information
//         displayStudentInfo(studentarr);
//     }

//     // Function to display student information
//     public static void displayStudentInfo(String[][] students) {
//         System.out.printf("%-10s %-10s %-10s %-10s%n", "Name", "Grade 1", "Grade 2", "Average");
//         System.out.println("----------------------------------------");

//         for (String[] student : students) {
//             String name = student[0];
//             int grade1 = Integer.parseInt(student[1]);
//             int grade2 = Integer.parseInt(student[2]);
//             double average = (grade1 + grade2) / 2.0;

//             System.out.printf("%-10s %-10d %-10d %-10.2f%n", name, grade1, grade2, average);
//         }
//     }
// }
