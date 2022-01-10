import java.util.Scanner;

/*
write a program find the number of the vowels in the given string
 */
public class check_in_string_vowels {
    public static void main(String[] args) {
        int vowels=0,consunst=0;
     Scanner sc=new Scanner(System.in);
        System.out.println("entr the string ");
        String str=sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'){
                System.out.println("vowels = "+c);
                vowels++;
            }else {
                System.out.println("consunat = "+c);
                consunst++;
            }
        }
        System.out.println("number of the vowels = "+vowels);
        System.out.println("number of the consunet= "+consunst);
    }
}
