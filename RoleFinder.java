 import java .io.*;
	 class RoleFinder{
	 public static void main ( String...args) throws Exception{
		  
		  InputStreamReader isr = new InputStreamReader (System.in);
		  BufferedReader br = new BufferedReader (isr);
		  String str = br.readLine ();
		  int exp = Integer .parseInt (str);

		   

		   if (exp >=0 && exp <= 2){
			    System.out.println("Assciate Engineer");}
           else if (exp >= 3  &&  exp <= 5){
			   System.out.println("Software Engineer"); }
			   else if (exp >= 6 && exp<= 9){
				   System.out.println("sr.Software Engineer" ); }
				   else {
					   System.out.println( "Role Not Find");}
	 }
			   
           
           
		   
		   
}