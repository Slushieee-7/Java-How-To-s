import java.util.*;

public class generatesubjects {
    List<String> subjectID = Arrays.asList(
        // CS
        "CS0001:Discrete Structures", 
        "CS0003:Computer Systems & Architecture", 
        "CS0069:Object Oriented Programming", 
        "CS0007:Algorithm", 
        "CS0009:Fundamentals of Analytics",
        "CS0017:Operating System", 
        "CS0021:Discrete Structures 2", 
        "CS0054:Mobile Programming", 
        "CS0013:Networks and Communications 1", 
        "CS0023:Automata and Formal Languages",
        // IT
        "IT0003:Visual Graphics", 
        "IT0043:Web Design with Client Side Scripting", 
        "IT0061:Digital Illustration", 
        "IT0013:Networking 1", 
        "IT0017:Discrete Mathematics",
        "IT0019:Quantitative Methods", 
        "IT0119:Information Management", 
        "IT0009:Fundamentals of Database System", 
        "IT0011:Integrative Programming and Technologies", 
        "IT0015:Networking 2",
        // GED
        "GED0006:Personal and Professional Effectiveness", 
        "GED0009:Readings in Philippine History", 
        "GED0011:Science, Technology, and Society", 
        "GED0001:Specialized English Program 1", 
        "GED0013:Retorika",
        "GED0027:Mathematics in the Modern World", 
        "GED0029:Analytic Geometry with Calculus", 
        "GED0007:Art Appreciation", 
        "GED0035:The Contemporary World", 
        "GED0039:Applied Statistics"
    );

    public static void main(String[] args) {
        generatesubjects generator = new generatesubjects();
        String subjects = generator.generateSubjects();
        System.out.println(subjects);
    }

    public String generateSubjects() {
        StringBuilder subjectList = new StringBuilder(); 
        for (String subject : subjectID) {
            subjectList.append(subject).append("\n"); 
        }
        return subjectList.toString(); 
    }

    public Subject(int subject_id, String subject_name, String subject_code, int subject_units, String subject_description){
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.subject_code = subject_code;
        this.subject_units = subject_units;
        this.subject_description = subject_description;
    }
}
