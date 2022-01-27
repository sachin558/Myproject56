public class Lixcon_number {
    public static  void Lix(int n){
        if(n>=100){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Lix(n+1);
    }

    public static void main(String[] args) {
        Lix(0);
    }
}
