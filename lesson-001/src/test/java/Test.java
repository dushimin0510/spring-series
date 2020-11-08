import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    @org.junit.Test
    public void Test(){
        List<String> list = new ArrayList<>();
        list.add("du");
        System.out.println(list);
        Map<String, List<String>> map = new ConcurrentHashMap<>();
        map.put("hhh", list);
        System.out.println(map);
        list.add("new name");
        System.out.println(map);
    }
}
