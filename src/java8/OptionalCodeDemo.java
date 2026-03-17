package java8;

import java.util.Optional;

public class OptionalCodeDemo {

	public static void main(String[] args) {
		
	//1.creating optional class with non-null value	
	Optional<String>optional1=Optional.of("Mahi");
	//System.out.println(optional1);
	System.out.println(optional1.get());
	
	
	
	//2.creating an empty optional
	Optional<String>optionalEmpty=Optional.empty();
	System.out.println("optionalEmpty: "+optionalEmpty);
	//System.out.println(o2.get());
	
	
	//3.creating an optional with potentially null value
	Optional<String>optionalNullEmpty=Optional.ofNullable(null);
	//Optional<String>o3=Optional.ofNullable("M");
	System.out.println("optionalNullEmpty: "+optionalNullEmpty);
	
	
	//4.check if optional contains value
//	Optional<String>OptionalContainsValue=Optional.ofNullable("Prince");
	Optional<String>OptionalContainsValue=Optional.ofNullable(null);
	if(OptionalContainsValue.isPresent()) {
		System.out.println("Present: "+OptionalContainsValue.get() );
	}
	else{
		System.out.println("Not present");
	}
	

	
	//5.Default value with optional is empty

	 Optional<String>optionalDefaultValue=Optional.ofNullable(null);
	//Optional<String>optionalDefaultValue=Optional.ofNullable("Prince");
	String optionalDefault=optionalDefaultValue.orElse("Default");
	System.out.println(optionalDefault);
	
	
	//6.Default value supplier if optional is empty
	
	Optional<String>optionalDefaultSupplier=Optional.ofNullable(null);
	//Optional<String>optionalDefaultSupplier=Optional.ofNullable("Prince");
	String optionalDefaultSup=optionalDefaultSupplier.orElseGet(()->"Default supplier");
	System.out.println(optionalDefaultSup);
	
	
	//7.Throw Exception if optional is empty
	
	
	
	}

}
