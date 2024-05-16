package May16ProgramsCollections;
import java.util.Stack;
public class StackArraylist {
    public static void main(String[] args) {
        Stack<String> s=new Stack();
        s.push("blue");
        s.push("green");
        s.push("orange");
        s.push("white");
        s.push(null);
        s.push("blue");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.search("blue"));
        System.out.println(s.indexOf("orange"));
        System.out.println(s.isEmpty());
        System.out.println(s.empty());

    }
}
