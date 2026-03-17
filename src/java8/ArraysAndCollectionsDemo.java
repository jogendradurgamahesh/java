package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysAndCollectionsDemo {

	public static void main(String[] args) {

		//1.sorting an array of integers
		int[] arr1= {4,1,2,3,8,10,9};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));


		//2.checking equality of two arrays
		int[] arr2= {3,4,1,2};
		System.out.println("Equals or not "+Arrays.equals(arr1, arr2));


		//3.find max element in arraylist

		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(4,6,1,2,10,8));
		System.out.println("Max Element "+Collections.max(list));
		System.out.println("Min Element "+Collections.min(list));

		//4.shuffling elements of an arraylist
		ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(4,6,1,2,10,8));
		Collections.shuffle(list1);
		System.out.println("Shuffled list "+list1);

		//5.find frequency of an element in an arraylist

		ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(4,6,4,2,10,8,4,9,4));
		int freq=Collections.frequency(list2, 4);
		System.out.println("Frequency: "+freq);


		//6.converting array to arraylist
		String[] fruits= {"Apple","mango","kiwi","cherry"};
		ArrayList<String>fruitsmix=new ArrayList<>(Arrays.asList(fruits));
		System.out.println("Array "+Arrays.toString(fruits));
		System.out.println("ArrayList "+fruitsmix);


		//7.reversing an array
		String[] fruits1= {"Apple","mango","kiwi","cherry"};
		Collections.reverse(Arrays.asList(fruits1));
		System.out.println("Reversed "+Arrays.toString(fruits1));


		//8.removing all occurences of an element in an arraylist
		ArrayList<Integer>list3=new ArrayList<>(Arrays.asList(4,6,4,2,10,8,4,9,4));
		list3.removeAll(Collections.singleton(4));
		System.out.println(list3);


		//9.copying elements from arraylist to array
		Integer[] arrList=list3.toArray(new Integer[0]);
		System.out.println("Copied Array "+Arrays.toString(arrList));

		//10.remove null values from an arrayList
		ArrayList<String> fruits2= new ArrayList<>(Arrays.asList("Apple","mango","kiwi","cherry",null,"orange",null));
		fruits2.removeAll(Collections.singleton(null));
		System.out.println(fruits2);


        //11.sorting list in revese order
		ArrayList<String> fruits3= new ArrayList<>(Arrays.asList("Apple","man","kiwi","cherry","orange"));
		Collections.sort(fruits3,Collections.reverseOrder());
		System.out.println("Reverse "+fruits3);



	}

}
