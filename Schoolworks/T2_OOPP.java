public class T2_OOPP{

    public class addressbookentry{
        String name;
        String address;
        String Telephonenumber;
        String emailaddress;

        public void display(String name, String address, String Telephonenumber, String emailaddress){
            this.name = name;
            this.address = address;
            this.Telephonenumber = Telephonenumber;
            this.emailaddress = emailaddress;
        }

        public void display(){
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Telephone Number: " + Telephonenumber);
            System.out.println("Email Address: " + emailaddress);
        }        
    }

    public static void main(String[] args) {
        T2_OOPP entry = new T2_OOPP();
        T2_OOPP.addressbookentry enter = entry.new addressbookentry();
        enter.display("Lester, Moe", "123 Main St", "09204832947", "LesterMoe@gmail.com");
        enter.display();
    }

    
}
