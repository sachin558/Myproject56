/*
write the program to take the input from the user in the form of the string and remove (a) the character from the given string
 */
public class Recuresion_remove_a_for_string {
    public static String string1(String str){
        if(str.length()==0){
            return str;
        }
        String ans=" ";
        if(str.charAt(0)=='a'){
            ans=ans+str.charAt(0);
        }
        System.out.print(ans);
        return ans+string1(str.substring(1));
    }

    public static void main(String[] args) {
//        Recuresion_remove_a_for_string obj=new Recuresion_remove_a_for_string();
        string1("saaaachin");
    }
}
