import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ArrayList<String> ar=new ArrayList<>();
		
		ar.add("AA");
		ar.add("BB");
		ar.add("CC");
		ar.add("CC");
		
		for(String s:ar)
		{
			System.out.println(s);
		}
		
		ar.add(1, "PP");
		ar.remove(2);
		
		
		for(String s:ar)
		{
			System.out.println(s);
		}*/
		
		
/*HashSet<String> ar=new HashSet<>();
		
		ar.add("AA");
		ar.add("BB");
		ar.add("CC");
		ar.add("CC");
		
		for(String s:ar)
		{
			System.out.println(s);
		}
		
		ar.add("DD");
		
		
		for(String s:ar)
		{
			System.out.println(s);
		}*/
		
		/*// Queue
		ArrayDeque<String> ar=new ArrayDeque<>();
		
		ar.addLast("AA");
		ar.addLast("BB");
		ar.addLast("CC");
		ar.addLast("CC");
		
		for(String s:ar)
		{
			System.out.println(s);
		}
		
	String s1=	ar.removeFirst();
		
		
		for(String s:ar)
		{
			System.out.println(s);
		}
		*/
		
		/*// // Stack
		ArrayDeque<String> ar=new ArrayDeque<>();
		
		ar.push("AA");
		ar.push("BB");
		ar.push("CC");
		ar.push("CC");
		
		for(String s:ar)
		{
			System.out.println(s);
		}
		
	String s1=	ar.pop();
		
		
		for(String s:ar)
		{
			System.out.println(s);
		}
		*/
		
		
		HashMap<String,String>  hm=new HashMap<>();
		
		hm.put("India", "Delhi");
		hm.put("Pakistan", "Islamabad");
		hm.put("Bangladesh", "Dhaka");
		hm.put("SriLanka", "Colombo");
		hm.put("India", "New Delhi");
		
		String c=hm.get("India");
		
		Set<String>  keys=hm.keySet();
		
		for(String k:keys){
			
		System.out.println(k + " "+hm.get(k));	
		}
		
		
		
	//	System.out.println(c);
		
		
		
		
	}

}
