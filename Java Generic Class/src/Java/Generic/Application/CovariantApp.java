package Java.Generic.Application;
import Java.Generic.MyData;
public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Joankii");
        process(stringMyData);


        MyData<? extends Object > myData = stringMyData;
    }

    //Covariant
    public static void process(MyData<? extends Object > myData){
        System.out.println(myData.getData());

    }
}
