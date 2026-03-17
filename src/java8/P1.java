package java8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P1 {
	public static void main(String[] args) {

		List<String>fruits=Arrays.asList("Mango","kiwi","litchi","guava","custardapple");

		//1.sort them in ascending order by using their length
		fruits.sort(Comparator.comparingInt(String::length));
		System.out.println("Fruits: "+fruits);


		//2.print the list in descending order
		List<Integer>number=Arrays.asList(11,12,1,5,6,8);
		number.sort(Comparator.reverseOrder());
		System.out.println("Number: "+number);



		List<Employee> emp=Arrays.asList(
				new Employee(1,"mahesh",25,80000),
				new Employee(2,"prince",23,100000),
				new Employee(3,"jogi",21,90000),
				new Employee(4,"durga",27,85000),
				new Employee(4,"mitesh",25,85000)
				);

		//3.sort the list of employees based on their age in ascending order
		emp.sort(Comparator.comparingInt(Employee::getAge));
		System.out.println(emp);
		
		
		//4.sort the list of employees based on their age in ascending order.if ages are same then compare by salary
		emp.sort(Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getSalary));
		System.out.println("Emp: "+emp);
		
		
		//5.fruits with index position sorting
	   fruits.sort(Comparator.comparingInt(a->a.indexOf("a")));
	   System.out.println("fruits with index position sorting: "+fruits);


      //6.sort a list of strings ignoring case-sensitivity using a case-sensitivity manner
	   
      List<String>fruitsMix=Arrays.asList("apple","KIwi","baNaNA","pinAPple");
      Comparator<String>caseInsensitiveComp=String.CASE_INSENSITIVE_ORDER;
      fruitsMix.sort(caseInsensitiveComp);

      System.out.println(fruitsMix);


      //7.sort a list of dates in ascending order using comapring() with lambda exp
      List<LocalDate>dates=Arrays.asList(
    		  LocalDate.of(2025, 10, 12),
    		  LocalDate.of(2025, 10, 11),
    		  LocalDate.of(2025, 10, 8),
    		  LocalDate.of(2025, 9, 12)
    		  );

      dates.sort(Comparator.comparing(date->date));
      System.out.println(dates);


	}
}
