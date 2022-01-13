import java.util.Scanner;

class ArrayCLass {
    int arr[],arr1[],i,j;
    Scanner sc = new Scanner(System.in);

    public ArrayCLass() {
        System.out.println("enter the size  of the array");
        arr = new int[sc.nextInt()];
        arr1=new int[sc.nextInt()];
        System.out.println("enter the element of the aray ");
        for ( i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
    }
    }
    void Search(){
        try {
            System.out.println("enter the target values ");
            for ( i = 0; i < arr.length; i++) {
                for ( j = 0; j <arr1.length ; j++) {
                    arr1[j]=sc.nextInt();
                }
                if(arr[i]==arr1[j]){
                    System.out.println("this value is the present in the given array "+i);
                }
            }
        }catch (Exception obj){
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        ArrayCLass obj=new ArrayCLass();
        obj.Search();
    }
}
