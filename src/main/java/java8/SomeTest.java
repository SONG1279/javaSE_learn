package java8;

import com.anxpp.designpattern.Composite.File;
import org.junit.Test;

import java.util.function.Consumer;

public class SomeTest {

    @Test
    public void aboutConsumer() {
        Consumer<Integer> consumer = x -> {
            int a = x + 2;
            System.out.println(a);// 12
            System.out.println(a + "_");// 12_
        };
        consumer.accept(10);
    }

    @Test
    public void functionalInterface() {
        //Convertor<String, Integer> convertor = from -> Integer.valueOf(from);
        Convertor<String, Integer> convertor = Integer::valueOf;
        System.out.println(convertor.convert("123"));
    }

}
