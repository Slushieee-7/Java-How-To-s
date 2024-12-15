import java.util.Arrays;
import java.util.List;

public class Ken {
    public static void main(String[] args) {
        List<String> texts = Arrays.asList(
            "Hello I am Ken Dylen R. Fernando",
            "I am a developer that is proficient in Java, Typescript, Python, R, and PHP.",
            "I have worked with several clients, creating plugins, software and web application that suit their needs.",
            "I offer affordable services, with my team."
        );
        for (String text : texts) System.out.println(text);
    }
}
