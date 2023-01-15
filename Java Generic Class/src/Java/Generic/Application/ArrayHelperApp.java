package Java.Generic.Application;
import Java.Generic.Util.ArrayHelper;
public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] names = {"Joankii"};
        Integer[] numbers = {10,20,30,40,50};

        System.out.println(
                ArrayHelper.count(names)
        );

        System.out.println(
                ArrayHelper.count(numbers)
        );
    }
}
