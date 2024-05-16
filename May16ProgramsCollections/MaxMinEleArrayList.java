package May16ProgramsCollections;
import java.util.ArrayList;
import java.util.Collections;
public class MaxMinEleArrayList {
    public static void main(String[] args) {
            ArrayList num_list = new ArrayList();
            num_list.add("80");
            num_list.add("18");
            num_list.add("48");
            num_list.add("37");
            num_list.add("24");
            Object max_num = Collections.max(num_list);
            Object min_num=Collections.min(num_list);
            System.out.println("Maximum Element ArrayList is : " + max_num);
            System.out.println("Minimum Element ArrayList is : " + min_num);
        }
    }

