package hellojava;
import java.util.*;
import java.util.function.Predicate;

public class NumberPlayList {

	public static void main(String[] args) {
		List<Integer> mynumlis = new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			mynumlis.add(i);
		}
		
		Iterator<Integer> itr = mynumlis.iterator();
		while(itr.hasNext())
		{
			Integer i = itr.next();
			System.out.println(i);
		}
		
		mynumlis.forEach(n->{
		System.out.println("For each lambda impl value: "+n.doubleValue());
		});
		
		Predicate<Integer> isEvenFunction = n -> n > 0 && n%2 == 0;
		mynumlis.forEach(n->{
			System.out.println("For each value of "+n+" check for even: "+isEvenFunction.test(n));
		});

	}

}
