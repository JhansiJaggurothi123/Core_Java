package patterns;

public class Pattern8 {
        public static void main(String[] args) {
            int n = 5;
            for (int i=1;i<=n;i++) {
                for(int j=i;j<=n;j++){
                    System.out.print(" ");
                }
                for (int j =1,p=1;j<=i; j++,p++)
                {
                    System.out.print(p+" ");
                }
                System.out.println();
            }
        }
    }

