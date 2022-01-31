import java.util.Scanner;
/*
Design a class that can be used by a heaaprofessional to keep track of a patient’s vital statistics. The following are the details.
Name of the class - Patient
Member Variables - patientName(String),height(double),width(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results.
 */
public class Qustion2 {
    String name;
    double height;
    double width;
    double BMI;
    Qustion2(String a,double b,double c){
        this.name=a;
        this.height=b;
        this.width=c;
    }
    double computer(){
       return BMI=(width)/(height*height);
    }
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        Qustion2 obj1=new Qustion2("sachin",7,78);
        System.out.println(obj1.computer());
    }
}
