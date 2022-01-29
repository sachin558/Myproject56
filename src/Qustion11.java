import java.util.Scanner;

/*
Suppose you have a Piggie Bank with an initial amount of 50 and you have to add some more amount to it.
 Create a class 'AddAmount' with a data member named 'amount' with an initial value of 50.
  Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to Piggie Bank
Create object of the 'AddAmount' class and display the final amount in Piggie Bank.

 */
public class Qustion11 {
    int amount,addamount;
    Qustion11(){
        amount=50;
    }
    Qustion11(int addamount){
        addamount+=amount;
    }
    void dispaly(){
        System.out.println("this is the addedamount"+addamount);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entree the amount");
        Qustion11 obj=new Qustion11(sc.nextInt());
        obj.dispaly();
    }
}
