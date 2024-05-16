package May16ProgramsCollections;
import java.util.ArrayList;
import java.util.Collections;
public class sortElements {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("Python");
        s.add("C");
        s.add("Php");
        s.add("Css");
        s.add("MySQL");
        s.add("C++");
        s.add("Java");
        s.add("HTML");
        s.add("Bootstrap");
        s.add("Flask");
        System.out.println("Before Sort : " + s);
        Collections.sort(s);
        System.out.println("After Sort : " + s);
    }
}