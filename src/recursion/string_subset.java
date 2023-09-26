package recursion;

public class string_subset {

    public static void find_substring(String str,String ans,int i){
       if(i == str.length()){
           System.out.println(ans);
           return;
       }
        find_substring(str,ans+str.charAt(i), i+1);
        find_substring(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        find_substring(str,"",0);
    }
}
