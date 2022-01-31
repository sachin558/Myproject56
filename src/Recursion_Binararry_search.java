/*write the program to search  the value in the array by using the recursion and apply the binary search concept in the
question
 */
public class Recursion_Binararry_search {
    public static int search(int arr[],int tar,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==tar){
            return m;
        }
        if(tar<arr[m]){
            return search(arr,tar,s,m-1);
        }
        return search(arr,tar,m+1,e);

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 4;
        System.out.println(search(arr,target,0,arr.length-1));
    }
}
