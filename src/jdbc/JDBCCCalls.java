package jdbc;

public class JDBCCCalls {
    public static void main(String[] args) {
        DAOclass obj=new DAOclass();
        System.out.println("entre the option ");
        int op=Integer.parseInt(args[0]);
        if(op==1){
            int rollno=Integer.parseInt(args[1]);
            String name=args[2];
            String grad=args[3];
            String dob=args[4];
              int fees=Integer.parseInt(args[5]);

        }
    }
}
