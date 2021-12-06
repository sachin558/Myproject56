// by useing the generic expression
import java.util.ArrayList;

public class Genenic {
    public static void main(String[] args) {
        ArrayList<String>obj=new ArrayList<>();
        obj.add("sachin");
        obj.add("yadav");
        obj.add("prem");
        System.out.println(obj);
        String s=obj.get(1);
        System.out.println(s);
    }
}
