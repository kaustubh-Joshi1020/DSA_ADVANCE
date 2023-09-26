package Basic;

public class Swap_without_third {

    public static void swap(int a , int b){
        int total = a + b;
        a = total - a;
        b = total - b;
        System.out.println("a=" +a);
        System.out.println("b=" +b);
    }
    public static void main(String[] args) {
        int a = 2534;
        int b =7424;
        swap(a , b);
    }

}
