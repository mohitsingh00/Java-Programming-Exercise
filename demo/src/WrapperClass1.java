public class WrapperClass1 {

	public static void main(String[] args) {

		int a = 10;
		
		//Converting int into Integer explicitly
		Integer i = Integer.valueOf(a);
		
		//Autoboxing -> Now, compiler will write Integer.valueOf(a) internally
		Integer j = a;
		System.out.println(j);
		
		//Converting Integer to int explicitly
		Integer x = 7;
		int y = x.intValue();
		
		//Unboxing, now compiler will write a.intValue() internally 
		int z = x;
		System.out.println(y);
		
	}
}