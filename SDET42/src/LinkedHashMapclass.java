import java.util.LinkedHashMap;

public class LinkedHashMapclass {

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, String> map=new LinkedHashMap<Integer, String>();
		map.put(10,"hi");
		map.put(20,"hello");
		map.put(10,"hello");
		map.put(5,"bye");
		map.put(3,"hello");
		map.put(null,"abc");
		map.put(null,"abcd");
		map.put(4,null);
		map.put(2,null);
		System.out.println(map);
	}

}
