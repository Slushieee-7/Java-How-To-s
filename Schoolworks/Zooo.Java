//import java.util.ArrayList;
//public class Zooo {
//    // Base class for all animals
//    public abstract class Animal {
//        protected String name;
//        protected int age;
//
//        public Animal(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//
//        // Abstract method for talking
//        public abstract void talk();
//    }
//
//    // Subclass for Lion
//    public class Lion extends Animal {
//        public Lion(String name, int age) {
//            super(name, age);
//        }
//
//        public void talk() {
//            System.out.println("I am a Lion. My name is " + name + " and I am " + age + " years old.");
//        }
//    }
//
//    // Subclass for Tiger
//    public class Tiger extends Animal {
//        public Tiger(String name, int age) {
//            super(name, age);
//        }
//
//        public void talk() {
//            System.out.println("I am a Tiger. My name is " + name + " and I am " + age + " years old.");
//        }
//    }
//
//
//
//    public class Zoo {
//        private ArrayList<Animal> animals;
//
//        public Zoo() {
//            animals = new ArrayList<>();
//        }
//
//        // Method to add an animal
//        public void addAnimal(Animal animal) {
//            animals.add(animal);
//            System.out.println(animal.name + " has been added to the zoo.");
//        }
//
//        // Method to remove an animal
//        public void removeAnimal(Animal animal) {
//            if (animals.remove(animal)) {
//                System.out.println(animal.name + " has been removed from the zoo.");
//            } else {
//                System.out.println(animal.name + " is not in the zoo.");
//            }
//        }
//
//        // Method to call feeding time
//        public void feedingTime() {
//            System.out.println("Feeding time! Here are the animals:");
//            for (Animal animal : animals) {
//                animal.talk();
//            }
//        }
//    }
//
//    // Main class to test the functionality
//    public static void main(String[] args) {
//        Zooo zooo = new Zooo();
//        Zoo zoo = zooo.new Zoo(); // Create a Zoo instance
//
//        // Create animals
//        Lion lion1 = zooo.new Lion("Leo", 5);
//        Tiger tiger1 = zooo.new Tiger("Tiggy", 3);
//
//        // Add animals to the zoo
//        zoo.addAnimal(lion1);
//        zoo.addAnimal(tiger1);
//
//        // Call feeding time
//        zoo.feedingTime();
//
//        // Remove an animal
//        zoo.removeAnimal(lion1);
//
//        // Call feeding time again
//        zoo.feedingTime();
//    }
//}