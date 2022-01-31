import java.util.Scanner;

/*
Write a Java class, Flower, that has three instance variables of type String, int, and float,
which respectively represent the name of the flower, its number of petals, and price.
Your class must include a constructor method that initialises each variable to an appropriate value,
and your class should include methods for setting the value of each type, and getting the value of each type.
Create an array of 5 Flower objects and print the value.
 */
public class Flower_5 {
    String name;
    int petals;
    float price;
    Flower_5(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the name of the flower ");
        name=sc.nextLine();
        System.out.println("entre the petals of the flower ");
        petals=sc.nextInt();
        System.out.println("enter the price of the flower ");
        price=sc.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetals() {
        return petals;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Flower_5 obj=new Flower_5();
        Flower_5 arr[]=new Flower_5[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Flower_5();
        }

    }
}
