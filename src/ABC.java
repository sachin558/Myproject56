import java.util.ArrayList;

public class ABC {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList();
        obj.add(10);
        obj.add("ABC");
        obj.add(10.9);
        System.out.println(obj);
        String s=(String) obj.get(1);
        System.out.println(s);
    }
}
