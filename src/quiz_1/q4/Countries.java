package quiz_1.q4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Countries {

	public static void main(String[] args) {
		List<String> countries = new ArrayList<>();
		countries.add("Pakistan");
		countries.add("Turkey");
		countries.add("Azerbaijan");
		countries.add("Indonesia");
		countries.add("Afghanistan");
		countries.add("Palestine");
		
//		Syscdtem.out.println(countries);
		
		Iterator itr = countries.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List<String> countryStartsWithA = countries.stream()
				.filter(c -> c.startsWith("A"))
				.collect(Collectors.toList());
		
		System.out.println(countryStartsWithA);
		

	}

}
