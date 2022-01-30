/*
. Create an array of 5 elements with values {1,7,4,7,6}.Search value 7 in the given array and print all
 the  occurrence(index) of search value(7) by holding the index in a result array . Do it recursively
The prototype of the method is as follows:-
 */
public class Recursion_Example11 {
    public static int res(int arr[],int current, int l, int search_value)
    {
        if(current<l){
            return 1;
        }if(arr[current]==search_value){
            return current;
    }if(arr[l]==search_value){
            return l;
    }
        return res(arr,current+1,l-1,search_value);
    }

    public static void main(String[] args) {
        int x=7;
        int arr[]={1,7,4,7,6};
        int index=res(arr,0,arr.length,x);
        if(index!=-1){
            System.out.println("this is the element is present in the array "+x+" and index of the element "+index);
        }else {
            System.out.println("element is not present in the array ");
        }
    }
}
