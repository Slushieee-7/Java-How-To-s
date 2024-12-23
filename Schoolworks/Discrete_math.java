public class Discrete_math {
    public static void main(String[] args){
        /* object-oriented programming OOP
            - focuses on implementing real world object using classes to create variations of objects, that has attributes and purpose

            classes
            - it will act as blueprint of an object u want to implement in your program
            - they contain all attributes and methods that your desired objects should have

            objects
            - created by initiating a class
            - anything that has an attribute and a purpose
                -- attributes are global variables declared inside the class of our object
                -- it is used to create variations of an object using only one class

            Class Creation
                modifiers ClassName{
                    attributes
                    methods or purpose
                }

            Example
                Person
                    First name
                    Last name
                    Gender
                    Age

            public Person class {
                //attributes here
                String first name;
                string last name;
                char gender;
                int age;

                //methods or purpose


         */
         class Person{
            String firstname;
            String lastname;
            char gender;
            int age;
        }
        // Class Instantiation - the process of creating an Object using class
        // new is the keyword used to create new object
        // Person() -> constructor; which is a method that initializes an object when it is created
        // instance refers to a specific object created from class
        Person person = new Person(); //this is now an object of the class "Person"
        person.firstname = "Rey";
        person.lastname = "Delos Reyes";
        person.gender = 'M';
        person.age = 19;

        //identifier.attribute = value
        Person person1 = new Person();
        person1.firstname = "Cassandra";
        person1.lastname = "Tacocong";
        person1.gender = 'F';
        person1.age = 19;


        //identifier.attribute
        System.out.println("First name: " + person1.firstname);
        System.out.println("Last name: " + person.lastname);
        System.out.println("Gender: " + person1.gender);
        System.out.println("Age: " + person1.age);




    }

}
