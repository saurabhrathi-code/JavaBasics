package basics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Apple","Banana","orange","grape");
        Map<Integer,String> map = myList.stream().collect(Collectors.toMap(x -> myList.indexOf(x), x->x));
        //.toMap(myList::indexOf, x->x));
        map.forEach((key, value)-> System.out.println(key+ "->" + value));
    }
}
