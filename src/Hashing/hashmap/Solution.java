package Hashing.hashmap;

class Solution {
    public static String stringMirror(String str) {
        int n = str.length();
        int k = -1;
        String minStr = str;

        for (int i = 1; i <= n; i++) {
            String prefix = str.substring(0, i);
            String reversedPrefix = new StringBuilder(prefix).reverse().toString();
            String newStr = prefix + reversedPrefix;
            if (newStr.compareTo(minStr) < 0) {
                minStr = newStr;
                k = i;
            }
        }
        return minStr;
    }

    public static void main(String[] args) {
        System.out.println(stringMirror("nbgfugfbdsj"));
    }

}