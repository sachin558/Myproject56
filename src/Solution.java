import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

        static boolean isAnagram(String a, String b) {
            // Complete th
            boolean ret;
           if(a.length()==b.length()){
               char []arr=a.toLowerCase().toCharArray();
               char []arr1=b.toLowerCase().toCharArray();
               Arrays.sort(arr);
               System.out.println(arr);
               Arrays.sort(arr1);
               System.out.println(arr1);
           }
           return true;
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

