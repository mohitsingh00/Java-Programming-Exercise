package Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;  
public class FlatMap 
{  
	public static void main(String args[])   {
		
		//creating ArrayList      
		List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");  
		List<String>  productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");  
		List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");  
		List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable"); 
		
		//adding elements to the list
		List<List<String>> Product = new ArrayList<>();
		Product.add(productlist1);
		Product.add(productlist2);
		Product.add(productlist3);
		Product.add(productlist4);
		
		//creating a list of all products  
		List<String> listOfAllProducts = new ArrayList<>();
		
		//for each loop iterates over the list  
		for(List<String> pro: Product)
		{
			for(String p : pro)
			{
				//adds all products to the list  
				listOfAllProducts.add(p);
			}
		}
		
		System.out.println("List Before Applying mapping and Flattening: ");  
		//prints stream before applying the flatMap() method  
		System.out.println(listOfAllProducts);
		
		System.out.println();
		
		//creats a stream of elemnts using flatMap()
		List<String> flatMapList = Product.stream().flatMap(p -> p.stream()).collect(Collectors.toList());
		
		System.out.println("List After Applying Mapping and Flattening Operation: ");   
		//prints the new stream that we get after applying mapping and flattening   
		System.out.println(flatMapList);
	}
}
