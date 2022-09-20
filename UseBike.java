package day17collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;
public class UseBike {
	public static void main(String[] args) {
		Bike b1 = new Bike("tvs", 10000, "black", "Tn50 x8518");
		Bike b2 = new Bike("hero", 200000, "white", "Tn50 a2434");
		Bike b3 = new Bike("yamaha", 150000, "red", "Tn50 d3454");
		Bike b4 = new Bike("bajaj", 125000, "green", "Tn60 g8923");
		Bike b5 = new Bike("bmw", 130000, "yellow", "Tn40 h8934");
		HashMap<String, Bike> b = new HashMap<>();
		b.put(b1.getNoPlate(), b1);
		b.put(b2.getNoPlate(), b2);
		b.put(b3.getNoPlate(), b3);
		b.put(b4.getNoPlate(), b4);
		b.put(b5.getNoPlate(), b5);
		for (String x : b.keySet()) {
			System.out.println(b.get(x).getBrand());
		}
		b.keySet().forEach(x -> System.out.println(b.get(x)));
		b.keySet().forEach(x -> System.out.println(x));
		b.keySet().forEach(c -> System.out.println(b.get(c).getColor()));
		int max=0;
		for (Bike x : b.values()) {
			
			if(x.getPrice()>max) {
				max=x.getPrice();
			}	
			}
			System.out.println(max);
		
		
		
		HashMap<String, Bike> g = new HashMap<>();
		for (String x : b.keySet()) {
			if (b.get(x).getColor().equalsIgnoreCase("green")) {
				
			g.put(x, b.get(x));
			System.out.println(g.get(x));

		}
		}
		Iterator<Bike>d=b.values().iterator();
		while(d.hasNext()) {
			if(d.next().getColor().equals("white")) {
				d.remove();
				
			}
		}
		System.out.println(b);
		Iterator<String> h=b.keySet().iterator();
		while(h.hasNext()) {
			
			if(b.get(h.next()).getBrand().equals("yamaha")) {
				h.remove();
			}
		}
		System.out.println(b);
		
	}
}