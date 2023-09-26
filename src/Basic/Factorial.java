package Basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       long num = 1L;
        for (int i = 1; i <= number; i++) {
            num = num*i;
        }
        System.out.println(num);

    }
}
