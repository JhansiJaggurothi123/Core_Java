package May16ProgramsCollections;
import java.util.*;
public class VectorP {
    public static void main(String[] args) {
        Vector v1=new Vector() ;
        v1.add("honey");
        v1.add("milk");
        v1.add(0,"butter");
        v1.add("buttermilk");
        v1.add("drink");
        Vector v2=new Vector();
        v2.add("j1");
        v2.add("j2");
        v2.add("j3");
        v2.add("j4");
        v2.add("j5");
        v2.add("j6");
        v1.addAll(0,v2);
        v1.removeAll(v2);
        System.out.println(v1.contains("drink"));
        System.out.println(v1.get(4));
        System.out.println("Size :"+v1.size());
        System.out.println("Capacity:"+v1.capacity());
    }
}
