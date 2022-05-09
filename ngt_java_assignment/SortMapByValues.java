package ngt_java_assignment;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapByValues {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 LinkedHashMap<String, String> skillsets = new LinkedHashMap<>();
		 skillsets.put("america", "big");
		 skillsets.put("india", "telugu");
		 skillsets.put("japan", "japanies");
		 skillsets.put("russia", "english");
		 skillsets.put("canada", "pureEnglish");		    
		 Map<String, String> result = sortMap(skillsets);
		    for (Map.Entry entry : result.entrySet()) 
		    {
		      System.out.print("Employee name(Key): " + entry.getKey());
		      System.out.println("  Employee Skillset(Value): " + entry.getValue());
		    }
		  }

		  public static LinkedHashMap<String, String> sortMap(LinkedHashMap<String, String> map) {
		    List <Entry<String, String>> capitalList = new LinkedList<>(map.entrySet());
		    Collections.sort(capitalList, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));
		    LinkedHashMap<String, String> result = new LinkedHashMap<>();

		    for (Map.Entry<String, String> entry : capitalList) 
		    {
		      result.put(entry.getKey(), entry.getValue());
		    }

		    return result;
	}
}
