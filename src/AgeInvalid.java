/*
Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60.
Display proper error messages.

The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
 (Hint : Create a user defined exception class for handling errors.)
 */
public class AgeInvalid extends  Exception{
    public static void main(String[] args) {
        try {
            String name=args[0];
            System.out.println(name);
            for (int i = 1; i < args.length; i++) {
                int age = Integer.parseInt(args[i]);
                if(age<18||age>=60)
                    System.out.println(age);throw new AgeInvalid();
            }
        }catch (AgeInvalid e){
            System.out.println(e);
        }

        }
    }

