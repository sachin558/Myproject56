import java.util.Scanner;

/*
 There is a company that manufactures three types of products. In this company, there are 5 salesmen.
 Each salesman is supposed to sell three products. Write a program to print
(i) The total no of sales by each salesman and
(ii) total sales of each item.
The structure of the class Company is as follows:-
class Company
{
	int products[];
}
HInt:-
Company salesman[]= new Company[5];
Output :-
 Enter the sales of 3 items sold by salesman 1: 23 23 45
Enter the sales of 3 items sold by salesman 2: 34 45 63
Enter the sales of 3 items sold by salesman 3: 36 33 43
Enter the sales of 3 items sold by salesman 4: 33 52 35
Enter the sales of 3 items sold by salesman 5: 32 45 64
Total Sales By Salesman 1 = 91 Total Sales By Salesman 2 = 142 Total Sales By Salesman 3 = 112
Total Sales By Salesman 4 = 120
Total Sales By Salesman 5 = 141
Total sales of item 1 = 158
Total sales of item 2 = 198
Total sales of item 3 = 250
 */
public class Campany_Manufa {
    int product[],a,b,c;
    Campany_Manufa(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sales of the 3 item sold by the salesman 1");
        a=sc.nextInt();
        System.out.println("enter the sales of the 3 item sold by the salesman 2");
        b=sc.nextInt();
        System.out.println("enter the sales of the 3 item sold by the salesman 3");
        c=sc.nextInt();
    }

    public static void main(String[] args) {
        int i,sum1=0,sum2=0,sum3=0;
        Campany_Manufa salesman[]=new Campany_Manufa[3];
        for ( i = 0; i < salesman.length; i++) {
            salesman[i]=new Campany_Manufa();
        }
        for ( i = 0; i < salesman.length; i++) {
            sum1+=salesman[i].a;
            sum2+=salesman[i].b;
            sum3+=salesman[i].c;
        }
        System.out.println("Total sales by the 1 salesman "+sum1);
        System.out.println("Total sales by the 2 salesman "+sum2);
        System.out.println("Total sales by the 3 salesman "+sum3);
    }
}
