import java.util.ArrayList;

public class Tutorials_06 {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> languages = new ArrayList<>();
        languages.add("C#");
        languages.add("Java");
        languages.add("C++");
        System.out.println(languages.size());
        languages.remove(2);
        languages.remove("C#");
        System.out.println(languages.size());


        System.out.println(languages.get(0));

        languages.set(0, "Python");
        System.out.println(languages.get(0));

        if (languages.contains("Java")) {
            System.out.println("Java is in the array!");
        }

        for (String language : languages) {
            System.out.println(language);
        }
    }
}