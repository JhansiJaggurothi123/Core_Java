package May16ProgramsCollections;
import java.util.*;
import java.util.ArrayList;

public class InsertEle {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        s.add("Blue");
        s.add("Green");
        s.add("Yellow");
        s.add("Red");
        System.out.println(s);
        s.add(0,"violet");
        s.add(3,"white");
        System.out.println(s);
    }
}
