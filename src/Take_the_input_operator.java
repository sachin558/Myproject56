import java.util.Scanner;
/*
Take the input symbol  from the user and following the based on the condition
 */
public class Take_the_input_operator {
    int ans;
    Take_the_input_operator(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("enter the operator  ");
            char op=sc.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'){
                System.out.println("enter the first number");
                int num1=sc.nextInt();
                System.out.println("enter the second number ");
                int num2=sc.nextInt();
                if (op == '+') {
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1+num2;
                }
                if (op == '/') {
                    ans=num1+num2;
                }
                if(op=='*'){
                    ans=num1+num2;
                }
            }else if(op=='x'||op=='X'){
//                System.out.println("this is the  invalide operator ");
                break;
            }else {
                System.out.println("this the invalide operator ");
            }
            System.out.println("ans "+ans);
        }
    }
    public static void main(String[] args) {
        Take_the_input_operator obj=new Take_the_input_operator();
    }
}
