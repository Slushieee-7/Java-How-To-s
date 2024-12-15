class polymorphism{

     class Tao{
        private String name;
        private int age;
        private char gender;
    
        public Tao(String name, int age, char gender){
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
    
        public String Getname(){
            return name;
        }

        public int Getage(){
            return age;
        }

        public char Getgender(){
            return gender;
        }
    }

    public class Student extends Tao{
        
        private double grade;

        public Student(String name, int age, char gender, double grade){
            super(name, age, gender);
            this.grade = grade;
        }

        public void DisplayStudent(){
            System.out.println("Name: " + Getname());
            System.out.println("Age: " + Getage());
            System.out.println("Gender: " + Getgender());
            System.out.println("Grade: " + grade);
        }
    }

    public class Teacher extends Tao{
        
        private double salary;

        public Teacher(String name, int age, char gender, double salary){
            super(name, age, gender);
            this.salary = salary;
        }

        public void DisplayTeacher(){
            System.out.println("Name: " + Getname());
            System.out.println("Age: " + Getage());
            System.out.println("Gender: " + Getgender());
            System.out.println("Salary: " + salary);
        }
    }
   

    public static void main(String[] args) {
        polymorphism polymorphism = new polymorphism();
        Student[] students = {
            polymorphism.new Student("Ate Girl", 20, 'F', 4.0),
            polymorphism.new Student("Sean", 22, 'M', 3.5)
        };
        Teacher teacher = polymorphism.new Teacher("Sir Cezar", 40, 'M', 10000);

        System.out.println("Students:");
        for (Student student : students) {
            student.DisplayStudent();
        }

        System.out.println("Teacher:");
        teacher.DisplayTeacher();
    }
}

