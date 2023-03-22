import java.util. *;
class ArrayDemo{

	public static void main(String...args){
	
		    int arr [] = { 15, 8, 9,2, 11, 4 };
			
	System.out.println("Array before sorting::");
				 
			 for (int i=0 ; i < arr.length; i++ ){
				     System.out.println(arr[i] +  "" );

			 }
			 Arrays.sort (arr);
  


System.out.println("Array after sorting::");
				 
			 for (int i=0 ; i < arr.length; i++ ){
				     System.out.println(arr[i] +  "" );

			 }
			 

	}
}