import sachin.String_present_or_not;

import java.util.Locale;
import java.util.Scanner;

/* write  the program take the multiple input from the user and count the number of  string are start  from the HR
 */
public class String_qustion_1 {
    String st[],st1[];
    int i;
    String_qustion_1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the string ");
        st=new String[sc.nextInt()];
        st1=new  String[sc.nextInt()];
        System.out.println("enter the multiple string int the array ");
        for ( i = 0; i < st.length; i++) {
            st[i]=sc.next();
        }
    }
    void display(){
        int count=0;
        for ( i = 0; i < st.length; i++) {
            if(st[i].contains("HR")==true){
                st1[i]=st[i];
                count+=1;
            }
        }
        if(count>0) {
            System.out.println(count);
            for ( i = 0; i < st.length; i++) {
                if (st1[i] != null) {
                    System.out.println(st1[i].toUpperCase());
                }
            }
        }
    }

    public static void main(String[] args) {
        String_qustion_1 obj=new String_qustion_1();
        obj.display();
    }
}
