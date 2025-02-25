import java.util.*;

public class sortArray {
    public static void main(String[] args) {
        String[] food = {"Chicken", "Fries", "Burrito", "Mango Graham"};
        Arrays.sort(food); //this sorts each data stored in the food array
        for (String i : food){
            System.out.println(i);
        }
    }
}