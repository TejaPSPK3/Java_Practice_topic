package ngt_java_assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		System.out.println("States in India:");
        map.put(1, "1. delhi");
        map.put(2, "2. ap");
        map.put(3, "3. telangana");
        map.put(4, "4. goa");
        map.put(5, "5. tamilnadu");

        List<Integer> keyList = new ArrayList<>(map.keySet());
        List<String> valueList = new ArrayList<>(map.values());

        System.out.println("No of States(Key List): " + keyList);
        System.out.println("States List(Value List): " + valueList);
	}
}
