import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>();
		list.add("one");
		list.add("Two");
		list.add("Three");
		
		for(int i = 0; i < 10; ++i)
			list.add("List"+i);
		
		String str = list.get(1);
		System.out.println(str);

	}

}
