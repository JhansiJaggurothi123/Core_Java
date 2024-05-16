package May16ProgramsCollections;
import java.util.*;
import java.util.ArrayList;

public class SearchAnEle {
    public static void main(String[] args) {
        ArrayList<String> s= new ArrayList<String>();
        s.add("Computer");
        s.add("Keyboard");
        s.add("Mouse");
        s.add("CPU");
        s.add("Printer");
        s.add("Derive");
        if(s.contains("Derive"))
            System.out.println("Found ");
        else
            System.out.println("Not found");
    }
}
