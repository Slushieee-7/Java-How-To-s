import java.util.*;
class collections {

    public void arraylist(int x, int y){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public void linkedlist(int x, int y){
        LinkedList<Integer> al = new LinkedList<>();
        al.add(x);
        al.add(y);
        Iterator it = al.iterator();
        while (it.hasNext()) {
        System.out.println(it.next());
        } 
    }

    public void vector(int x, int y){
        Vector<Integer> v = new Vector<>();
        v.add(x);
        v.add(y);
        Iterator it = v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        Scanner choi = new Scanner(System.in);
        System.out.println("\t Pick a collection: \n\t 1. ArrayList \n\t 2. LinkedList \n\t 3. Vector \n: ");
        int choice = choi.nextInt();

        switch (choice){
            case 1:
            System.out.println(" Enter the first number you want to add in the ArrayList: ");
            int a = choi.nextInt();
            System.out.println(" Enter the second number you want to add in the ArrayList: ");
            int b = choi.nextInt();
            collections arraylist = new collections();
            arraylist.arraylist(a, b);
            break;

            case 2:
            System.out.println(" Enter the first number you want to add in the LinkedList: ");
            int c = choi.nextInt();
            System.out.println(" Enter the second number you want to add in the LinkedList: ");
            int d = choi.nextInt();
            collections linkedlist = new collections();
            linkedlist.arraylist(c, d);
            break;

            case 3:
            System.out.println(" Enter the first number you want to add in the Vector: ");
            int e = choi.nextInt();
            System.out.println(" Enter the second number you want to add in the Vector: ");
            int f = choi.nextInt();
            collections vector = new collections();
            vector.vector(e, f);
            break;

            default:
            System.out.println("Invalid choice");
            break;
        }
        choi.close();
    }
}
