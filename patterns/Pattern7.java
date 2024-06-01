package patterns;
public class Pattern7 {
        public static void main(String[] args) {
            int n = 5;
            for (int i=1,p=1;i<=n;i++,p++) {
                for (int j = i;j<=n; j++)
                {
                    System.out.print(p+" ");
                }
                System.out.println();
            }
        }
    }


