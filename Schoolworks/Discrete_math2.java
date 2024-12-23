import java.util.ArrayList;

public class Discrete_math2 {
    public static void main(String[] args){
        class Set {
            private ArrayList<Integer> elements;

            //constructor to initialize the set
            public Set() {
                elements = new ArrayList<>();
            }

            //add an element to the set
            public void addElement(int element){
                if(!elements.contains(element)){
                    elements.add(element);
                }
            }
            //display the elements of the set
            public void DisplaySet(){
                System.out.println("Set: " + elements);
            }
        }
    }
}
