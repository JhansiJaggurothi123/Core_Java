package patterns;
public class Pattern6 {
        public static void main(String[] args) {
            int n = 5;
            for (int i = 1,p=1; i <= 5; i++,p++) {
                for (int j = 0; j < i; j++)
                {
                    System.out.print(p+" ");
                }
                System.out.println();
            }
        }
    }

