import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        for (int i = 0; i < a.length(); i++) {
            a.charAt(i);
        }
        for (int i = 0; i < b.length(); i++) {
            b.charAt(i);
        }if(a.length()==b.length()){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

