package Basic;

public class Palidrome {

//    public static boolean ispalidrome(String s){
//        String original = s;
//        String reverse = "";
//        for (int i = s.length()-1; i >= 0; i--) {
//            reverse = reverse + s.charAt(i);
//        }
//        if(original.equalsIgnoreCase(reverse)){
//            return true;
//        }
//        return false;
//    }


    public static boolean ispalidrome(int num){
        int original = num;
        int reverse = 0;
        while(num > 0){
            int rem = num%10;
            num = num/10;
            reverse = reverse*10 + rem;
        }
        if(original==reverse){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
//        String s = "madam";
//        System.out.println(ispalidrome(s));
        System.out.println(ispalidrome(12321));
    }
}
