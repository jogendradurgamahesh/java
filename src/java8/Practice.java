package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {


		List<Integer>l=Arrays.asList(1,2,3,4,5,3);

		// 1.find sum of digits
		int s=l.stream().mapToInt(Integer::intValue).sum();
		System.out.println(s);


		//2.find max
		int m=l.stream().max(Comparator.naturalOrder()).get();
		System.out.println(m);




		List<String>fruits=Arrays.asList("Banana","Berry","Bonda","Apple");


		//3.given a list of strings,write a program to count no. of strings that starts with specific character using streams
		long c= fruits.stream().filter(f->f.startsWith("A")).count();
		System.out.println(c);

		//4.change the string to uppercase
		List<String>upper=fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upper);	
		//fruits.stream().map(String::toUpperCase).forEach(System.out::println);



		//5.list of integers write a program to filter out even no's
//		long evenOutput=l.stream().filter(n->n%2==0).count();
//		System.out.println(evenOutput);
		l.stream().filter(n->n%2==0).forEach(System.out::println);



		//6.find avg of floating numbers in a list
		List<Double>floatnums=Arrays.asList(1.1,1.2,1.3,1.4,1.5);
//		OptionalDouble res= floatnums.stream().mapToDouble(Double::doubleValue).average();
		Double res= floatnums.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
		System.out.println(res);

		//7.concatenated all the strings using lists
		String  concatenatedString= fruits.stream().collect(Collectors.joining("::"));
		System.out.println(concatenatedString);




		//8.remove duplicates elements in a list

		List<Integer> dup=  l.stream().distinct().collect(Collectors.toList());
		System.out.println(dup);
		//       l.stream().distinct().forEach(System.out::println);



		//    //9.
		//    List<Person>people=Arrays.asList(
		//    		  new Person("Mahi",22),
		//    		  new Person("Prince",26),
		//    		  new Person("Jogi",24)
		//     );
		//
		//    people.stream().sorted(Comparator.comparing(Person::ge))


		//10.check if all elements in a list satisfy a condition

		List<Integer>satisfyCond=Arrays.asList(2,4,6);
		boolean s2= satisfyCond.stream().allMatch(i->i%2==0);
		System.out.println(s2);


		//11.given a sentence,find and print freq  of each word
		String sentence="Java is lang. Java is vast";
	Map<String,Long>freqCount=	Arrays.stream(sentence.split("\\s+")).collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
	System.out.println(freqCount);	

	
	//12.given list of integers and find out nos starting with 1.
	List<Integer>list=Arrays.asList(1,2,3,11,13,15,21);
List<Integer>startsWithOne=	list.stream().filter(n->String.valueOf(n).startsWith("1")).collect(Collectors.toList());
	System.out.println(startsWithOne);
	
	
	//13.given a list of names,group them by first letter and count the no of names in group
	String[] names= {"Mahesh","Mitesh","Shiv","Mamu","Sampath","Prince"};
Map<Character,Long>res1=Arrays.stream(names).collect(Collectors.groupingBy(w->w.charAt(0),Collectors.counting()));
	System.out.println(res1);
	
	
	//14.find and print dup elements if it have multiple entries
//	int[] arr= {1,2,3,4,1,3,2};
//	Arrays.stream(arr).boxed()
//	.collect(Collectors.groupingBy(b->b,Collectors.counting()))
//	.entrySet().stream()
//	.filter(e->e.getValue()>1)
//	.forEach(e->System.out.println(e.getKey()));
//    
	
	
//	//15.remove dups in a list
//	List<Integer> removeDups=Arrays.asList(1,2,3,4,1,2);
//	removeDups.stream().distinct().forEach(System.out::println);
	
	//15.remove dups in a array
	int[] removeDups= {1,5,2,3,4,1};
int[] newArr=Arrays.stream(removeDups).distinct().toArray();
System.out.println(Arrays.toString(newArr));



//16. given a list of words,filter and print palindromes
//List<String>strings=List.of("level","hello","radar","common");
List<String>strings=Arrays.asList("level","hello","radar","common");
List<String>pali= strings.stream().filter(str->str.equals(new StringBuilder(str).reverse().toString())).collect(Collectors.toList());
System.out.println(pali);


//17.merge two sorted arrays into a single sorted arrays
int[] m1= {1,2,3,5};
int[] m2= {4,6};
int[] sorted= IntStream.concat(Arrays.stream(m1), Arrays.stream(m2)).sorted().toArray();
System.out.println(Arrays.toString(sorted));


//18.given two lists of strings,concatenate them and remove dup
List<String>l1=List.of("Mahesh","prince","jogi");
List<String>l2=List.of("Mahesh","Mitesh");
List <String>lr= Stream.concat(l1.stream(),l2.stream()).distinct().collect(Collectors.toList());
System.out.println(lr);


//19.given a list of strings,sort them according to increasing order of their length
List<String>ll=Arrays.asList("Mango","kiwi","Banana","pear","apple","custard");
ll.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);


//20.how do you find intersection of two arrays of integers

int[] arr1 = {1, 2, 3, 4, 5};
int[] arr2 = {3, 4, 5, 6, 7};
Arrays.stream(arr1).filter(x->Arrays.stream(arr2).anyMatch(y->y==x)).distinct().forEach(System.out::println);


	






	}

}
