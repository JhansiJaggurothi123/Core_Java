import java.util.*;
public class FrequencyofElements{
    public static void main(String[] args){
        int arr[]={1,2,3,2,3,4,1,5,6};
        int visited=-1;
        int frq[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) {
                    count++;
                    //to avoid frequency elements
                    frq[j] = visited;
                }
            }
            if(frq[i]!=visited)
                frq[i]=count;
        }
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < frq.length; i++){
            if(frq[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + frq[i]);
        }
        System.out.println("----------------------------------------");
    }
}