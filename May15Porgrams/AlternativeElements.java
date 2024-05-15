package Numbers;
public class AlternativeElements {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,};
        int n= arr.length;
        System.out.println("Alternative Elements:");
        for(int i=0;i<n;i+=2){
            System.out.print(arr[i]+" ");

        }
    }
}
