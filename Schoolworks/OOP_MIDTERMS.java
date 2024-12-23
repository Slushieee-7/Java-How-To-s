import java.util.ArrayList;

public class OOP_MIDTERMS {

    class RoomSubject {
        private String subjectCode;
        private String subjectTitle;
        private int subjectUnit;
        private String subjectProfessor;

        public void setData(String code, String title, int unit, String professor) {
            this.subjectCode = code;
            this.subjectTitle = title;
            this.subjectUnit = unit;
            this.subjectProfessor = professor;
        }

        public void displayData() {
            System.out.println("Subject Code: " + subjectCode);
            System.out.println("Subject Title: " + subjectTitle);
            System.out.println("Subject Unit: " + subjectUnit);
            System.out.println("Subject Professor: " + subjectProfessor);
        }
    }

    class AlumniEntry {
        private String name;
        private String jobTitle;
        private String companyName;
        private String emailAddress;

        public AlumniEntry(String name, String jobTitle, String companyName, String emailAddress) {
            this.name = name;
            this.jobTitle = jobTitle;
            this.companyName = companyName;
            this.emailAddress = emailAddress;
        }

        public String getName() {
            return name;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public String getCompanyName() {
            return companyName;
        }

        public String getEmailAddress() {
            return emailAddress;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Job Title: " + jobTitle);
            System.out.println("Company Name: " + companyName);
            System.out.println("Email Address: " + emailAddress);
        }
    }

    class AlumniInformation {
        private ArrayList<AlumniEntry> alumni;
        private static final int MAX_ENTRIES = 100;

        public AlumniInformation() {
            alumni = new ArrayList<>(MAX_ENTRIES);
        }

        public void addEntry(AlumniEntry entry) {
            if (alumni.size() < MAX_ENTRIES) {
                alumni.add(entry);
                System.out.println("Entry added successfully.");
            } else {
                System.out.println("Cannot add more entries, maximum limit reached.");
            }
        }

        public void deleteEntry(String name) {
            for (int i = 0; i < alumni.size(); i++) {
                if (alumni.get(i).getName().equalsIgnoreCase(name)) {
                    alumni.remove(i);
                    System.out.println("Entry deleted successfully.");
                    return;
                }
            }
            System.out.println("Entry not found.");
        }

        public void viewAllEntries() {
            if (alumni.isEmpty()) {
                System.out.println("No entries available.");
                return;
            }
            for (AlumniEntry entry : alumni) {
                entry.displayInfo();
                System.out.println("---------------------------");
            }
        }

        public void updateEntry(String name, AlumniEntry newEntry) {
            for (int i = 0; i < alumni.size(); i++) {
                if (alumni.get(i).getName().equalsIgnoreCase(name)) {
                    alumni.set(i, newEntry);
                    System.out.println("Entry updated successfully.");
                    return;
                }
            }
            System.out.println("Entry not found.");
        }
    }

    public static void main(String[] args) {
        OOP_MIDTERMS program = new OOP_MIDTERMS();
        AlumniInformation alumniInfo = program.new AlumniInformation();

        AlumniEntry entry1 = program.new AlumniEntry("Rey Joshua Delos Reyes", "CS Student", "FEU Alabang", "20231000473@gmail.com");
        AlumniEntry entry2 = program.new AlumniEntry("John Doe", "Software Engineer", "ABC Company", "johndoe@example.com");

        alumniInfo.addEntry(entry1);
        alumniInfo.addEntry(entry2);

        alumniInfo.viewAllEntries();

        alumniInfo.deleteEntry("Rey Joshua Delos Reyes");

        alumniInfo.viewAllEntries();
    }
}
