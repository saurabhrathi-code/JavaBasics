package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class que9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("saurabh", "Aman", "Ankit");

        Map<Integer,String> toListConv = list.stream().collect(Collectors.toMap(x->list.indexOf(x), x->x));

        //System.out.println(toListConv);

        toListConv.forEach((k,v)-> System.out.println("key:"+k +" value:"+v));
    }
}
