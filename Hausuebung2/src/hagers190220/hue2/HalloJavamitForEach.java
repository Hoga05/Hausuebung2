package hagers190220.hue2;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavamitForEach {
    public HalloJavamitForEach() {
        List<String> list = new ArrayList<>();

        list.add("Hallo");
        list.add("Welt");
        list.add("Test123");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------");


        list.forEach((String s) -> System.out.println(s));

        System.out.println("-------");

        Consumer<String> consumer = (String s) -> System.out.println(s);

        consumer.accept("Hallo Welt");

        System.out.println("-------");

        list.forEach(System.out::println);

    }
}
