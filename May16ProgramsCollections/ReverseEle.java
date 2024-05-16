package May16ProgramsCollections;
import java.util.Collections;
import java.util.ArrayList;
public class ReverseEle {
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
        System.out.println("Before reverse: " + s);
        Collections.reverse(s);
        System.out.println("After reverse : " + s);
    }
}
