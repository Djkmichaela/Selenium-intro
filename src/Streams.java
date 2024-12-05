import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lesson 115

		// streams only work with lists so i need to convert the array into a list first
		// to be able to use the stream

		ArrayList<String> people = new ArrayList<String>();
		people.add("Babalwa");
		people.add("Zikhona");
		people.add("Slimgirl");
		people.add("Lisa");
		people.add("Zolekha");
		people.add("Mahle");
		people.add("Khanyi");
		people.add("Ziyanda");
		// the below finds names that contain the combination of wa
		 people.stream().filter(s -> s.contains("wa")).forEach(s->System.out.println("The found name is " +s));
		

		// display names that ends with 'a' and sort them

		people.stream().filter(s -> s.endsWith("a")).sorted().forEach(s -> System.out.println(s));

		// display names that have more than 5 charactors and in sorted order
		people.stream().filter(s -> s.length() > 5).sorted().forEach(s -> System.out.println(s));

		// display names that have more than 5 charactors and in sorted order limited to
		// two names
		people.stream().filter(s -> s.length() > 5).limit(2).sorted()
				.forEach(s -> System.out.println(s + " the names"));

		// find a matching element in the list
		// anyMatch method returns a boolean
		boolean nkdkf = people.stream().anyMatch(s -> s.equalsIgnoreCase("Mahle"));
		System.out.println(nkdkf+" anymatch method used here");

		// find all the names that ends with a and display them in sorted order
		people.stream().filter(s -> s.startsWith("Z")).sorted().forEach(s -> System.out.print(s + "\n"));

		// find all the names that ends with a display them in a sorted manner and in
		// uppercase
		people.stream().filter(s -> s.endsWith("a")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// display unique values in the array above using the stream in a sorted order
		// first need to convert the array into an array list
		Integer[] Names = { 1, 33, 33, 2, 4, 5, 6, 6, 7, 4 };

		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, Names);

		list.stream().distinct().sorted().forEach(s -> System.out.println(s));
		
		
		
		// declare a stream and display the items in it
		
		Stream.of("Monday","Wednesday","Tuesday","Thursday","Friday","Saturday").filter(s->s.endsWith("y")).sorted().forEach(s->System.out.println(s));
		
		// merge two lists using a stream and display them
		
		ArrayList<String> days = new ArrayList<String>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Friday");
		
		ArrayList<String> months = new ArrayList<String>();
		months.add("January");
		months.add("Febuary");
	
		Stream<String> times = Stream.concat(days.stream(), months.stream());
		
		times.sorted().forEach(s->System.out.println(s));
		
		// when you want to display a specific element in the stream using index you will need to convert the stream into a list then use the get(i) method
		// get() index method is only used in a list not in a stream
		List<String> timing = Stream.of("Wednesday","Monday","Tuesday","Thursday","Friday","Saturday").filter(s->s.endsWith("y")).sorted()
		.collect(Collectors.toList());
	System.out.println("timing list " +	timing.get(0));
	
	timing.forEach(t->System.out.println(t));
		
		
		
		//method filter can be of type element but method map is of type boolean

	}

}
