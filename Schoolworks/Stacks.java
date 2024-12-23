import java.util.Stack; //java program to access the stack

public class Stacks {

    //When we say "top of the stack" means its located at the rightmost part of the array 
    // Example of a stack
    // public static void main(String[] args) {
    //     //creates a new stack 
    //     Stack<Integer> stack = new Stack<>();
    
    //     //pushes an element onto the stack
    //     stack.push(4); //3rd to be displayed
    //     stack.push(5); //2nd to be displayed
    //     stack.push(6); //1st to be displayed
    
    //     while(!stack.isEmpty()){
    //         System.out.println(stack.pop()); //pops out the elements 
    //     }
    // }
//---------------------------------------------------------------------------------------------------------------

     // //ADDING ELEMENTS using "push()" operation

    // public static void main(String[] args) {

        // //initializes the stack
        // Stack stack1 = new Stack();

        // //creates an empty stack
        // Stack<String> stack2 = new Stack<String>(); //the open and closed parentheses is the Stack()

        // //pushing elements 
        // stack1.push("This ");
        // stack1.push("is ");
        // stack1.push("a stack");

        // stack2.push("Nababaliw");
        // stack2.push("na ako sa");
        // stack2.push("stacks na to");

        // //outputs or prints the elements
        // System.out.println(stack1); //prints out [This , is , a stack]
        // System.out.println(stack2); //prints out [Nababaliw, na ako sa, stacks na to]
    // }
//---------------------------------------------------------------------------------------------------------------------------------

    //  //ACCESSING THE ELEMENTS using "peek()" method
    // public static void main(String[] args) {
    //     //creates a blank stack
    //     Stack <String> stack = new Stack<String>();

    //     //use push() to add elements to the stack
    //     stack.push("First");
    //     stack.push("Second");
    //     stack.push("Third");

    //     //diplays the stack
    //     System.out.println("This is the initial stack " + stack); //prints out "This is the initial stack [First, Second, Third]"

    //     //getting the element at the top of the stack using peek() operation
    //     System.out.println("The element at the top of the stack is " + stack.peek()); // prints out the last pushed element which is "a stack"

    //     //diplays the stack after the operation
    //     System.out.println("Final Output: " + stack); //which also prints the same as the initial stack
    // }

//-------------------------------------------------------------------------------------------------------------------------------------------
    // //REMOVING ELEMENTS using "pop()" method
    //  public static void main(String[] args) {

    //     //Creates a blank stack
    //     Stack <Integer> stack = new Stack<Integer>();

    //     //use push() method to add elements into your stack
    //     stack.push(2);
    //     stack.push(3);
    //     stack.push(4);
    //     stack.push(5);

    //     //displays the stack
    //     System.out.println("Original stack: " + stack);

    //     //REMOVE elements using the pop() method
    //     System.out.println("Popped element " + stack.pop()); //removes the number 5 because it was the last pushed element
    //     System.out.println("Popped element " + stack.pop()); //removes the number 4 because it is now the last pushed element after 5 is removed

    //     //displays the stack after the pop method
    //     System.out.println("Final stack after the pop operation: " + stack);
    // }
//-------------------------------------------------------------------------------------------------------------------

    //other methods in stack
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original stack: " + stack);
        System.out.println("Size of the stack: " + stack.size()); //prints out the size of the stack
        System.out.println("Is the stack empty?: " + stack.empty()); //returns true if nothing is on top of the stack and false otherwise
        System.out.println("What position in the stack is number 3?: " + stack.search(3)); //prints out the position of the stack from the top of the stack
    }
}