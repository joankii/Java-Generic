package Java.Generic.Application;
import Java.Generic.MyData;
public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<Object>("Joankii");
        MyData<? super String> myData = objectMyData;

        process(objectMyData);
        System.out.println(objectMyData.getData());

    }
    public static void process(MyData<? super String > myData) {

        myData.setData("Joan");

    }
}
