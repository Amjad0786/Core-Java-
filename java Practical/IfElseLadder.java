class IfElseLadder{

  public static void main( String...args) throws Exception{

      int exp = 13;

	  InputStreamReader isr = new InputStreamReader(System.in);
	  BufferedReader br = new BufferedReader(isr);
	  String str = br.readLine ( );


      if (exp >= 0 && exp <= 2){
          System.out.println("Associate Engineer" ); }

      else if (exp >= 2 && exp <=5){
            System.out.println("Software Engineer"); }

     else if (exp >= 5 && exp <= 7) {
		 System.out.println("Sr. Software Engineer"); }

	 else if  (exp >= 7 && exp <=10) {
		 System.out.println("Manager"); }
		 else  {
			 System.out.println("Not found"); }


  }
}

