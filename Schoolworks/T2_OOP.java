public class T2_OOP {
    
    public class Room { 
        int roomNo;
        String roomType; 
        double roomArea; 
        boolean acMachine; 

        public void set(int roomNo, String roomType, double roomArea, boolean acMachine) {
            this.roomNo = roomNo;
            this.roomType = roomType;
            this.roomArea = roomArea;
            this.acMachine = acMachine;
        }

        public void display() {
            System.out.println("Room No: " + roomNo);
            System.out.println("Room Type: " + roomType);
            System.out.println("Room Area: " + roomArea + " sq. meters");
            System.out.println("AC Machine? " + (acMachine ? "Yes" : "No"));
        }
    }

    public static void main(String[] args) {
        T2_OOP outer = new T2_OOP();
        T2_OOP.Room room = outer.new Room(); 
        room.set(7, "King Sized", 20.8, true);
        room.display();
    }
}