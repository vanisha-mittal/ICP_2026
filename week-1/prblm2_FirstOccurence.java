import java.util.*;
class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String needle=sc.next();
        String haysack=sc.next();
        System.out.println(strStr(haysack,needle));
    }
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}