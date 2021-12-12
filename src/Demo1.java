public class Demo1 <T>{
    T obj;
    Demo1( T tobj){
        obj=tobj;
    }
    public T getObj(){
        return obj;
    }
    public static void main(String[] args) {
        Demo1<Integer>obj=new Demo1<>(10);
        obj.getObj();
        System.out.println(obj);
    }
}
