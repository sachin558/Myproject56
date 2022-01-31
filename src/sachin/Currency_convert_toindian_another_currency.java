package sachin;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
write  the program to convert the indian currency into another currency
 */
public class Currency_convert_toindian_another_currency {
    double a;
    Currency_convert_toindian_another_currency(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the amount in the indian currency ");
        a=sc.nextDouble();
        sc.close();
    }void display(){
        NumberFormat fra=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("this is the currency of the France "+fra.format(a));
    }

    public static void main(String[] args) {
        Currency_convert_toindian_another_currency obj=new Currency_convert_toindian_another_currency();
        obj.display();
    }
}
