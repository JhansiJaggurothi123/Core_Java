import java.util.Scanner;
class ArrySumAve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
          float averge=sum/size;
            System.out.println("sum of array:" + sum);
            System.out.println("Avergae of array:" +averge);
        }
    }
