package Basic;

public class Armstrong {

    public static boolean isarmstrong(int num){
        String num_string = Integer.toString(num);
        int power = num_string.length();
        int original = num;
        int sum = 0;
        while(num > 0){
            int rem = num%10;
            num = num/10;
            sum = (int) (sum + Math.pow(rem,power));
        }
        if (sum == original){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 100; i < 10000; i++) {
            if (isarmstrong(i)){
                System.out.println(i);
            }
        }

//        int num = 100;
//        String num1 = Integer.toString(num);
//        System.out.println(num1);
//        System.out.println(num1.charAt(0));
//        System.out.println(isarmstrong(154));
    }
}
