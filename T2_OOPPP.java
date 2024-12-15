import java.util.ArrayList;
public class T2_OOPPP {
    private ArrayList<AddressBookEntry> entries;

    public void AddressBook() {
        entries = new ArrayList<>(100);
    }

    public void addEntry(AddressBookEntry entry) {
        if (entries.size() < 100) {
            entries.add(entry);
            System.out.println("Entry added successfully.");
        } else {
            System.out.println("Address book is full. Cannot add more entries.");
        }
    }

    public void deleteEntry(String name) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getName().equalsIgnoreCase(name)) {
                entries.remove(i);
                System.out.println("Entry deleted successfully.");
                return;
            }
        }
        System.out.println("Entry not found.");
    }

    public void viewAllEntries() {
        if (entries.isEmpty()) {
            System.out.println("Address book is empty.");
            return;
        }
        
        for (AddressBookEntry entry : entries) {
            System.out.println(entry);
        }
    }

    public void updateEntry(String name, String newPhoneNumber, String newEmail) {
        for (AddressBookEntry entry : entries) {
            if (entry.getName().equalsIgnoreCase(name)) {
                entry.setPhoneNumber(newPhoneNumber);
                entry.setEmail(newEmail);
                System.out.println("Entry updated successfully.");
                return;
            }
        }
        System.out.println("Entry not found.");
    }
}
