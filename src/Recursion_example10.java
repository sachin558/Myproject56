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
    public static int find(int arr[],int currentindex,int search_value){
        if (currentindex<0){
            return 0;
        }
        if(arr[currentindex]==2){
            return arr;
        }
    }
}
