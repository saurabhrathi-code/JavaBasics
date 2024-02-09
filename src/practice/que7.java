package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class que7 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean, List<Integer>> listMap = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("even"+listMap.get(true));
        System.out.println("even"+listMap.get(false));






    }
}
