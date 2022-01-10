import java.util.Scanner;

/*
write a program to print the name ,roll and marks of the student
 */
public class non_primitive {
    String name;
    int Roll_no;
    int Marks;
    non_primitive(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the student");
        name=sc.nextLine();
        System.out.println("enter the Roll number of the student ");
        Roll_no=sc.nextInt();
        System.out.println("entre the Marks of the student ");
        Marks=sc.nextInt();
    }
        public static void main(String[] args) {
            non_primitive arr[]=new non_primitive[10];
            int sum=0;
            for (int i = 0; i <arr.length ; i++) {
                arr[i]=new non_primitive();
            }
            for (int i = 0; i <arr.length ; i++) {
                sum+=arr[i].Marks;
                System.out.println(" name  "+arr[i].name);
                System.out.println(" roll_number  "+arr[i].Roll_no);
                System.out.println("Marks "+arr[i].Marks);
            }
            System.out.println("sum "+sum);
            System.out.println("average "+sum/arr.length);
        }
    }

