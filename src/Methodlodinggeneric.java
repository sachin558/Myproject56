public class Methodlodinggeneric <T>{
    public void display(T val){
        System.out.println(val);
    }
    public void display1(T val){
        System.out.println(val);
    }

    public static void main(String[] args) {
        Methodlodinggeneric obj=new Methodlodinggeneric();
        obj.display(190);
        obj.display("sachin");
    }
}
