import java.util.ArrayList;
        class Set {
            private ArrayList<Integer> elements;

            //constructor to initialize the set
            public Set() {
                elements = new ArrayList<>();
            }

            //add an element to the set
            public void addElement(int element) {
                if (!elements.contains(element)) {
                    elements.add(element);
                }
            }

            //display the elements of the set
            public void DisplaySet() {
                System.out.println("Set: " + elements);
            }

            public Set union(Set otherSet){
                Set resultSet = new Set();
                //this refers to the current instance of the class
                resultSet.elements.addAll(this.elements);
                for(int element : otherSet.elements){
                    resultSet.addElement(element);
                }
                return resultSet;
            }

            public Set intersection(Set otherSet){
                Set resulttSet = new Set();
                for(int element: this.elements){
                    if(otherSet.elements.contains(element)) {
                        resulttSet.addElement(element);
                    }
                }
                return resulttSet;
            }

            public Set Difference(Set otherSet){
                Set resulttSet = new Set();
                for(int element: this.elements){
                    if(!otherSet.elements.contains(element)) {
                        resulttSet.addElement(element);
                    }
                }
                return resulttSet;
            }
        }

public class Discrete_Math3 {
    public static void main(String[] args){
        //creating two sets
        Set setA = new Set();
        Set setB = new Set();

        setA.addElement(5);
        setA.addElement(6);
        setA.addElement(7);
        setA.addElement(8);

        setB.addElement(1);
        setB.addElement(2);
        setB.addElement(3);
        setB.addElement(4);
        setB.addElement(5);

        setA.DisplaySet();
        setB.DisplaySet();

        //union
        Set unionSet = setA.union(setB);
        Set InterSet = setA.intersection(setB);
        Set Diff = setA.Difference(setB);
        System.out.println("Set Union of A and B ");
        unionSet.DisplaySet();
        System.out.println("Intersection of A and B ");
        InterSet.DisplaySet();
        System.out.println("Difference of A and B ");
        Diff.DisplaySet();

    }
}

/*
    Mini-Activity

    Create function for the following set of operations:
        - intersection
        - difference
 */
