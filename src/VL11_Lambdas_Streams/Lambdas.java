package VL11_Lambdas_Streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import VL05_JAVAIO_Streams_Exceptions.A29.Angestellter;

public class Lambdas {

	public static void main(String[] args) {
	
		//Utils
		int max = 10;
		int min = 0;
		int range = max-min+1;
		
		//Integer List
		List<Integer> numbers = new LinkedList<Integer>();
		for(int i = 1 ; i < 5 ; i++) {
			numbers.add(i);
		}
		//(int) (Math.random()*range)+min
		//String List
		List<String> strings = new LinkedList<String>();
		strings.add("Red");
		strings.add("Blue");
		strings.add("Yellow");
		strings.add("Reed");
		
		//Object List
		List<Auto> autos = Arrays.asList(
				new Auto("BWM",100),
				new Auto("Mercedes",200),
				new Auto("Opel",300),
				new Auto("VW",20));
		
		System.out.println("Autos sortiert: " +filterAndMapObject(autos));
		
		System.out.printf("%nMinimum = %d%n",minimumInteger(numbers));
		//numbers.sort(Integer::compare);
		//System.out.println("Test Minimum = " + numbers.get(0));
		
		System.out.println("Odd or Even: " +oddOrEvenString(numbers));
		
		System.out.println("String created out of chars: " +createString());
		
		System.out.println("Filtered String: " +searchString(strings));
		
		System.out.println("String Uppercase: "+stringToUpperCase(strings));
		
		//Stream Generator
		streamStringGenerator();
		streamNumberGenerator();
		
		//findAny
		System.out.println("Searching for number 3's position: "+findNumber(3,numbers));
		
		
		List<Angestellter> liste = new LinkedList<>();
        liste.add(new Angestellter(1,"Meier","Essen", 4000));
        liste.add(new Angestellter(2,"Obermeier","Essen", 5000));
        
        
        String[] feld = {"c++", "java", "javascript"};
        
        Stream<String> stream = Stream.of(feld).map(s -> { System.out.println("Map");return s.toUpperCase();});
        stream.forEach(System.out::println);
        
        System.out.println("Test: " +sum(numbers));
		
	}
	
	public static int sum(List<Integer> l ) {
		return l.stream().reduce(1, (a,b) -> a*b);
	}
	
	public static int minimumInteger(List<Integer> l) {
		l.stream().forEach(a -> System.out.print(a +","));
		return l.stream().min((a,b) -> Integer.compare(a, b)).get();
	}
	
	public static String oddOrEvenString(List<Integer> l) {
		return l.stream().map(a -> a%2 == 0 ? "even " +a : "odd "+a).collect(Collectors.joining(","));
	}
	
	public static String createString() {
		return Stream.of("A","B","C").collect(Collectors.joining());
	}
	
	public static String searchString(List<String> strings) {
		//Filter strings, return only Strings with lenght > 2 and starting with "R"
		return strings.stream().filter(a -> a.length() > 2 && a.charAt(0) == 'R').collect(Collectors.joining(","));
	}
	
	public static String filterAndMapObject(List<Auto> l) {
		return l.stream().filter(a -> a.getGeschwindigkeit() >= 200).map(Auto::getName).collect(Collectors.joining(","));
	}
	
	public static String stringToUpperCase(List<String> l) {
		// Lambda ausdruck a->a.toUpperCase() ist das gleiche wie String::toUpperCase
		return l.stream().map(String::toUpperCase).collect(Collectors.joining(","));
	}
	
	public static void streamStringGenerator() {
		Stream.generate(() -> "Hey").limit(20).forEach(System.out::print);
		System.out.println();
	}
	
	public static void streamNumberGenerator() {
		Stream.generate(Math::random).limit(3).forEach(System.out::print);
		System.out.println();
	}
	
	public static int findNumber(int n, List<Integer> l) {
		/*
		Optional<Integer> p = null;
		if ((p = l.stream().filter(a -> a == n).findFirst()).isPresent()) {
			return p.get();
		}
		return -1;
		*/
		return l.stream().filter(a -> a==n).findFirst().orElse(-1);
	}
	
	public static int min(List<Integer> l) {
		return l.stream().min((a,b) -> Integer.compare(a, b)).get();
		//return (int) l.stream().count();
		//return l.stream().max((a,b) -> Integer.compare(a, b)).get(); ODER .min()
		//return l.stream().findFirst().get();
		//return l.stream().anyMatch(a -> a == 3); returns true/false
		//return l.stream().allMatch(a -> a == 3); returns true/false
		//return l.stream().filter(a -> a == 3).findAny().get(); //beliebiges element
		//return l.stream().filter(a -> a == 3).findFirst().get(); //erstes element
		//return l.stream().mapToInt(Integer::intValue).sum(); oder .average();
		//return (int) l.stream().mapToDouble(a -> Double::parseDouble).sum();
	}
}
