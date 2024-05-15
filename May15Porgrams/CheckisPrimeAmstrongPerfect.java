package Numbers;
import java.util.*;
public class CheckisPrimeAmstrongPerfect {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scanner.nextInt();
        if (isPrime(num)) {
            System.out.printf("%d is Prime number.\n", num);
        } else {
            System.out.printf("%d is not Prime number.\n", num);
        }
        if (isArmstrong(num)) {
            System.out.printf("%d is Armstrong number.\n", num);
        } else {
            System.out.printf("%d is not Armstrong number.\n", num);
        }
        if (isPerfect(num)) {
            System.out.printf("%d is Perfect number.\n", num);
        } else {
            System.out.printf("%d is not Perfect number.\n", num);
        }
    }
    static boolean isPrime(int num) {
        if (num < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    static boolean isArmstrong(int num) {
        int originalNum, lastDigit, sum = 0;
        originalNum = num;
        int digits = (int) Math.log10(num) + 1;
        while (num > 0) {
            lastDigit = num % 10;
            sum += Math.pow(lastDigit, digits);
            num /= 10;
        }
        return originalNum == sum;
    }
    static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return num == sum;
    }


}
