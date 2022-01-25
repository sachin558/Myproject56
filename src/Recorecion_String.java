import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.util.Scanner;

public class Recorecion_String {
    String str;
    Recorecion_String(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the name of the String ");
        str=sc.nextLine();
    }
    void display(){
        str=str.substring(1);
        System.out.println(str);
    }

    public static void main(String[] args) {
        Recorecion_String obj=new Recorecion_String();
        obj.display();
    }
}
