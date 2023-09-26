package Basic;

public class Fibonacci {

    public static int fibo(int n){
       int first=0;
       int second=1;
       int third=0;
       if(n == 0){
           return n;
       }
        for (int i = 2; i <n ; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 15; i++) {
            System.out.print(fibo(i) + " ");
        }
//        System.out.println(fibo(11));
    }
}
