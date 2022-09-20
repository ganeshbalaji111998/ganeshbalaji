package day17collection2;

import java.util.HashMap;

public class school {
public static void main(String[] args) {
	HashMap<Integer,String>hm=new HashMap<>();
	hm.put(828,"Arun");
	hm.put(829, "Ganesh");
	hm.put(830, "thiru");
	hm.put(831, "Aswin");
	hm.put(832, "gopi");
	hm.put(833, "bharath");
	hm.put(834, "dinesh");
   for(Integer x:hm.keySet()) {
	   System.out.println(x);
   }
   for(String y:hm.values()) {
	   System.out.println(y);
   }
   hm.forEach((x,y)->System.out.println(x+"="+y));
		
	for(Integer c:hm.keySet()) {
		System.out.println(hm.get(c));
	}
	for(String c:hm.values()) {
		System.out.println(c);
	}
}
}
