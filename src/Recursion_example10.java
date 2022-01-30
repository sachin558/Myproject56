import java.util.Scanner;

/*
 Create an array of 5 elements with values {1,2,4,2,6}.search value 2 in the given array and print the first occurrence(index)
 of search value. Do it recursively
The prototype of the method is as follows
public static int find(int arr[ ], int currentIndex, int search_value)
{
	// set of statements;
}

 */
public class Recursion_example10 {
    public static int find(int arr[],int n,int search){
        if(n==0){
            return 0;
        }
        if(arr[n]==search)
            return search;
        System.out.println(search);
        return find(arr,n-1,search);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2};
        int n=arr.length;
        find(arr,n,2);
    }
}
