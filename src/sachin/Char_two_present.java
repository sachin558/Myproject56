package sachin;

import java.util.Scanner;

/*
write the program to count the number of the pair of the same  character in the given character
 */
public class Char_two_present {
    int count;
    String str1;
    Char_two_present(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        str1=sc.nextLine();
    }
    void display(){
        for (int i = 0; i <str1.length() -1; i++) {
            if(str1.charAt(i)==str1.charAt(i+1)){
                count++;
            }
        }
        System.out.println("total count "+count);
    }

    public static void main(String[] args) {
        Char_two_present obj=new Char_two_present();
        obj.display();
    }
}
