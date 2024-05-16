package May16ProgramsCollections;
import java.util.*;
import java.util.ArrayList;

public class RemoveEle {
    public static void main(String[] args) {
        java.util.ArrayList<String> s=new ArrayList<>();
        s.add("Blue");
        s.add("Green");
        s.add("Yellow");
        s.add("Red");
        System.out.println(s);
        s.remove(3);
        System.out.println(s);
    }
}
